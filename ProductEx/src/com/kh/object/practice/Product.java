package com.kh.object.practice;

public class Product {

	private String id;
	private String name;
	private String site;
	private int price;
	private double tax;
	

	public String getId() {
		return id;
	}
	public String getSite() {
		return site;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	public Product() {
		
	}
	
	
	public Product(String id, String name, String site, int price, double tax) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.site=site;
		this.tax=tax;
	}
	
	public String information() {
		
		return getId()+" "+getName()+" "+getSite()+" "+getPrice()+" "+getTax();
		
	}
	
	public void calc() {
		System.out.println("상품명 = "+getName());
		int res = (int)(getPrice()+getPrice()*getTax());
		System.out.println("부가세 포함 가격 = "+res+"원");
	}


	
}
