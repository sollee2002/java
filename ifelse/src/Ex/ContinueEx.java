package Ex;

public class ContinueEx {

	public static void main(String[] args) {
		//break & continue
		//break문 : 위치에 따라 반복문 하나를 완전히 탈출
		//continue문 : 뒤의 코드를 실행하지 않고 반복문으로 되돌아감
	
		Outter : //Label 반복문 위에 작성
	for(int m=2; m<=9; m++) { //m을 2~9까지 출력
				
				//System.out.printf("<m = %d>\n",m);
				System.out.printf("====%d단====\n",m);
				
				for(int n=1; n<=9; n++) { //n을 1~9까지 출력
					
					if(m==6) {//6단만 구구단 출력하지 않음 이후의 7단~9단은 영향받지X
						break Outter; //라벨의 위치까지 반복문을 탈출
									  //라벨을 사용해 원하는 곳으로 탈출 가능
					}
					System.out.printf("%d x %d = %d\n",m,n,m*n); //구구단 출력
				
				}
				System.out.println();
				
//				if(m==6) { //6단까지만 출력 후 반복문을 탈출
//					break;
//				}
			} //for문 종료
		
		
		//짝수일 경우의 합
		//1부터 10까지의 수 중 짝수의 합
		
		//연산자 += =+
		//a += 100은 a에 100을 더하는 것
		//a =+100은 a = (+)100를 쓴 식
		
		int sum=0;
		
		System.out.println("==짝수의 합 구하기==");
		for(int i=1; i<=10; i++) {
		
		if(i%2==1) { //i의 값이 홀수일 경우 증감식으로 넘어가기
			continue;
		}
		System.out.println("i의 값 : "+i);
		sum += i; //sum 은 자기자신과 i를 더함
		System.out.println(sum);
		}
		
		
		
		
		

	}

}
