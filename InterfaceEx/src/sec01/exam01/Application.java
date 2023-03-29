package sec01.exam01;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		//인터페이스는 생성할 수 없지만 참조변수의 타입으로 사용할 수 있다
		//인터페이스 변수 = new 구현객체();
		
		//인터페이스의 다형성
		//인터페이스의 구현체는 인터페이스를 타입으로 가질 수 있다
		RemoteControl rc = new Audio();
//		RemoteControl tv = new Tv();
		
		//상속단계에 있는 부모가 인터페이스를 구현하고 있는 경우
		//인터페이스의 타입으로 생성이 가능하다
		RemoteControl st = new SmartTv();
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println(RemoteControl.Max_VOLUME);
		rc.turnOn();
		System.out.println("볼륨을 설정하세요> ");
		rc.setVolume(sc.nextInt());
		rc.turnOff();
		
//		System.out.println("===================");
//		
//		tv.turnOn();
//		System.out.println("볼륨을 설정하세요");
//		tv.setVolume(sc.nextInt());
//		tv.turnOff();

		System.out.println("===================");
		
		st.turnOn();
		System.out.println("볼륨을 설정하세요");
		st.setVolume(sc.nextInt());
		st.turnOff();
		
		
		Search search = new SmartTv();
		Tv tv2 = new SmartTv();
		
		
	}

}
