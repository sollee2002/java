package com.StringEx;

public class StringEx2 {

	public static void main(String[] args) {
		
		String  str = "자바 프로그래밍";
		
		//매개값의 문자열을 포함하고 있으면 해당 매개값의 시작인덱스값을 반환
		//포함하지 않으면 -1 반환
		System.out.println("프로 "+str.indexOf("프로"));
		System.out.println("c "+str.indexOf("C"));
		
		//subString과 함께 사용될 수 있다
		System.out.println(str.substring(str.indexOf("프로")));
		
		if(str.indexOf("자바") >= 0) {
			System.out.println("자바와 관련 있음");
		} else {
			System.out.println("자바와 관련 없음");
		}
		
		//문자의 길이를 반환합니다
		//id의 길이는 5자 이상이어야 합니다
		String id="abcdefg";
		
		if(id.length() >= 5) {
			System.out.println("사용가능한 아이디입니다");
		} else {
			System.out.println("아이디는 5자 이상이어야 합니다");
		}
		
		String ssn = "1234561234567";
		if(ssn.length() != 13) {
			System.out.println("주민등록번호를 정확히 입력해주세요");
		}
		
		//원하는 문자열을 추출
		//시작인덱스 포함, 끝인덱스 불포함
		//시작인덱스만 넣을 경우 문자열의 끝까지 추출
		System.out.println(ssn.substring(0, 6));
		System.out.println(ssn.substring(6));
		
		//문자교체
		str = "자바는 객체지향 언어입니다. 자바를 자바봅시다.";
		System.out.println(str.replace("자바", "java"));
		
		//대소문자 교체
		str = "Java Progarming Language";
		System.out.println(str);
		System.out.println(str.toUpperCase()); //대문자로 변경
		System.out.println(str.toLowerCase()); //소문자로 변경
	
		//대소문자를 구분하지 않고 비교
		str = "q";
		System.out.println(str.equalsIgnoreCase("Q"));
		System.out.println(str.equalsIgnoreCase("q"));
		
		//공백을 제거해주기
		id = "             id  ";
		System.out.println(id);
		System.out.println(id.trim()); //공백을 제거해 반환
		
		//기본타입을 문자로 변경
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(0.7));
		System.out.println(String.valueOf(10));
		
		
		
	}
}
