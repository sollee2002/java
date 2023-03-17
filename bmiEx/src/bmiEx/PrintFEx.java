package bmiEx;

public class PrintFEx {

	public static void main(String[] args) {
		/* 형식문자열
		 printf("형식문자열",값1,값2...);	 
		%s- 문자열 
		%d- 정수 
		%f- 실수
		*/
		
		String name = "자바라";
		int age = 20;
		double height = 1.6;
		int money = 10000000;
		
		//형식문자열
		System.out.println("이름 "+name+"\n나이 "+age+"\n키 "+height);
		System.out.println("=========================");
		System.out.printf("이름 %s \n나이 %d \n키 %f \n","자바라",age,1.6);
		
		//자릿수를 정해줄 때
		//%Nd: 왼쪽 빈자리를 N칸 공백
		//%-Nd: 오른쪽 빈자리를 N칸 공백
		//%0Nd: 왼쪽 빈자리를 0 채워 총 N칸 출력
		//%,d: 숫자 콤마생성
		//%N.Mf: 총 N자리, 소수를 M자리까지 출력
		//		  빈 정수 부분 만큼 공백 생성	 (%.Nf 형태 가능)
		
		System.out.println("=============================");
		System.out.printf("이름 %5s \n나이 %d \n키 %1.1f \n","자바라",age,1.6);
		System.out.println("=============================");
		System.out.printf("이름 %-5s \n나이 %05d \n키 %10.2f \n","자바라",age,1.6);		
		System.out.println("=============================");
		System.out.printf("이름 %-5s \n나이 %05d \n키 %6.3f \n","자바라",age,1.6);		
		System.out.println("=============================");
		System.out.printf("이름 %-5s \n나이 %05d \n키 %1.4f \n","자바라",age,1.578524544);		

		System.out.println("=============================");
		System.out.println(money);
		System.out.printf("%,d",money);
		
		
		//형식문자열과 대입되는 문자열의 순서가 다른경우 순번 표시
		//%N$s : N번값의 문자열을 해당 순서에서 출력
		System.out.println("\n=============================");
		System.out.printf("나이 %2$d 이름 %1$s","자바라",20);
		
		
		
		
	}

}
