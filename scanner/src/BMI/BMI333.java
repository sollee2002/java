package BMI;

import java.util.Scanner;

public class BMI333 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 (단위 cm)");
		int iheight = scanner.nextInt();
		double height = iheight*0.01;
		
		System.out.println("몸무게를 입력하세요 (단위 kg)");
		double weight = scanner.nextDouble();
		
		System.out.printf("키: %d(cm) 몸무게: %f(kg)\n",iheight,weight);
		
		double bmi = weight/(height*height);
		
		String result = (bmi<18.5)?"저체중":(bmi<=24.9)?"표준":(bmi<=29.9)?"과체중":"비만";
		System.out.println(result);
		
	}

}
