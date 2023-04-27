package getConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection_Ex {
	
	public static void main(String[] args) {
		
		System.out.println("conn 생성");
		getConnection();
		
		
		
		
	}
	
	
	public static Connection getConnection () {
		Connection conn = null;
		//DB에 접근하기 위해서 필요한 정보
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jungang";
		String pw = "1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT TO_CHAR(SYSDATE,'YYYY-MM-DD') FROM DUAL");
			
			if(rs.next()) {
				System.out.println("오늘날짜 : "+rs.getString(1)); //getString() 안에 별칭이나 순서로 값을 불러올 수 있다
			} 
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.err.println("오라클 드라이버 로딩 실패");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return conn;
	}

}
