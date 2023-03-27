package com.jungang;

public class Employee extends Person {
	
	private int salary;
	private String dept;
	
	public Employee() {

	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age,height,weight);
		super.name=name;//protected는 패키지가 달라도 상속관계면 접근 가능
		this.salary=salary;
		this.dept=dept;
	}

	@Override
	public String information() {
		return super.information();
	}
	
	
	
	

}
