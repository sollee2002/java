package com.kh.object.practice;

public class Book {
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String title, int price, double discountRate, String author) {
		this.author=author;
		this.discountRate=discountRate;
		this.price=price;
		this.title=title;
	}
	
	public String information() {
		
		return getTitle()+" "+getPrice()+" "+getDiscountRate()+" "+getAuthor();
	}

	public void discount() {
		System.out.println("도서명 = "+getTitle());
		int discount = getPrice()-(int)(getPrice()*getDiscountRate());
		System.out.println("할인된 가격 = "+discount+"원");
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	

}
