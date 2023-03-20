package Ex;

public class Ex04_05 {
	
	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
		System.out.println("=================");
		for(int i=1; i<=4; i++) { //1,2,3,4 출력
			
			//별출력

			//j <= i
			//======
			//1 <= 1
			//2 <= 1 <-- 조건 불일치 탈출
			//======
			//1 <= 2
			//2 <= 2
			//3 <= 2 <-- 조건 불일치 탈출
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			//줄바꿈
			System.out.println();
		}
		System.out.println("=================");
		
		for(int i=1; i<=4; i++) {
			
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	

}
