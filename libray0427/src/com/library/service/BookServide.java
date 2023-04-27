package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.Book;

public class BookServide {
	BookDao dao = new BookDao();
	
	public List<Book> getlist() {
		List<Book> list =  dao.getList();
		
		for(Book book : list) {
			System.out.println(book);
		}
		
		return list;
	}
	

}
