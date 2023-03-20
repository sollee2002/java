package Ex;

import java.util.Scanner;

public class Ex04_07 {

	public static void main(String[] args) {
				
		boolean run = true;
		int balance = 0;
		int money;
		Scanner sc = new Scanner(System.in);
		//입력받기 위해 스캐너 객체 생성
		//sc.next() : 사용자의 입력을 문자열로 반환
		
		//1. case문 완성시키기
		//2. 반복해서 실행하기
		 
		while(run) {
			System.out.println("========================");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("========================");
			System.out.print("선택> ");
			String c = sc.next();
			
			switch (c) {
			case "1" :
				//변수의 값이 1이면 실행
				//코드작성
				System.out.println("예금액> ");
				money =sc.nextInt();
				balance += money;
				break; //break문이 없으면 다음 case를 계속 실행
				
			case "2" :
				System.out.println("출금가능금액 : "+balance+"(원)");
				System.out.print("출금액> ");
				money =sc.nextInt();
				
				if(money>balance) {
					System.out.println("잔고가 부족합니다");
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
				System.exit(0);
			}
			
		}
		

	}

}
