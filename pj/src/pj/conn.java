package pj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn {
	
	public static void main(String[] args) {
		conn c = new conn();
	
		c.sqlDate();
	
		
	}
	
	
	
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	

	public void sqlDate() {
		conn.getConnection();
		
		long miliseconds = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(miliseconds);
		System.out.println(date);
	}

}


