package com.libray;

import java.util.ArrayList;
import java.util.List;

public class Libray {
	
	//책 리스트를 생성
	//길이가 자동으로 늘어나면서 자료가 저장됩니다
	private List<Book> booklist = new ArrayList<Book>();
	
	public Libray() {
		
	}
	
	public Libray(List<Book> booklist) {
		//초기화
		this.booklist = booklist;
		
	}
	
	public boolean addBook(String title, String author) {
		//외부로부터 받아온 매개변수를 활용하여 책을 생성
		Book book = new Book(title,author);
		//맨 마지막에 인덱스를 추가하고 객체를 저장
		return booklist.add(book);
	}
	
	
	@Override
	public String toString() {
		//책의 목록을 출력
		int i =0;
		for(Book book : booklist) {
		System.out.println(i+" "+book.toString());
		i++;
		}
		
		return super.toString();
	}
	
	public void remove(int index) {
		Book book = booklist.remove(index);
		System.out.println("삭제되었습니다 "+book.toString());
	}
	
	public void updateBook(int index) {
		/**
		 * 1. 인덱스에 들어있는 책을 꺼내오기
		 * 2. 렌트여부 수정
		 * 3. 책 저장하기
		 */
		
		
		try {			
			Book book = booklist.get(index);
			System.out.println(book.toString());
			
			if(index<=booklist.size()) {
				book.setRent(true);
				booklist.set(index,book);
				System.out.println("대여완료되었습니다");
			}
			
		} catch(IndexOutOfBoundsException e) {
			System.out.println("해당 책이 존재하지 않습니다");			
		}
	}

}
