package Ex;

import java.util.Scanner;

public class Ex_Re {

	public static void main(String[] args) {
		//3번
		System.out.println("====3번====");
		
		while(true) {
			int num1 = (int)(Math.random()*6+1);
			int num2 = (int)(Math.random()*6+1);
			
			System.out.printf("(%d, %d)\n",num1,num2);
		
			if(num1+num2==5) {
				System.out.println("주사위 눈의 합 : 5");
				System.out.println("종료합니다");
				break;
			}
		
		}
		
		//4번
		System.out.println("====4번====");
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {			
				if(4*i+5*j==60) {
					System.out.printf("(4x%d)+(5x%d)=60\n",i,j);
					System.out.printf("x=%d, y=%d\n",i,j);
				}
			}
		}
		
		//5번
		System.out.println("====5번====");
		
		for(int i=1; i<=4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//6번
		System.out.println("====6번====");
		
		for(int i=1; i<=4; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//7번
//		
//		boolean run = true;
//		int balance = 0;
//		int money;
		Scanner sc = new Scanner(System.in);
//		
//		while(run) {
//			
//			System.out.println("=======================");
//			System.out.println("1.예금 2.출금 3.잔고 4.종료");
//			System.out.println("=======================");
//			System.out.println("선택> ");
//			String str = sc.next();
//			
//			switch(str) {
//			case "1" :
//				System.out.println("예금액> ");
//				money = sc.nextInt();
//				balance += money;
//				break;
//				
//			case "2" :
//				System.out.println("출금액> ");
//				money = sc.nextInt();
//				
//				if(money>balance) {
//					System.out.println("잔액이 부족합니다");
//				} else {
//					balance -= money;
//				}
//				break;
//				
//			case "3" :
//				System.out.println("잔고 : "+balance+"(원)");
//				break;
//			
//			case "4" :
//				System.out.println("잔고 : "+balance+"(원)");
//				System.out.println("종료합니다");
//				sc.close();
//				System.exit(0);
//				break;
//			}
//	
//		}
		
		String name1 = "신용권";		
		String name2 = "신용권";		
		String name3 = new String("신용권");
		String name4 = new String("신용권");
		
		System.out.println("name1==name2");
		if(name1==name2) { //true
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println("name1==name3");
		if(name1 == name3) { //false
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println("name1.equals(name3)");
		if(name1.equals(name3)) { //true
			System.out.println("ture");
		} else {
			System.out.println("false");
		}
		
		System.out.println("name3==name4");
		if(name3 == name4) { //false
			System.out.println("ture");
		} else {
			System.out.println("false");
		}
		
		System.out.println("name5.equals(name4)");
		if(name3.equals(name4)) { //true
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		String hobby = null;
		if(hobby!=null) {
			System.out.println("취미: "+hobby);
		} else {
			System.out.println("정상적으로 종료되었습니다");
		}
		
		
		
		
		
	}

}
