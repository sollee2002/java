package scanner;

import java.io.IOException;

public class KeyCodeEx {

	public static void main(String[] args) throws IOException {
		//ENTER = CR=입력줄 맨 앞으로(13), LF=줄바꿈(10)
		
		//System.in.read(); 메소드는 오류가 발생 할 수 있다
		//오류를 처리하는 2가지 방법 중 throw 하는 방법을 선택하여 해결
		//다른 방법으로는 try {} catch {} 문으로 감싸서 해결할 수 있다
		
		//사용자의 입력을 기다리고 있습니다.
		//엔터키를 입력하는 순간 실행이 된다
		int code1 = System.in.read();
		int code2 = System.in.read();
		int code3 = System.in.read();
		int code4 = System.in.read();
		int code5 = System.in.read();
		
		System.out.println("======코드출력======");
		System.out.println((char)code1);
		System.out.println(code2);
		System.out.println(code3);
		System.out.println(code4);
		System.out.println(code5);
		

	}

}
