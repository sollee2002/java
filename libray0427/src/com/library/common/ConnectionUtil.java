package com.library.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * DB Connection을 생성하여 반환합니다
 * @author ksl
 */

public class ConnectionUtil {
	
	public static Connection getConnection() {
		// 접속정보 (ip, port, sid, 계정id, 비밀번호)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "LIBRARY";
		String pw = "1234";
		
		Connection conn = null;
		
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션 생성
			conn = DriverManager.getConnection(url,id,pw);
			//트랜젝션 처리를 위해 자동커밋을 false로 설정
			conn.setAutoCommit(false);
			
//			System.out.println(conn);
//			System.out.println("프로그램 종료");
			
		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 찾을 수 없습니다");
			System.err.println(e.getMessage());
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		return conn;
		
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		
		try {
			if(rs != null && !rs.isClosed()) rs.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
			
		} catch (SQLException e) {
			System.out.println("close() 실패");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		
	}

}
