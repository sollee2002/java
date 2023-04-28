package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;

public class RentDao {
	
	public String getRentYN(int no) {
		
		String yn = "N";
		String sql = String.format("select 대여여부 from rent where 도서번호 = %s",no);
		
		try (Connection conn = ConnectionUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql); ) {
			
			if(rs.next()) {
				yn = rs.getString(1);				
			}
			return yn;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return yn;
	}
	
	public int insert(String id, int no) {
		int res = 0;
		String sql = String.format("INSERT INTO RENT VALUES (SEQ_대여.NEXTVAL, '%s',%s,'Y','2023-04-28',NULL,TO_DATE('2023-04-28')+7,NULL);",id, no);
		
		try (Connection conn = ConnectionUtil.getConnection();
			Statement stmt = conn.createStatement(); ) {
			
			res = stmt.executeUpdate(sql);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	public int update(int no) {
		int res = 0;
		String sql = String.format("update rent "
				+ "set 반납일 = sysdate 대여여부 = 'n' "
				+ "where 도서번호 = %s", no);
		
		try (Connection conn = ConnectionUtil.getConnection();
			Statement stmt = conn.createStatement(); ) {
			
			res = stmt.executeUpdate(sql);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	

}
