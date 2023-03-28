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
		System.out.println("이름: "+getName());
		System.out.println("나이: "+getAge()+"살");
		System.out.println("신장: "+getHeight()+"(cm)");
		System.out.println("몸무게: "+getWeight()+"(kg)");
		return "";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

}
