package star;

public class Star_S {

	public static void main(String[] args) {
		
//1번
//	   *
//	  ***
//	 *****
//	*******
	
		for(int i=0; i<=3; i++) {
			
			for(int j=0; j<4-i; j++) {
				System.out.print("^");
			}
			for(int j=0; j<(i*2)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//2번
//	*******
//	 *****
//	  ***
//	   *
		System.out.println("================");
		
		for(int i=1; i<=4; i++) {
			
			for(int j=0; j<i; j++) { //공백
				System.out.print("^");
			}
			for(int j=7; j>=(i*2)-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		
		
		
	}
	
	
}
