package com.jungang;

public class bmi {
	
	/**
	 * BMI 구하기
	 */
	
	public static void main(String[] args) {
		//변수 선언
		//타입 변수이름;
		int weight = 50; //정수저장
		double height = 1.6;//실수저장
		
		double bmi;
		bmi = weight/(height*height);
		
		System.out.println("당신의 BMI는 "+bmi+"입니다");
		
	}

}
