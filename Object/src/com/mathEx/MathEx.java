package com.mathEx;

public class MathEx {

	public static void main(String[] args) {
		
		int i = Math.abs(-5); //절댓값 출력
		double d = Math.abs(-5.123); //절댓값 출력
		
		System.out.println("절댓값=================");
		System.out.println(i);
		System.out.println(d);
		
		//소수점 버림
		System.out.println("버림=================");
		System.out.println(Math.floor(d));

		//소수점 올림
		System.out.println("올림=================");
		System.out.println(Math.ceil(d));
		
		//소수점 반올림
		System.out.println("반올림=================");
		System.out.println(Math.round(d));
		
		//최대값 - 둘 중 큰 값 출력
		System.out.println("최대값=================");
		System.out.println(Math.max(5.3, 2.5));
		
		//최소값 - 둘 중 작은 값 출력
		System.out.println("최소값=================");
		System.out.println(Math.min(5.3, 2.5));
		
	}
	
}
