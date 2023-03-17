package BMI2;

public class BMI2 {

	//자바 프로그램의 실행점
	public static void main(String[] args) {
		//출력하고 줄바꿈
		//키 1.6m 몸무게 55kg
		//변수의 타입 변수명 = 값;
		//대입연산자 =
		//오른쪽에 있는 값을 왼쪽의 변수에 저장
		
		System.out.println("환영합니다.");
		
		double height = 1.6;
		int weight = 55;
		
		//실수와 정수의 연산
		//정수 55가 실수 55.0으로 자동형변환 되어짐
		double bmi = weight/(height*height);
		// %d 숫자, %f 실수, %s 문자
		System.out.printf("당신의 BMI는 %.1f입니다",bmi);
	}

}
