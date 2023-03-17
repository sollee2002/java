package ifelse;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		
		//Math.random()
		//0.0~1.0 사이의 무작위수를 추출하여 double 타입으로 반환
		//0.0000000...1 - 0.9999999999...9
		//10을 곱했을 때 0-9 /1을 더했을때 1-10
		//100을 곱했을 때 0-99
		
//		double rotto1 = Math.random();
//		double rotto2 = Math.random();
//		double rotto3 = Math.random();
//		double rotto4 = Math.random();
//		double rotto5 = Math.random();
//
//		System.out.println(rotto1);
//		System.out.println(rotto2);
//		System.out.println(rotto3);
//		System.out.println(rotto4);
//		System.out.println(rotto5);
		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("===주사위 굴리기===");
//			int num = (int) (Math.random()*6) + 1;				
//	
//			if(num==1) {
//				System.out.printf("주사위 숫자 : %d\n",num);
//			} else if (num==2) {
//				System.out.printf("주사위 숫자 : %d\n",num);
//			} else if (num==3) {
//				System.out.printf("주사위 숫자 : %d\n",num);
//			} else if (num==4) {
//				System.out.printf("주사위 숫자 : %d\n",num);
//			} else if (num==5) {
//				System.out.printf("주사위 숫자 : %d\n",num);
//			} else {
//				System.out.printf("주사위 숫자 : %d\n",num);
//			}
//			
//			
//			System.out.println("종료하려면 q, 다시 굴리려면 아무키나 누르세요");
//			String str = sc.next();
//			
//			if("q".equals(str)) {
//				System.out.println("종료합니다");
//				break;
//			}
//			
//		}
		
		int numR = (int) (Math.random()*6) + 1;	
		System.out.println("주사위 : "+numR);
		
		switch (numR) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		case 6:
			System.out.println("6번");	
			break; //***** break 중요
		}
		
		
	}

}
