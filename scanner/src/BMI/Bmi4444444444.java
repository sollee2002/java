package BMI;

import java.util.Scanner;

public class Bmi4444444444 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		while(true) {
			System.out.println("========BMI========");
			System.out.println("키를 입력하세요");
			int h = scanner.nextInt();
			double dh = h*0.01;
			System.out.println("몸무게를 입력하세요");
			double w = scanner.nextDouble();
			
			double bmi = w/(dh*dh);
			
			
			//삼항연산자
			//변수 = (조건)? 참 : 거짓;
			String result = (bmi<=18.5)? "저체중"
					: (bmi<=22.9)? "정상체중"
							: (bmi<=24.9)?"과체중" : "비만";
			
			System.out.printf("당신은 %s(%.1f) 입니다\n",result,bmi);
		
			if(i==9) {
				
				System.out.println("종료합니다");			
				break;
				
			} else {
				
				i++;
				System.out.println("종료하려면 q, 계속하려면 아무키나 입력하세요");	
				String str = scanner.next();

				if("q".equals(str))
				{
					System.out.println("종료합니다");
					System.out.println("========================");
					//반복문 탈출
					break;
				}
				
			}
			
			
			
			
			
		}		
	}

}
