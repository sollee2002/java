package com.jungang;

public class Student extends Person {
	
	private int garde;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight, int garde, String major) {
		super(age,height,weight);
		super.name=name;
		this.garde=garde;
		this.major=major;
	}

	@Override
	public String information() {
		return super.information();
	}


	
	

}
