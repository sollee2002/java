package com.ex;

public class Student extends Person {

	private int grade;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight,
			int grade, String major) {
		super(age,height,weight);
		super.setName(name);
		this.grade=grade;
		this.major=major;
	}

	@Override
	public String information() {
		System.out.println(super.information());
		return "학년: "+getGrade()+"학년 전공: "+getMajor();
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
	
	
	
}
