package com.kh.object.practice;

public class StaticSample {
	
	private static String value;

	//setter,getter
	public static String getValue() {
		return value;
	}
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	//value 필드 값을 모두 대문자로 변경
	public static void toUpper() {
		value = value.toUpperCase(); //바뀐 값을 필드에 덮어쓰기
		System.out.println(value);
	}
	
	public static void setChar(int index, char c) {
		//전달받은 인덱스 위치의 value값을 전달받은 문자로 변경하는 static 메서드
		char[] valueArr = value.toCharArray();
		//배열이름[방번호]=값;
		//값을 배열의 방번호에 입력 -> 덮어쓰기
		valueArr[index]=c;
//		for(char charArr : valueArr) {
//			System.out.print(charArr);
//		}
		value=String.valueOf(valueArr); //매개변수의 타입을 String으로 전환해서 필드값 덮어쓰기
		System.out.println(value);
	}
	
	
	//value 필드 값에 기록되어있는 문자 갯수 리턴
	public static int valueLeght() {
		return value.length();
	}
	
	//문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
	public static String valueConcat(String str) {
		return value.concat(str);
	}
	
	
	
	

}
