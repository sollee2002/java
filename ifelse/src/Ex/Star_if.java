package Ex;

public class Star_if {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
		
//		for(int i=1; i<=4; i++) {
//			
//			for(int j=4; j>=1; j--) {
//				
//				if(i<j) {
//					System.out.print("*");
//				} else {
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
		
		
		for(int i=1; i<=4; i++) {
			
			//j = 4,3,2,1
			for(int j=4; j>0; j--) {
				//i=1일때 j = 4,3,2,1 //i와 j의 값이 같은 경우 1일때만
				//i=2일때 j = 4,3,2,1
				//i=3일때 j = 4,3,2,1
				//i=4일때 j = 4,3,2,1
				
				if(i>j-1) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			
			System.out.println();
		}
		
//		   *
//		  **
//		 ***
//		****
		System.out.println("=========");
		for(int i=1; i<=4; i++) {
			
			for(int j=4; j>0; j--) {
				
				if(j>i) { //j와 i의 값이 같아질 경우 별 출력
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}

	}

}
