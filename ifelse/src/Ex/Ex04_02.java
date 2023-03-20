package Ex;

public class Ex04_02 {
	
	public static void main(String[] args) {
		//1에서 100까지 정수중에서
		//3의 배수의 총합
		
		int sum =0;
		for(int i=1; i<=100; i++) {
			
			if(i%3!=0) { //3의 배수인지 판단 
						 //!=아니면 ==같으면
						 //break: 반복문 탈출
						 //continue: 증감식으로 이동
				continue; //continue 이후 코드를 실행하지 않음
			}
			//3의 배수일 경우만 실행
			System.out.println("i = "+i);
			sum += i;
			System.out.println("합계: "+sum);
			
		}
		
		
	}

}
