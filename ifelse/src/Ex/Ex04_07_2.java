package Ex;

import java.util.Scanner;

public class Ex04_07_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance =0;
		int money;
		
		//라벨(이름)을 붙여줍니다   
		Outter :
		while(true) {
			
			System.out.println("=======================");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("=======================");
			System.out.println("선택> ");
			String c = sc.next();
			
			switch(c) {
			case "1" :
				System.out.println("예금액> ");
				money = sc.nextInt();
				balance += money;
				break;
			
			case "2" :
				System.out.println("출금가능금액 : "+balance+"(원)");
				money = sc.nextInt();
				
				if(money>balance) {
					System.out.println("잔액이 부족합니다");
				} else {
					balance -= money;
				}
				break;
			
			case "3" :
				System.out.println("잔고 : "+balance+"(원)");
				break;
				
			case "4" :
				System.out.println("잔고 : "+balance+"(원)");
				System.out.println("종료합니다");
				break Outter;				
			}
			
			sc.close();
			

			
		}

	}

}
