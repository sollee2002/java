package com.jungang.objects;

public class ProductEx02 {
	
	private String id;
	private String name;
	private String site;
	private int price;
	private double tax;
	
	public ProductEx02() {
		this("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
	}
	
	public ProductEx02 (String id, String name, String site, int price, double tax) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.site=site;
		this.tax=tax;
		
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

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSite() {
		return site;
	}
	
	public String infotmation() {
		return getId()+" "+getName()+" "+getSite()+" "+getPrice()+" "+getTax();
	}
	
	
	public void calc() {
		System.out.println("상품명 = "+getName());
		System.out.println("부가세 포함 가격 = "+(int)(getPrice()+getPrice()*getTax())+"원");
	}
	
	
	
	
	
	
	
	

}
