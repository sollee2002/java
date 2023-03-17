package com.jungang;

public class OperatorEx {

	public static void main(String[] args) {
		
		int x=5, y=2;

		//증감연산자 ++ -- : 1증가 1감소
		//증감연산자의 위치에 따라 값이 결정된다
		System.out.println("x = "+x);
		System.out.println(++x);
		System.out.println("x = "+x);
		System.out.println(x++);
		System.out.println("x = "+x);
		System.out.println("===================");
		System.out.println(--x);
		System.out.println("x = "+x);
		System.out.println(x--);
		System.out.println("x = "+x);
		
		
		x=10; y=10;
		int result = ++x + 10;//21 연산 수행 전 피연산자 값 증가
		int result2 = y++ + 10;//20 연산 수행 후 피연산자 값 증가
		System.out.println(result);
		System.out.println(result2);
		
		//x=1, ++x + 10
		//(1+x)+10=12
		
		//x=1, x++ + 10
		//1+10=11, x=2
		
		//부정연산자 !
		//true를 false로 false를 true로 
//		if(!true) {
//			
//		}
		
		//비교연산자
		//두 값이 같은지 비교 ==
		if(x==y) {
			System.out.println("1==1");
		}
		//두 값이 다른지 비교 !=
		if(!(x!=y)) {
			System.out.println("x!=y");
		}
		

//		//나머지 연산자 %
//		//두 수의 나눗셈 결과 나머지 값을 반환
//		// -> 홀수인지 짝수인지 구분할때
//		
//		if(x%y == 0) {
//			//연산 결과를 알고 싶으면 직접 출력
//			System.out.println(x%y);
//			System.out.println("짝수");
//		} else {
//			System.out.println(x%y);
//			System.out.println("홀수");
//		}
//		
//		//비교연산자의 연산 결과는 boolean 타입으로 반환
//		boolean result = (x+y)<5;
//		System.out.printf("%d<5\n",(x+y));
//		System.out.println(result);	
	}
	
	
}
