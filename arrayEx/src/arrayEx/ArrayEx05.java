package arrayEx;

//접근제어자 class 클래스명 {}
public class ArrayEx05 {
	//메소드를 생성하는 방법
	//접근제어자 static 반환타입(void) 메소드명(매개변수) {}
	//void : 반환 타입이 없다는 의미
	//반환하고 싶은 특정 타입이 있다면 void 대신 int String 등을 삽입
	//매개변수 : (타입 변수명) *있을 수도 있고 없을 수도 있음 필수x 매개변수 있을 경우 타입 명시해야함
	public static void main(String[] args) {
		
		System.out.println(args.length);
		//System.out.println(args[0];) //변수만 생성되고 객체가 생성되지 않아 접근 불가
		
		//1: 로컬, 2: 테스트, 3: 운영
		int mode=Integer.parseInt(args[0]);
		if(mode==1) {
			System.out.println("로컬환경입니다");
			//로컬 DB 접속
		} else if(mode==2) {
			System.out.println("테스트환경입니다");
			//테스트 DB 접속
		} else if(mode==3) {
			System.out.println("운영환경입니다");
		}
			
		
		for(int i=0;i<args.length; i++) {
			System.out.println(args[i]);			
		}
		//프로그램을 실행할 때 매개변수를 불러옴
		
		
		
		
	}
}
