package BMI2;

import java.util.Scanner;

public class BMIScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		//변수이름.:사용가능한 메소드 목록을 제시
		
		//키와 몸무게를 입력받고 출력
		while(true) {			
			System.out.println("===BMI 측정기===");
			System.out.println("1. 시작 2. 종료");
			
			int i = scanner.nextInt();
			
			if(i==1) {
				System.out.println("키를 입력하세요 (단위:m)");
				double height = scanner.nextDouble();
				
				System.out.println("몸무게를 입력하세요 (단위:kg)");
				int weight = scanner.nextInt();
				
				System.out.printf("키: %.1f(m) 몸무게: %d(kg)\n",height,weight);
				
				double bmi = weight/(height*height);
				
				System.out.printf("당신의 BMI는 %.1f 입니다\n",bmi);				
			}
			else {
				System.out.println("종료합니다");
				scanner.close();
				break;
			}
			
		}
		

	}

}
