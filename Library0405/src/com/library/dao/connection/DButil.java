package com.library.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DButil {
	/**
	 * DB 커넥션을 생성하여 반환합니다
	 * @return
	 */
	public static Connection getConnection() {
		//접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			//롤백하지 않고 커넥션이 종료되면 커밋됩니다
			//커넥션이 종료될 때 커밋!!
			conn.setAutoCommit(false);
			
		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;

	}
	
	public static void nullBack(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}  
	
	public static void closeConnection(Connection conn, Statement stmt,
			ResultSet rs) {
		
		try {
			if(rs != null && !rs.isClosed()) rs.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void closeConnection(Connection conn, Statement stmt) {
		
		try {
			if(conn != null && conn.isClosed()) conn.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}
