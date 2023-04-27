package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.dao.conn.DBUtil;
import com.library.vo.MemberVo;

public class MemberDao {
	
	public MemberVo login(String id, String pw) {
		
		//매개변수를 ?로 입력
		String sql = "select * from member where id = ? and pw = ?";
		
		try (Connection conn = DBUtil.getConnecion();
			 PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, id); //몇번째 물음표에 값 세팅?, 세팅할 값
			pstmt.setString(2, pw); 
			//prepareStatement를 이용해 sql에 먼저 값 세팅
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString(3);
				String adminYN = rs.getString(4);
				
				MemberVo memberVo = new MemberVo(id,pw,name,adminYN);

				return memberVo; 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public int insertUser(MemberVo memberVo) {
		
		String sql = "insert INTO member values (?,?,?,?)";
		
		try (Connection conn = DBUtil.getConnecion();
			 PreparedStatement pstmt = conn.prepareStatement(sql);){
			
			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN());
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
		
	}

	/**
	 * 데이터베이스에 등록된 사용자 정보를 삭제합니다
	 * 
	 * Statement>
	 * -쿼리 자체를 String 문자열로 넣어주기 때문에 문자가 값으로 들어가는 경우 '' 처리를 해줘야 합니다
	 * 
	 * PreparedStatement>
	 * -Statement 클래스보다 기능이 향상된 클래스
	 * -코드의 안정성과 가독성이 높다
	 * -인자 값으로 전달이 가능
	 * -매개변수를 ?로 설정(?에 '' 처리를 하지 않습니다)
	 * 		setString(index, 값);
	 * 		setInt(index,값);
	 * 
	 * @param id
	 * @return
	 */
	public int deleteMember(String id) {
		
		String sql = "delete from member where id= '" + id + "'";
		
		try (Connection conn = DBUtil.getConnecion();
			Statement stmt = conn.createStatement();) {
			
			int res = stmt.executeUpdate(sql);
			return res;
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	

}
