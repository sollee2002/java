package exceptionEx;

public class NullPointEx {

	public static void main(String[] args) {
		String str = null;
		
		//참조변수가 null 값을 가지고 있을 때 참조변수로부터 객체접근 연산자(.)을 이용해서
		//접근할 때 발생하는 오류 <-- NullPointException
//		str.toString();
		
		//오류가 날 가능성이 있는 코드를 try-catch문에 넣어줌
		try {
//			str.toString();			
			print(str);

		} catch(NullPointerException e) {
			System.out.println("오류발생");
		
		    }
		
		//예외처리
		//프로그램이 정상적으로 종료될 수 있도록 처리해줍니다
		System.out.println("프로그램이 정상적으로 종료되었습니다");

	}
	
	public static void print(String str) throws NullPointerException {
		
		throw new NullPointerException("강제 오류 발생");
	}
	
	
	

}
