package com.jungang;

public class VariableEx {

	public static void main(String[] args) {
		// 변수의 선언과 초기화
		// int: 정수를 저장
		// double: 실수를 저장
		
		/* 컴파일 오류 -변수를 선언하고 초기화하지 않은 경우 오류 발생
		int value //정수형태의 변수 value 선언
		int result = value + 10;
		*/
		
		//변수 초기화 > 메모리에 변수가 생성되었다
		int value= 10;//정수형태의 변수 value를 선언하고 값을 10으로 초기화
		int result = value+10;
		
		System.out.print("결과를 출력합니다.");
		System.out.println(result); //ln=new line 새로운 줄 추가
		System.out.println("감사합니다");
		
		//타입 변수명 = 값;
		//키와 몸무게를 이용한 BMI 계산
		int w = 60;
		double h = 1.6; //키를 미터로 받아야 함 > 실수형 double 선언
		
		//+연산자가 숫자끼리 나오면 연산
		double bmi = w/(h*h);
		
		//+연산자가 문자열과 함께 나오면 연결
		System.out.println(30+10);
		System.out.println("당신의 BMI는"+bmi+"입니다");
		
		
		
	}

}
