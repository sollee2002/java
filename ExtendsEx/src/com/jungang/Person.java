package com.jungang;

public class Person {
	
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		
	}
	
	public Person(int age, double height, double weight) {
		this.age=age;
		this.height=height;
		this.weight=weight;		
	}
	
	public String information() {
		
		System.out.println("=====================");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age+"살");
		System.out.println("신장: "+height+"(cm)");
		System.out.println("몸무게: "+weight+"(kg)");
		return "";
	}

}
