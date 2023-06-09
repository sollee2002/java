package com.library.vo;

public class Book {

	private int no;
	private String title;
	private String rentyn;
	private String author;
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
	public String getRentyn() {
		return rentyn;
	}
	public void setRentyn(String rentyn) {
		this.rentyn = rentyn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//도서를 추가할 경우 도서명과 작가명만 알고 있으면 생성 가능
	public Book (String title, String author) {
		this.title = title;
		this.author = author;
		//신규도서이므로 n
		this.rentyn = "N";
		
		
	}
	
	public Book(int no, String title, String rentyn, String author) {
		this.no = no;
		this.title = title;
		this.rentyn = rentyn;
		this.author = author;
	}
	public Book() {
	}
	@Override
	public String toString() {
		
		String rentYNStr = "";
		//도서가 rentYN = y(대여중)인 경우 대여중으로 표시
		if("Y".equals(getRentyn())) {
			rentYNStr = "대여중";
		} else {
			rentYNStr = "대여가능";
		}
		return getNo() +" "+ getTitle()+" "+ getAuthor()+" "+rentYNStr;
	}
	
	
	
	
}
