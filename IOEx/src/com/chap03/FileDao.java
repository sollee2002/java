package com.chap03;

import java.util.ArrayList;

public class FileDao {
	
	public static void main(String[] args) {
				
		ArrayList<Book> booklist = new ArrayList<>();
		
		booklist.add(new Book(1,"책1","작가1",false));
		booklist.add(new Book(2,"책2","작가2",false));
		booklist.add(new Book(3,"책3","작가3",false));
		
		for(Book list : booklist) {
			System.out.println(list.toString());
		}
		
		
		
	}
	
	
	
	

}
