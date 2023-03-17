package BMI2;

import java.util.Scanner;

public class BMIInt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {

			System.out.println("===BMI 측정기===");
			System.out.println("1. 시작 2. 종료");
			int i = scanner.nextInt();
			
			if(i==1)
			{
				System.out.println("키를 입력하세요 (단위 cm)");//키 입력
				int iheight = scanner.nextInt();
				double height = iheight*0.01;//cm - m 변환
				
				System.out.println("몸무게를 입력하세요 (단위 kg)");//몸무게 입력
				int weight = scanner.nextInt();
				System.out.printf("키: %d(cm) 몸무게: %d(kg)\n",iheight,weight);
				
				Double bmi = weight/(height*height);//bmi 계산
				System.out.printf("당신의 BMI는 %.1f 입니다\n",bmi);//bmi출력
				
				if(bmi<18.5) {
					System.out.println("저체중입니다");
				} else if (bmi<=24.9) {
					System.out.println("정상체중입니다");
				} else if (bmi<=29.9) {
					System.out.println("과체중입니다");
				} else if (bmi<=34.9) {
					System.out.println("비만입니다");
				} else {
					System.out.println("고도비만입니다");
				}							
			} else {
				System.out.println("종료합니다");
				scanner.close();//스캐너 종료
				break;
			}
			
		}
		
		
		

	}

}
