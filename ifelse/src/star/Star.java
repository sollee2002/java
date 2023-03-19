package star;


public class Star {
	
	public static void main(String[] args) {
		
//1번
//	*
//	**
//	***
//	****
		
		for(int i=1; i<=4; i++) {	
			
			for(int j=0; j<i; j++) {
				System.out.print("*");				
			}
			
			System.out.println();
		}
		
//2번
//	   *
//	  **
//	 ***
//	****
		System.out.println("==============");
		
		for(int i=1; i<=4; i++) {
			
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//3번
//	****
//	***
//	**
//	*
		System.out.println("==============");
		
		for(int i=1; i<=4; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//4번
//	****
//	 ***
//	  **
//	   *
		System.out.println("==============");
		
		for(int i=1; i<=4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
	}
}
