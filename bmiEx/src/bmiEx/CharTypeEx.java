package bmiEx;

public class CharTypeEx {

	public static void main(String[] args) {
		
		//문자 입력 시 '' 사용
		//하나의 문자를 저장
		char var1 = 'A';
		char var2 = '오';
		char var3 = 65;
		char var4 = 0x0041;
		
		//문자열을 저장
		String var5 = "문자열";
		
		long var6 = 123456789;
		//정수의 리터럴이 입력되면 int로 받아들이기 때문에
		//long 타입의 경우 숫자뒤에 l 또는 L을 입력한다
//		long var7 = 123456789123456789; //int 범위를 초과해 오류
//		long var8 = 123456789123456789l;
		
		//실수타입
		//실수의 리터럴이 입력되면 double로 받아들이기 때문에
		//float 타입의 경우 숫자 뒤에 f 또는 F를 입력한다
		//정밀도(소수점 이하 자리 표시) : float(7자리)<double(15자리)
		float var7 = 0.123456789123456789f;
		double var8 = 0.123456789123456789; 
		float var9 = 5e-3F;
		
		//논리타입
		boolean var10 = true;
		boolean var11 = false;
		
		//참 거짓을 판단
		//문자열과 다름
		if(true) {
			//참일때
			System.out.println("true");
		}
		else { //거짓일때
			System.out.println("false");
		}
		
		if(false) {
			//참일때
			System.out.println("true");
		}
		else { //거짓일때
			System.out.println("false");
		}
		
		//타입 변환 : 변수 앞 괄호 안에 타입을 넣어준다
		System.out.println((int)var1); //int로 형변형 경우 A가 아닌 유니코드가 출력
		System.out.println("====================char 타입 실습 ====================");
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		//이스케이프 문자 \
		//문자열 내부에 특정 문자를 추가
		// \t 탭만큼 띄움  \n 줄바꿈
		System.out.println("");
		System.out.println("\"");
		System.out.println("나는\n오늘\n\'순대국\'이\n먹고싶다");
		System.out.println("========실수 출력========");
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println("=====논리 타입====");
		System.out.println(var10);
		System.out.println(var11);
		
		
		//자동 타입 변환
		//작은 타입이 큰 타입으로 저장될 경우
//		byte a = 10;
//		int b = a;
//		//정수 타입이 실수 타입으로 저장될 경우
//		int c = 10;
//		double d = c;
		//char 타입은 유니코드 값이 int 타입으로 변환
		
		//강제 타입 변환
//		int a = 10;
//		byte b = (byte)a;
//		
	}

}
