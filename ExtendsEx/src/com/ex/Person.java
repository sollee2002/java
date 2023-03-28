package com.ex;

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
		System.out.println("=================================================");
		return "이름: "+getName()+" 나이: "+getAge()+"세 신장: "+getHeight()
					+"(cm) 몸무게: "+getWeight()+"(kg)";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
