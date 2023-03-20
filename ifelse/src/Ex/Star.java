package Ex;

public class Star {

	public static void main(String[] args) {
		//별찍기
		
		System.out.println("====1번====");
		for(int i=1; i<=4; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("====2번====");
		for(int i=1; i<=4; i++) {
			
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("====3번====");
		for(int i=1; i<=4; i++) {
			
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("====4번====");
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("====5번====");
		for(int i=1; i<=4; i++) {
			
			for(int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<(i*2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("====6번====");
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=9; j>(i*2); j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
