package Ex;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		//2번
		System.out.println("2번===============");

		int sum =0;
		for(int i=1; i<=100; i++) {		
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		//3번
		System.out.println("3번===============");
		
		while(true) {
			int num1 = (int)(Math.random()*6)+1;		
			int num2 = (int)(Math.random()*6)+1;		
			
			System.out.printf("%d, %d\n",num1,num2);
			System.out.println("다시 굴립니다");
			
			if(num1+num2==5) {
				System.out.println("주사위 눈의 합이 5 종료합니다");
				break;
			}
		}
		
		//4번
		System.out.println("3번===============");

		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				int x4=4*y;
				int y5=5*y;
				int num= (4*x)+(5*y);
				System.out.printf(" x=%d y=%d \n",x,y);
				System.out.printf(" %d + %d = %d\n",x4,y5,num);
			}
		}
		
		//5번
		System.out.println("5번===============");
		
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		int M = 0; //잔고
		int money;//금액
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.println("선택>");
			
			String c = sc.nextLine();//선택
			
			switch(c) {
			case "1" :
				System.out.println("예금액");
				money =sc.nextInt();
				M += money;
			
			case "2" :
				System.out.println("출금액");
				money =sc.nextInt();
				M -= money;
				
			case "3":
				System.out.println("잔고");
				System.out.println(M);
				
			case "4" :
				break;
			}
			
			
		}
		
		
		
	}
}
