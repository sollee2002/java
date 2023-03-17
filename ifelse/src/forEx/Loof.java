package forEx;

public class Loof {

	public static void main(String[] args) {
		//반복문 - for문
		//for(초기화식; 조건식; 증감식) {}
		//초기식 -> 조건식 -> 코드블럭 -> 증감식 -> 조건식
		//1부터 100까지의 합을 구해봅시다
		//증감식에 식을 넣고 싶은 경우 : N=N+\-n
		
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			System.out.printf("%d번째 반복\n",i);
			sum +=i;
		}
		
		System.out.println("=================\n1~100까지 더한 값 :"+sum);
		System.out.println("=================");
		
		int i = 1;
		while (i<=5) {
			System.out.println("while 출력: "+i);
			i++;
		}
		
		
		
		
		
		
	}

}
