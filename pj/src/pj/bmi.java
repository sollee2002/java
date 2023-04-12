package pj;

import java.util.Scanner;

public class bmi {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("=========bmi측정기=========");
		System.out.println("키를 입력하세요 단위 cm");
		int height = sc.nextInt();
		
		double dheight = height * 0.01;

		System.out.println("몸무게를 입력하세요 단위 kg");
		double weight = sc.nextDouble();

		double bmi = weight/(dheight*dheight);

		System.out.printf("당신의 bmi는 %.1f 입니다", bmi);
		
		
		
		
		
	}

}
