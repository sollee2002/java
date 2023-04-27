package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;
import com.library.vo.Member;

public class MemberDao {
	
	public Member login(String id, String pw) {
		
		Member member = null;
		
		String sql = String.format("select id, name, adminyn, status, grade from member where id='%s' and pw = '%s'",id,pw);

		try (Connection conn = ConnectionUtil.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql);) {

			// 질의결과 결과집합을 member 객체에 담아줍니다
			if(rs.next()) {
				String name = rs.getString(2);
				String adminYN = rs.getString(3);		
				String status = rs.getString(4);
				String grade = rs.getString(5);
				
				member = new Member(id," ",name,adminYN,status,grade);

				ConnectionUtil.close(conn, stmt, rs);
				return member; 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public int insert(Member member) {
		MemberDao dao = new MemberDao();
		
		String sql = String.format("INSERT INTO MEMBER(id,pw,name) VALUES ('%s','%s','%s')"
					,member.getId(),member.getPw(),member.getName());
		
		int res = 0;
			
		try (Connection conn = ConnectionUtil.getConnection();
			 Statement stmt = conn.createStatement(); ) {

				
				res = stmt.executeUpdate(sql);
				return res;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
		
	}
	
	
	/*
	 * 아이디 중복 체크
	 * 중복일 경우 false 리턴
	 */
	public boolean idCheck(String id) {
		
		boolean res = false;
		
		String sql = String.format("SELECT * FROM MEMBER WHERE ID = '%s'", id);
		
		try(Connection conn = ConnectionUtil.getConnection();
			Statement  stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql); ){
			
			//rs.next() = 결과집합이 있으면 true -> !rs.next() 반환
			return !rs.next();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int delete(String id) {
		
		int res = 0;
		String sql = String.format("delete from member where id = '%s'", id);
		
		
		try (Connection conn = ConnectionUtil.getConnection();
			Statement stmt = conn.createStatement(); ) {
			
			res = stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
		
	}
	
	
}
