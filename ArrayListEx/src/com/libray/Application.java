package com.libray;

public class Application {
	
	public static void main(String[] args) {
		
		Libray lib = new Libray();
		
		//책 추가
		lib.addBook("책1", "지은이1");
		lib.addBook("책2", "지은이2");
		lib.addBook("책3", "지은이3");
		
		//책 정보출력
		System.out.println("현재 책 목록================");
		lib.toString();
		
		//책 삭제
		System.out.println("삭제할 책 변호를 선택해주세요");
		lib.remove(0);
		
		//책 정보출력
		System.out.println("현재 책 목록================");
		lib.toString();
		
		//책 대여: book.isRent == true
		System.out.println("대여할 책을 선택해주세요");
		lib.updateBook(1);
		//검증: 책 목록의 사이즈보다 큰 값이 입력되었을 때 -> 다시입력
		
		//책 정보출력
		System.out.println("현재 책 목록================");
		lib.toString();
		
		
		//1. 책 추가
		//2. 책 삭제
		//3. 책 수정 -정보조회, 책 정보 수정
		

	
	
	
	
	}

}
