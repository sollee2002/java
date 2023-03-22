package com.jungang;

public class Main {

	public static void main(String[] args) {
		//Calculator 객체를 생성 후 주소값을 반환
		//타입(클래스명) 변수이름 = new 객체이름();
		Calculator cal = new Calculator();
		System.out.println("===========================");
		
//		System.out.println(cal.name);
//		cal.name="실수계산기";
//		System.out.println(cal.name);
		
		
		//. : 주소접근연산자
		System.out.println(cal.add(5, 7));
		//재사용할 때 변수에 담아주기
		int i = cal.add(5, 7);
		System.out.println("i : "+i);
		

	}

}
