package objects;

public class Calculator {
	
	//메소드를 만드는 방법
	//메서드 : 객체의 기능을 정의
	//접근제한자 반환타입 메소드명(매개변수타입 변수명) {}
	
	//클래스
	//필드: 속성 정의 - 타입, 변수이름= 값
	//*****생성자: 객체 초기화
	//클래스명과 동일한 이름, 반환타입이 없다
	//new 연산자를 만났을때 실행됨*****
	//메서드: 기능
	
	/**
	 * 두 개의 정수를 받아서 두 수의 합을 반환합니다
	 * @return 두 수의 합
	 */
	
	public int add(int num1, int num2) {
		return num1+num2;
		
	}

}
