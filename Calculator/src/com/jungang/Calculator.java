package com.jungang;

public class Calculator {
	
	//필드(전역변수)
	//접근제한자를 붙이지 않으면 default(패키지 내에서만 접근 가능)
	private String name;
	//private(접근제한자) : 외부로부터 내부 클래스 보호 가능, 외부에서 값에 접근 X
	
	//생성자의 특징 2가지
	//1. 클래스의 이름과 동일한 이름을 가지고 있다
	//2. 반환타입이 없다

	//new 연산자를 만나서 객체가 생성될 때 실행됩니다
	public Calculator() {
		//생성자는 초기화를 한다
		name="정수계산기";
		System.out.println(name);
		System.out.println("Calculator() 생성자를 실행합니다");
	}

	//접근제한자 반환타입 메서드명 (매개변수타입 변수명) { 반환값; }
	//정수의 합계를 구하는 메서드 두 수를 입력받아 두 수의 합을 반환
	
	/**
	 * 두개의 정수를 입력받아 두 수의 합을 반환합니다
	 * @param num1
	 * @param num2
	 * @return num1+num2
	 */
	
	public int add(int num1,int num2) { //더하기
		
		return num1+num2; 
	
	}
	
	
	
	
	
}
