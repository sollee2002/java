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
			
			if(num1+num2==5) {
				System.out.println("주사위 눈의 합이 5, 종료합니다");
				break;
			}
			System.out.println("다시 굴립니다");
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
		Scanner sc = new Scanner(System.in);
		int balance = 0;//잔고
		int money;//금액
		
		while(run) {
			
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.println("선택>");
			
			String c = sc.next();//선택
			
				if("1".equals(c)) {
					System.out.println("예금액>");
					money =sc.nextInt();
					balance += money;
					System.out.printf("잔액 : %d(원)\n",balance);
				} else if ("2".equals(c)) {
					System.out.println("출금액>");
					money =sc.nextInt();
					
					if(balance<money){
						System.out.println("잔액이 부족합니다");
					} else {
						balance -= money;	
						System.out.printf("잔액 : %d(원)\n",balance);
					}
					
				} else if ("3".equals(c)) {
					System.out.println("잔고>");
					System.out.println(balance+"(원)");	
					
				} else if("4".equals(c)) {
					break;
				}			
		}
		System.out.println("종료합니다");
		
	}
}
