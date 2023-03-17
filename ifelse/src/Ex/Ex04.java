package Ex;

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
		
		
		
		
	}
}
