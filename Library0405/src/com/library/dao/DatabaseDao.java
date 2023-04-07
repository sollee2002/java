package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.connection.DButil;
import com.library.vo.Book;

public class DatabaseDao implements Dao {

	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		
		try {
			Connection conn = DButil.getConnection();
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from book order by no");
			
			while(rs.next()) {
				
			int no = rs.getInt("no");
			String title = rs.getString("title");
			String author = rs.getString("author");
			//Y, N
			//(조건)? 참일때 : 거짓일때
			String isRnet = rs.getString("isRent");
			boolean isRent = ("Y".equals(isRnet))? true : false;
			
			Book book = new Book(no, title, author, isRent);
			list.add(book);
			}
			
			DButil.closeConnection(conn, stmt, rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public boolean listToFile(List<Book> list) {
		return false;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int no) {
		Book book;
		int res = 0;
		
		try {
			Connection conn = DButil.getConnection(); 
			Statement stmt = conn.createStatement();
			
			String sql = "update book set isrent ='Y' where no ="+no;
			res = stmt.executeUpdate(sql);
			System.out.println(res+"건이 처리되었습니다");

			
			DButil.closeConnection(conn, stmt);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public Book insert(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
