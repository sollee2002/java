package exceptionEx;

import java.io.IOException;

public class B_Throws {
	
	public static void main(String[] args) throws NullPointerException, IOException, Exception {
		
		B_Throws b = new B_Throws();
		b.method2();
		
	}
	
	public void method1() throws Exception, IOException, NullPointerException {
		System.out.println("method1() 호출");
		//1부터 3까지의 수를 추출
		int num = (int)(Math.random()*3+1);
		
		if(num==1) {
			throw new Exception();
		} else if(num==2) {
			throw new IOException();
		} else if (num==3) {
			throw new NullPointerException();
		}
	}
	
	public void method2() {
		System.out.println("method2() 호출");
		try {
			method1();
		} catch (IOException e) {
			//어떤 종류의 예외가 발생했는지 확인 후 처리
			System.out.println("파일 입출력 도중 오류가 발생했습니다");
//			e.printStackTrace();
		} catch (NullPointerException e) {
			//어떤 종류의 예외가 발생했는지 확인 후 처리
			System.out.println("해당 위치에 데이터가 없는 오류가 발생했습니다");
//			e.printStackTrace();
		} catch (Exception e) {
			//Exception은 예외의 최상위 계층이므로 어떤 오류가 발생했는지 명확히 알 수 없음
			System.out.println("오류가 발생했습니다");
//			e.printStackTrace();
		}
		System.out.println("method2() 종료");

	}
	
	public void method3() {
		
	}
	

}
