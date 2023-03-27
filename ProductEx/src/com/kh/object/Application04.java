package com.kh.object;

import com.kh.object.practice.StaticSample;

public class Application04 {
	
	public static void main(String[] args) {
		
		//StaticSample의 value 필드 값을 초기화
		//정적 멤버 접근: 
		//클래스명.필드명 - 필드가 private 임으로 직접 접근 안됨
		//클래스명.메서드명
		
		//private 필드에 값 설정
		StaticSample.setValue("Java");
		System.out.println("vlaue : "+StaticSample.getValue());
		
		//toUpperCase() 활용 필드값을 대문자로 변환
		System.out.print("대문자로 : ");
		StaticSample.toUpper();
		
		//필드.length() 활용 길이 출력
		System.out.println("길이 : "+StaticSample.valueLeght());
		
		//필드.concat("String") 활용 문자열 추가
		System.out.println("문자열 추가 : "+StaticSample.valueConcat("PROGRAMMING"));
		
		//2번째 인덱스의 값인 j를 c로 변경
		System.out.print("J = > C : ");
		StaticSample.setChar(0, 'C');
		
		
		
		
		
		
		
	}
}
