package package01;

import package02.C;

public class A {
	//필드 정의
	C c = new C(5);
	B b = new B();
	
	//메소드 밖에선 코드 작성 불가
	//c. <-- 아무것도 불러올 수 없음
	
	//기능 정의
	public void method1() {
		c.method1();
		//c.method2(); <-- 메소드의 접근제한자가 private로 다른 패키지에서 사용할 수 없다
	}

//public은 패키지 제한없이 사용 가능
}

//한 파일 내에서 여러 클래스 선언 가능
//여러 클래스를 동시에 선언했다면 접근제한자는 하나의 클래스만 설정 가능
//접근제한자가 없는 클래스는 자동으로 default 설정

class B {
	
	//default일 경우 같은 패키지에서 호출 가능
	B() {
		
	}
}