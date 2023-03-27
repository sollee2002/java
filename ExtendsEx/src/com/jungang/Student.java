package com.jungang;

public class Student extends Person {
	
	private int garde;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight, int garde, String major) {
		super(age,height,weight); //생성자 초기화
		super.name=name; //필드값 초기화
		this.garde=garde;
		this.major=major;
	}

	@Override
	public String information() {
		super.information();
		System.out.println("학년: "+garde+"학년");
		System.out.println("전공: "+major);
		return "";
	}


	
	

}
