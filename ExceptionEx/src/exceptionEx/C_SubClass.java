package exceptionEx;

import java.io.FileNotFoundException;

//import java.io.IOException;

public class C_SubClass extends C_SuperClass{

//	@Override
//	부모클래스의 메서드보다 상위타입의 예외를 발생시키는 것은 불가능
//	public void method() throws Exception {
//		super.method();
//	}

//	@Override
//	//오버라이딩 시 예외를 작성하지 않아도 된다
//	public void method() {
//		
//	}

	@Override
	//부모타입의 메서드보드 하위 타입의 예외를 발생시킬 수 있다
	public void method() throws FileNotFoundException{
		//이 경우에는 부모의 메소드를 호출하지 않음
//		super.method();
	}


}
