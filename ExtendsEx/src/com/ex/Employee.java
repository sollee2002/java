package com.ex;

public class Employee extends Person {

	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, double height, double weight
			, int salary, String dept) {
		super(age,height,weight);
		super.setName(name);
		this.dept=dept;
		this.salary=salary;
		
	}

	@Override
	public String information() {
		System.out.println(super.information());
		return "연봉: "+getSalary()+"원 부서: "+getDept();
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
	
}
