package com.library.vo;

public class Book {

	private int no; //책 일련번호
	private String title; //책 제목
	private String author; //책 저자
	private boolean isRent; //책 대여여부(T:대여중 F:대여가능)
	//대여자
	//대여일
	
	//생성자
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	public Book() {
	}

	//책의 정보를 출력합니다
	public void info() {
		String str="대여가능";
		
			if(isRent==true) {
				str="대여중";
			}
		System.out.println(getNo()+" "+getTitle()+" "+getAuthor()+" "+str);
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	
	
	
}
