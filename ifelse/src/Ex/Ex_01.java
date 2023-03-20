package Ex;

public class Ex_01 {
	
	public static void main(String[] args) {
		//두개의 주사위를 던져서 나온 수
		//1,2,3,4,5,6 6개의 수가 나올 수 있다
		//0.000......1<=Math.random() < 1
		//0.000......1 <=             < 0.999...9
		//0.000......6 <=             < 5.4...9  <-- *6을 곱했을 때
		//0보다 크거나 같고 5보다 작은 값을 추출 0,1,2,3,4,5
		//1.000......6 <=             < 6.4...9 <-- *1을 더했을 떄
		//1보다 크거나 같고 6보다 작은 값을 추출 1,2,3,4,5,6
		//초기값 지정 (+) + 1
		
		//i와 j의 합이 5이면 (i,j) 출력 후 종료
		//아니면 계속 주사위를 굴립니다
		
		while(true) {
		int i = (int)(Math.random()*6+1);	
		int j = (int)(Math.random()*6+1);	
		System.out.printf("(%d, %d)\n",i,j);
		
		if(i+j == 5) {
			System.out.println("종료합니다");
			break;
		}
		
		System.out.println("계속 주사위를 굴립니다");
		
		}
		
		
		
	}
	
	

}
