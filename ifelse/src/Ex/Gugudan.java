package Ex;

public class Gugudan {

	public static void main(String[] args) {
		//구구단
		
//		for(int m=2; m<=9; m++) {
//			
//			System.out.printf("=======%d단======\n",m);
//			
//			for(int n=1; n<=9; n++) {
//				int num = m*n;
//				System.out.printf("%d x %d = %d\n",m,n,num);
//			}	
//		}
		
		//별찍기
		System.out.println("=======별찍기=======");
		
		for(int i=1; i<=4; i++) { //1열부터 4열까지 출력
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=======별찍기2=======");
		for(int i=1; i<=4; i++) { //1열부터 4열까지 출력
			for(int j=4; j>i; j--) { //공백출력
				System.out.print(" ");
			}
			
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
	}

}
