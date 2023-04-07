package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDao {
	
	public static void main(String[] args) {
		
		BookDao dao = new BookDao();
		
//		dao.insert(16,"해리포터2","J롤링","N");
//		dao.update();
//		dao.delete(11);
		dao.getlist();
		
	}
	
	//데이터 삽입
	public void insert(int no, String title, String author, String isRent) {
		
		try {
			Connection conn  = DButil.getConnection();
			Statement stmt = conn.createStatement();
			
			//삽입/수정/삭제
			String sql = "insert into book values ("+no+", '"+title+"', '"+author+"', '"+isRent+"', sysdate, null)";
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res+"건 처리되었습니다");
			
			//자원반납
			DButil.closeConnection(conn, stmt);

		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	//데이터 수정
	public void update() {
		
		try {
			Connection conn  = DButil.getConnection();
			Statement stmt = conn.createStatement();
			
			int number = 11; //값 입력
			//삽입/수정/삭제
			String sql = "update book set isrent ='Y' where no ="+number;
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res+"건 처리되었습니다");
			
			System.out.println("대기");
			Thread.sleep(5000);
			
			//자원반납
			DButil.closeConnection(conn, stmt);
			System.out.println("자원반납");
			System.out.println("대기");
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	//데이터 삭제
	public void delete(int index) {
		
		try {
			Connection conn  = DButil.getConnection();
			Statement stmt = conn.createStatement();
			
			//삽입/수정/삭제
			String sql = "delete from book where no = 11";
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res+"건 처리되었습니다");
			
			//자원반납
			DButil.closeConnection(conn, stmt);

		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	//데이터 조회
	public List<Book> getlist() {
		List<Book> list = new ArrayList<>();
		Connection conn = null;
		
		try {
			conn = DButil.getConnection();
			Statement stmt = conn.createStatement();
			
			//질의 결과를 결과집합으로 받아옵니다
			ResultSet rs = stmt.executeQuery("select * from book order by no");
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editdate = rs.getDate(6);
		
				Book book = new Book(no,title,author,isRent,(java.sql.Date) regdate,(java.sql.Date) editdate);
				list.add(book);			
			}
			
			for(Book book : list) {
				System.out.println(book.toString());
			}
			
			DButil.closeConnection(conn, stmt, rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	
}
