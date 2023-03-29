package bmiException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMIException {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====BMI 측정기====");
			System.out.println("1. 시작 2. 종료");
			try {
				int c = sc.nextInt();
				switch(c) {
				
				case 1 : 
					System.out.println("키를 입력하세요 (단위 : cm)");
					int h = sc.nextInt();
					double dh = h*0.01;
					
					System.out.println("몸무게를 입력하세요 (단위 : kg)");
					double w = sc.nextDouble();
					
					double bmi = w/(dh*dh);
					
					String res = (bmi<18.5)? "저체중" : (bmi<=24.9)? "표준":(bmi<=29.9)? "과체중":"비만";
					System.out.printf("당신의 BMI는 %.1f 입니다. %s 입니다.\n",bmi,res);
					break;
					
				case 2 :
					System.out.println("종료합니다");
					System.exit(0);
				}
				
				
			} catch(InputMismatchException e) {
				sc.next();
				System.out.println("숫자만 입력 가능합니다");
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	

}
