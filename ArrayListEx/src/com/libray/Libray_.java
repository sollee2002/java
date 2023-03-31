package com.libray;

import java.util.ArrayList;
import java.util.List;

public class Libray_ {
	
	List<Book> booklist = new ArrayList<Book>();

	public Libray_(List<Book> booklist) {
		this.booklist = booklist;
	}
	public Libray_() {
	}
	
	/**
	 * 책 추가
	 * @param title
	 * @param author
	 */
	
	public void addBook(String title, String author) {
		Book book = new Book(title,author); 
		booklist.add(book);
	}
	
	@Override
	public String toString() {
		
		String res = "";
		for(Book book : booklist) {
		 res += book.getTitle()+"/"+book.getAuthor()+"/"+book.isRent()+"\n";
		 System.out.println(res);
		}
		return toString();
	}
	
	

}
