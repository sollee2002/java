package com.jungang;

public class Student extends Person {
	
	private int garde;
	private String major;
	
	public Student() {
		
	}
	
	//초기화: 생성자의 매개변수를 필드에 입력합니다
	public Student(String name, int age, double height, double weight, int garde, String major) {
		super(age,height,weight); //생성자 초기화
		super.name=name; //필드값 초기화
		this.garde=garde;
		this.major=major;
	}

	@Override
	public String information() {
		super.information();
		System.out.println("학년: "+getGarde()+"학년");
		System.out.println("전공: "+getMajor());
		return "";
	}

	public int getGarde() {
		return garde;
	}

	public String getMajor() {
		return major;
	}
	

}
