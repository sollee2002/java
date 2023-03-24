package com.kh.object;

import com.kh.object.practice.Book;

public class Application02 {

	public static void main(String[] args) {
		Book book = new Book("자바의 정석",20000,0.2,"윤상섭");
		Book book2 = new Book();
		
		
		System.out.println(book2.information());
		System.out.println(book.information());
		System.out.println("========================");
		
		book2.setTitle("C언어");
		book2.setPrice(30000);
		book2.setDiscountRate(0.1);
		book2.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(book2.information());
		
		System.out.println("========================");
		book2.discount();
		book.discount();
		
		
	}

}
