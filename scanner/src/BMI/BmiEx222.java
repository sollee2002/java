package BMI;

import java.util.Scanner;

//접근제한자 class 클래스명 {}
// - 필드 : 속성 정의
// - 메서드 : 기능 정의
//		* main Method : 프로그램의 시작, 실행 담당
// - 생성자 : 객체를 생성할 때 사용
//		* new를 만나면 생성자를 통해서 객체가 생성이 된다
public class BmiEx222 {

	int j = 0; //필드, 전역변수
	
	public static void main(String[] args) {
		
		int i = 0; //지역변수
		
		//변수 선언
		//타입 변수명 = new 타입(매개변수);
		//기본 변수는 메모리에 값을 가지고 있다
		//참조 변수는 메모리의 주소값을 가지고 있다
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요(cm) *숫자만 입력 가능");
		double h = scanner.nextDouble();
		double dh = h*0.01;
		
		System.out.println("몸무게를 입력하세요(kg) *숫자만 입력 가능");
		double w = scanner.nextDouble();
		
		double bmi = w/(dh*dh);
		
		System.out.printf("당신의 BMI는 %.1f 입니다\n",bmi);

		String result = (bmi<=18.5)? "저체중" : (bmi<=22.9)? "정상체중" : (bmi<=24.9)? "과체중":"비만";
		System.out.println(result);
		

	}

}
