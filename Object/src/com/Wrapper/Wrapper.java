package com.Wrapper;

public class Wrapper {

	public static void main(String[] args) {
		//박싱
		//기본타입 -> 참조타입
		//자동형변환
		Integer obj1 = new Integer(100);
		Integer obj2 = 100;
		
		Integer obj3 = new Integer("300");
		Integer obj4 = Integer.valueOf("300");
		
		System.out.println("Integer : 박싱");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		//언박싱
		//참조타입 -> 기본타입
		//깅제형변환
		//*연산 시 자동형변환
		int int1 = obj1.intValue();
		int int2 = (int)obj1;
		
		int int3 = obj4 + 100; //형변환 하지 않아도 연산 시에는 자동형변환 
		
				
		System.out.println("int : 언박싱");
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(int3);
		
		//포장값의 비교
		Integer obj_Integer1 = 300;
		Integer obj_Integer2 = 300;
		System.out.println("비교 결과 : "+(obj_Integer1 == obj_Integer2)); //false 
		System.out.println("비교 결과 : "+(obj_Integer1.equals(obj_Integer2))); //true
		System.out.println("비교 결과 : "+(obj_Integer1.intValue()== 
				obj_Integer2.intValue())); //true
		
		//-128~127 1바이트 내의 범위라면 == 이용시에도 같음
		obj_Integer1 = 100;
		obj_Integer2 = 100;
		System.out.println("비교 결과 : "+(obj_Integer1 == obj_Integer2)); //true
		System.out.println("비교 결과 : "+(obj_Integer1.equals(obj_Integer2))); //true
		System.out.println("비교 결과 : "+(obj_Integer1.intValue()== 
				obj_Integer2.intValue())); //true
		
	}
	
}
