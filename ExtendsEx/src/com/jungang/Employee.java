package com.jungang;

public class Employee extends Person {
	
	private int salary;
	private String dept;
	
	public Employee() {

	}
	
	//초기화
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		//부모생성자는 첫번째 줄에서 호출
		super(age,height,weight);
		super.name=name;
		//this.name=name; ////protected는 패키지가 달라도 상속관계면 접근 가능
		this.salary=salary;
		this.dept=dept;
	}

	@Override
	public String information() {
		super.information();
		System.out.println("급여: "+getSalary()+"원");
		System.out.println("부서: "+getDept());
		return "";
	}

	public int getSalary() {
		return salary;
	}

	public String getDept() {
		return dept;
	}


}
