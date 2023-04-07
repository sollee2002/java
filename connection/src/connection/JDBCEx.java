package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCEx {
	
	public static void main(String[] args) {
		JDBCEx jdbc = new JDBCEx();
	
//		jdbc.insert();
//		jdbc.delete();
		jdbc.update();
		jdbc.getList();
	}
	
	public void getList() {	
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		Connection conn;
		
		try {
			//클래스 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//커넥션 얻어오기
			conn = DriverManager.getConnection(url, id, pw);
			
			//쿼리 실행 객체 생성하기
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from book");
			System.out.println(rs.getFetchSize());

			List<Book> list = new ArrayList<>();
			//쿼리 실행 후 결과 집합 받아오기
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isrent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editdate = rs.getDate(6);
				
				Book book = new Book(no, title, author, isrent, null, null);
				
				list.add(book);
//				System.out.print(rs.getInt(1));
//				System.out.print(rs.getString(2));
//				System.out.print(rs.getString(3));
//				System.out.print(rs.getString(4));
//				System.out.print(rs.getDate(5));
//				System.out.print(rs.getDate(6));
				System.out.println();
			}
			
			for(Book book : list) {
				System.out.println(book.toString());
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void connectionTest() {
		//데이터 베이스 접근 시 필요한 정보
		//ip, port, sid, 계정정보, 비밀번호
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		Connection conn;
		
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션 얻어오기
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 얻기 성공 "+conn);
			//쿼리 실행
			Statement stmt = conn.createStatement();
			
			//데이터 조회 : executeQuery (쿼리문장 입력)
			//결과 집합  ResultSet
			ResultSet rs = stmt.executeQuery("select count(*) from book");
			rs.next();
			System.out.println("조회결과 "+rs.getInt("count(*)"));
			
			//자원 반납
			rs.close();
			stmt.close();
			conn.close();
			
			//데이터 생성, 수정, 삭제
//		stmt.executeUpdate("");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
}
	
	public void insert() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";

		Connection conn;
		try {
			conn = DriverManager.getConnection(url,id,pw);
			//
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오토커밋 - false 설정");
			conn.setAutoCommit(false);
			
			
			Statement stmt = conn.createStatement();
			int res = stmt.executeUpdate("insert into book(10,'a','a','a',sysdate,sysdate)");
			System.out.println(res+"건 처리되었습니다");
			conn.rollback();
			System.out.println("롤백 되었습니다");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public void delete() {
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";

		Connection conn;
		try {
			conn = DriverManager.getConnection(url,id,pw);
			//
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오토커밋 - false 설정");
			conn.setAutoCommit(false);
			
			
			Statement stmt = conn.createStatement();
			int res = stmt.executeUpdate("delete for Book");
			System.out.println(res+"건 처리되었습니다");
			conn.rollback();
			System.out.println("롤백 되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
	public void update() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			Statement stmt = conn.createStatement();
			int res = stmt.executeUpdate("update book\r\n"
					+ "set isrent ='N'\r\n"
					+ "where no =4");
			
			System.out.println(res+"건 처리되었습니다");
			conn.rollback();
			System.out.println("롤백 되었습니다");
			
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
