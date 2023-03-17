package scanner;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {		
		//변수 선언 : 변수타입 변수명
		//스캐너 생성 : 클래스명 변수명 = new 클래스명(System.in);
		//자동 완성 시 자동으로 import
		//오류 발생시 마우스를 올려 제시된 해결방안을 클릭하여 처리할 수 있음
		
		//객체를 생성하는 방법
		//new 연산자는 객체를 메모리에 생성 후 메모리의 주소를 반환 합니다.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요");
		
		
		//next() : 공백으로 구분해서 하나씩 읽어옵니다
		//nextLine() : 한 줄을 읽어 옵니다
		String input = scanner.nextLine();
		System.out.println(input);
		
		//문자열을 숫자로 가져오기
//		System.out.println(Integer.parseInt(input));
		
		//스캔값을 숫자로 받아옵니다
		int i = scanner.nextInt();
		System.out.println(i);
		
		

	}

}
