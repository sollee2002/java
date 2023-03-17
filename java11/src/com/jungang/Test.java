package com.jungang;

//한줄 주석 ctrl + /

/*
 * 범위 주석 
 */

/**
 * 
 * @author user 도큐먼트 주석(Java doc을 만들 때 사용할 수 있다)
 *
 */

public class Test {
//프로그램 실행 진입점
public static void main(String[] args) {
	// 콘솔에 출력하는 문장
	System.out.println("테스트");
	
	//명령문의 끝은;(세미콜론)으로 마무리
	//세미콜론이 없으면 컴파일 오류가 발생
	
	//int x : 정수를 저장할 수 있는 변수 x를 선언하겠다
	// = 대입연산자 : 오른쪽에 있는 값을 왼쪽에 대입
	
	int x=1; //변수 x 에 1 대입
	int y=2; //변수 y에 2 대입
	int result = x+y; //변수 result에 x와 y를 더한 값을 대입
	System.out.println("결과:"+result);//변수 result 값 출력
	
	int x2=1, y2=2;
	int result2 = x2+y2;
	System.out.println(result2);
	
	//문자와 숫자의 연산 ("문자"+숫자);
}
}
