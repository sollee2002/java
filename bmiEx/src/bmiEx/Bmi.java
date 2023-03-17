// 패키지 선언
package bmiEx;

// 클래스 선언문
// 접근제한자 class 클래스명{}
public class Bmi {
	// 필드
	// 속성을 정의
	
	// 메인메소드-실행
	// 메소드의 선언문
	// 접근제한자 리턴타입 메소드명 (매개변수의타입 변수명)
	// void : 리턴타입이 없는 경우 
	
	// 변수의 사용범위 : 시작블록이후 선언된 변수는 종료블럭을 만나면 사라짐
	// {} 내에서만 작동
	// 메소드 블럭 내부에서 선언된 변수는
	// 메소드 블럭 내에서만 사용가능함 > 로컬 변수
	// 다른 명령문장에서 블럭이 열리면 마찬가지로
	// 블록 내부에서만 사용 가능하다
	
	public static void main(String[] args) {
		//키가 1.6M, 몸무게 50kg BMI 구하기
		//몸무게/키의 제곱
		// int(정수), double(실수)
		
		double BMI = 50/(1.6*1.6);
		
		System.out.println("당신의 BMI는 ..."+BMI);
		
		int value; //정수타입 변수 value 선언
		int sum = 20;//정수타입 변수 sum을 만들고 20으로 초기화
		value = 10;//value를 10으로 초기화
		sum = value+20;//sum에 value 값과 20을 더해줌
		
		//제어문
		//진실의 문
		//만약 괄호 안의 조건이 참이라면 {} 코드블럭 실행
		//if(조건문){}
		//참 true, 거짓 false
		if(true) {
			System.out.println(true);//출력
			System.out.println("true");//출력
		}
		
//		if(false) {
//			
//			System.out.println(false);//출력
//			System.out.println("false");//출력
//		}
//		
//		if(1<0) {
//			
//			System.out.println("1<0");//출력
//		}
//		
//		System.out.println(sum);//출력
		//조건이 거짓이면 출력되지 않음(컴파일 오류)
		
		
	}
	

}
