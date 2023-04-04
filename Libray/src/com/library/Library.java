package com.library;

import java.util.ArrayList;

import com.library.dao.DBDao;
import com.library.dao.Dao;
import com.library.dao.FileDao;

import com.library.vo.Book;

public class Library {

	 //도서 리스트 - 메모리(프로그램 종료 시 사라짐)
	 ArrayList<Book> booklist = new ArrayList<>();
	 
	 //데이터의 입출력
	 private Dao dao = null;
	 
	 public Library(String confDao) {
		 if("db".equals(confDao)) {
			 this.dao = new DBDao();
		 }else {
			 this.dao = new FileDao();
			 booklist.add(new Book(1, "책1", "지은이1", false));
			 booklist.add(new Book(2, "책2", "지은이2", false));
			 booklist.add(new Book(3, "책3", "지은이3", false));
			 booklist.add(new Book(4, "책4", "지은이4", false));
		 }
	 }
	
	 /** 
	  * 생성자
	  * 
	  */
	 public Library() {
		 //책의 리스트를 조회(파일또는 DB를 이용해 조회)
		 //책을 생성해서 리스트에 담기
		 //일련번호가 겹치지 않게
		 //데이터베이스를 이용할 경우 번호를 기본키로 사용시 중복된 번호는 입력이 안됨
		 booklist.add(new Book(1, "책1", "지은이1", false));
		 booklist.add(new Book(2, "책2", "지은이2", false));
		 booklist.add(new Book(3, "책3", "지은이3", false));
		 booklist.add(new Book(4, "책4", "지은이4", false));
	 }
	 
	 /**
	  * 신규 도서 추가
	  * @param no
	  * @param title
	  * @param author
	  * @param isRent
	  * @return
	  */
	 public boolean addBook(int no, String title, String author, boolean isRent) {
		//리스트에 책을 추가합니다
		//일련번호가 겹칠 경우 다른 번호에 저장*
		 Book book = new Book();

		 book  = new Book(no, title, author, false); //책 생성
		 booklist.add(book);
		 dao.insertBook(book);
		return true;
		 }
		 
		 //출력 안됨
//		 for(int i=0; i<booklist.size(); i++) { //배열의 크기만큼 반복
//			 if(No != num) { //인덱스 값이 겹치지 않으면
//				 Book book  = new Book(no, author, author, isRent); //책 생ㅅㅇ
//				 booklist.add(book);
//				 dao.insertBook(book);
//				 break;
//			 } else {
//				 num++; //num값 수정
//				 No = num;
//			 }
//		 }
//		 
//		 return true;
//	 }
	 /**
	  * 책 대여
	  * 책의 일련번호를 매개변수로 받아서
	  * 책의 정보를 수정합니다
	  * @param index
	  * @return
	  */
	 public boolean rentBook(int index) {
		 //사용자가 입력한 일련번호가 존재하는 경우
		 for(Book book : booklist) {
			 if(book.getNo()==index) {
				 if(book.isRent()==true) {
					 System.out.println("이미 대여중입니다");
					 break;
				 } 
				 //대여여부 변경
				 book.setRent(true);
				 dao.updatBook(book);
				 return true;
			 } else {
				 System.out.println("해당 책이 존재하지 않습니다");				 
			 }
		 }
		 
		 return false;
	 }
	 
	 /**
	  * 책 삭제
	  */
	 public boolean deleteBook(int index) {
		 for(Book book : booklist) {
			 if(book.getNo()==index) {
				 booklist.remove(book);
				 System.out.println("정상적으로 삭제되었습니다");
				 return true;
			 }
		 }
		 System.out.println("해당 책이 존재하지 않습니다");
		 return false;
	 }
	 
	 /**
	  * 책 반납
	  */
	 public boolean returnBook(int index) {
		 for(Book book : booklist) {
			 if(book.getNo()==index) {
				 if(book.isRent()==false) {
					 System.out.println("반납가능한 도서가 아닙니다");
					 break;
				 } 
				 book.setRent(false);
				 return true;
			 }
	 }
		 System.out.println("해당 책이 존재하지 않습니다");
		 return false;
	 }
	 
	 //리스트 정보를 출력합니다
	 public void info() {
		 System.out.println("========================");
		 //리스트를 반복하여
		 for(Book book : booklist) {
			 book.info(); //책 정보 출력
		 }
	 }
	 
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
		Library lib = new Library("db"); //라이브러리 생성
		
		System.out.println("리스트=======");
		lib.info(); //리스트 출력

		System.out.println("추가=======");
		lib.addBook(1, "책5", "지은이5", false); //책 추가
		lib.info(); //리스트 출력
	
		System.out.println("대여=======");
		lib.rentBook(1); //도서 대여
		lib.info(); //리스트 출력

		System.out.println("대여2=======");
		lib.rentBook(1); //도서 대여
		lib.info(); //리스트 출력
		
		System.out.println("삭제=======");
		lib.deleteBook(4); //도서 삭제
		lib.info(); //리스트 출력
		
		System.out.println("반납=======");
		lib.returnBook(3); //도서 반납
		lib.info(); //리스트 출력
	 
	 
	 
	 
	 }
	

}
