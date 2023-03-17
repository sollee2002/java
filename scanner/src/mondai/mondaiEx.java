package mondai;

import java.util.Scanner;

public class mondaiEx {

	public static void main(String[] args) {
		//1번	
		System.out.println("=========1번=========");
		String name = "감자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		
		System.out.println("이름: "+name);
		System.out.print("나이: "+age);
		System.out.printf("\n전화: %1$s-%2$s-%3$s\n",tel1,tel2,tel3);

		//2번
		Scanner scanner = new Scanner(System.in);
		System.out.println("=========2번=========");
		System.out.print("\n첫번째 수: ");
		String strNum1 = scanner.next();
		
		System.out.print("\n두번째 수: ");
		String strNum2 = scanner.next();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1+num2;
		
		System.out.printf("\n덧셈 결과: %d",result);
		
		//3번
		System.out.println("\n=========3번=========");
		System.out.println("[필수 정보 입력]");
		System.out.println("이름");
		String str = scanner.next();
		System.out.println("생년월일 6자리");
		String str2 = scanner.next();
		System.out.println("전화번호");
		String str3 = scanner.next();
		
		System.out.printf("\n[입력한 내용]\n 이름: %s\n 생년월일: %s\n 전화번호: %s\n"
				, str,str2,str3);
		
		
		
		
		
	}

}
