package sec01.exam02;

import sec01.exam01.Audio;

public class Application {	
	public static void main(String[] args) {
		//기본생성자를 이용하여 객체를 생성 후 참조타입 변수에 저장
		MyClass mc = new MyClass();
		//1.인터페이스가 필드에 사용된 경우
		//myClass의 필드에 접근하여 메서드를 호출(smartTv생성되어 있음)
		mc.rc.turnOn();
		mc.rc.setVolume(8);
		mc.rc.turnOff();
		System.out.println("============================");
		
		mc.rc = new Audio();
		mc.rc.turnOn();
		mc.rc.setVolume(4);
		mc.rc.turnOff();
		
		System.out.println("============================");
		//2.인터페이스가 생성자의 매개변수로 이용된 경우
		//인터페이스의 구현체를 생성하여 매개변수로 전달
		MyClass mc2 = new MyClass(new Audio());
		mc2.rc.turnOn();
		mc2.rc.setVolume(5);
		mc2.rc.turnOff();
		System.out.println("============================");

		//3.인터페이스가 메서드의 매개변수로 이용된 경우
		//기본생성자로 생성하면 rc=new SmartTv(); 로 생성됩니다 <-- 필드의 선언부에서 생성하고 있습니다
		MyClass mc3 = new MyClass();
		
		//인터페이스가 메서드의 매개변수 타입으로 사용될 경우
		//메소드 호출 시 구현 객체를 매개값으로 대입
		mc3.methodB(new Audio());
		mc3.rc.turnOn();
		mc3.rc.setVolume(1);
		mc3.rc.turnOff();
		System.out.println("============================");
			
		//4.메서드에 선언된 로컬변수를 rc에 저장
		MyClass mc4 = new MyClass();
		mc4.methodA();
		mc4.rc.turnOn();
		mc4.rc.setVolume(9);
		mc4.rc.turnOff();
		System.out.println("============================");
		
		
			
	}

}
