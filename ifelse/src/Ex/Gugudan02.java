package Ex;

public class Gugudan02 {

	public static void main(String[] args) {
		//이중(중첩)for문을 이용하여 구구단 출력하기 2단~9단
		//for(초기화식; 조건식; 증감식)
		
		for(int m=2; m<=9; m++) { //m을 2~9까지 출력
			
			//System.out.printf("<m = %d>\n",m);
			System.out.printf("====%d단====\n",m);
			
			for(int n=1; n<=9; n++) { //n을 1~9까지 출력
				int num = n*m; //곱한 값 저장
				System.out.printf("%d x %d = %d\n",m,n,num); //구구단 출력
			}
			System.out.println();
		} //for문 종료
		
		//구구단 반대 출력 9단~2단
		for(int m=9;m>1; m--) {
			System.out.printf("====%d단====\n",m);
			for(int n=9; n>0; n--) {
				System.out.printf("%d x %d = %d\n",m,n,m*n);
			}
			System.out.println();
		}

	}

}
