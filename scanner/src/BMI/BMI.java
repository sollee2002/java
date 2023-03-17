package BMI;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		//스캐너 객체를 사용하기 위해 생성합니다.
		//타입 변수이름 = new 타입 (표준입력)
		Scanner scanner = new Scanner(System.in);		
		
		while(true) {
			System.out.println("===BMI ===");
			System.out.println("키를 입력하세요 (단위 m)");
			double height = scanner.nextDouble();
			
			System.out.println("몸무게를 입력하세요 (단위 kg)");
			double weight = scanner.nextDouble();
			
			double BMI = weight/(height*height);
			System.out.printf("당신의 BMI는 %.2f 입니다\n",BMI);
			
			if(BMI<=18.5) {
				System.out.println("저체중입니다");
			} else if (BMI<=22.9) {
				System.out.println("정상체중입니다");
			} else if (BMI<=24.9) {
				System.out.println("과체중입니다");
			} else {
				System.out.println("비만입니다");
			}
			System.out.println("q를 누르면 종료, 계속하려면 아무키나 누르세요");
			
			//String의 비교는 .equals라는 함수 사용
			String str = scanner.next();
			if("q".equals(str)) {
				System.out.println("종료합니다");
				//반복문 탈출
				break;
			}
			System.out.println("=========");			
		}
		
		
	}

}
