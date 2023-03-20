package star;

public interface StarEx_fal {
	
	public static void main(String[] args) {
		
		System.out.println("1번================");
		for(int i=1; i<=4; i++)
		{
			for(int j=0; j<i; j++) { //j와 i가 같아질 경우 잘못출력됨
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("2번================");
		for(int i=1; i<=4; i++) {
			for(int j=4; j>i; j--) {
				System.out.print("^");
			}
			
			for(int j=0; j<i; j++) { //j와 i의 값이 같지 않아지도록 주의
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("3번================");
		
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("4번================");
		
		for(int i=1; i<=4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("^");
			}
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("4번================");
		
		for(int i=0; i<=3; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print("^");
			}
			for(int j=7; j>=(i*2)+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.println("5번================");
		
		for(int i=0; i<=3; i++) {
			
			for(int j=3; j>i; j--) { 
				System.out.print("*");
			}
			for(int j=0; j<(i*2)+1; j++) {
				System.out.print("^");
			}
			
			System.out.println();
			
		}
		
		
		
		
		
	}
	
	

}
