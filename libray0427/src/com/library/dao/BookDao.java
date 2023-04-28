package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;

public class BookDao {
	
	public List<Book> getList() {
		
		List<Book> list = new ArrayList<Book>();
		
		String sql = "select * from book order by no";
		
		try (Connection conn = ConnectionUtil.getConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String rentYN = rs.getString(3);
				String author = rs.getString(4);
				
				Book book = new Book (no,title,rentYN,author);
				
				list.add(book);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	/*
	 * 도서등록
	 */
	public int insert(Book book) {
		int res = 0;
		String sql = String.format("insert into book values(SEQ_BOOK_NO.NEXTVAL, '%s', '%s', '%s')"
						, book.getTitle(), book.getRentyn(), book.getAuthor());
		try (Connection conn = ConnectionUtil.getConnection();
			 Statement stmt = conn.createStatement();){
			
			res = stmt.executeUpdate(sql);
			
			//실행될 쿼리를 출력해봅니다
			System.out.println(sql);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	public int delete(int no) {
		int res = 0;
		String sql = String.format("DELETE FROM BOOK WHERE No = %d", no);
		
		try (Connection conn = ConnectionUtil.getConnection();
				 Statement stmt = conn.createStatement();){
				
				res = stmt.executeUpdate(sql);
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		return res;
	}
	
public boolean selStatus(int No, String rentyn) {
		
		String sql = "select * from book where no=? and RENTYN=?";
		
		try (Connection conn = ConnectionUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, No);
			pstmt.setString(2, rentyn);
			
			ResultSet rs = pstmt.executeQuery();
			
			return rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public int update(int no, String rentYN) {
		
		int res = 0;
		String sql = String.format("UPDATE BOOK SET RENTYN = '%s' WHERE NO = %d",rentYN, no);
		
		try (Connection conn = ConnectionUtil.getConnection();
				 Statement stmt = conn.createStatement();){
				
				res = stmt.executeUpdate(sql);
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return res;
	}

	public String getRentyn(int no) {
		String yn = "";
		String sql = String.format("SELECT RENTYN FROM BOOK WHERE NO = %d",no);
		
		try (Connection conn = ConnectionUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)){
				
			//조회된 행이 있는지 확인
				if(rs.next()) {
					yn = rs.getString(1);
					
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		return yn;
	}


}
