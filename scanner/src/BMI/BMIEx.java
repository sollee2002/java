package BMI;

import java.util.Scanner;

public class BMIEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("===BMI 측정기===");
			System.out.println("키를 입력하세요 (단위 cm)");
			double iheight = scanner.nextDouble();
			double height = iheight*0.01;
			
			System.out.println("몸무게를 입력하세요 (단위 kg)");
			double weight = scanner.nextDouble();

			System.out.printf("키: %.1f(cm) 몸무게: %.1f(kg)\n",iheight,weight);
			System.out.println("계속하려면 r, 다시입력하려면 아무키나 누르기");
			String str = scanner.next();
			if(str.equals("r")) {
				double bmi = weight/(height*height);
				System.out.printf("당신의 BMI는 %.1f 입니다\n",bmi);
				
				if (bmi <= 18.5) {
					System.out.println("저체중입니다");
				} else if (bmi <= 22.9) {
					System.out.println("정상체중입니다");
				} else if (bmi <= 24.9) {
					System.out.println("과체중입니다");
				} else {
					System.out.println("비만입니다");
				}

				System.out.println("종료하려면 q, 계속하려면 아무키나 누르기");
				String str2 = scanner.next();

				if (str2.equals("q")) {
					System.out.println("프로그램을 종료합니다");
					break;
				}
				System.out.println("=============");
			}
			
		}
	
	}

}
