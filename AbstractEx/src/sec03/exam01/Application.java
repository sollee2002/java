package sec03.exam01;

public class Application {

	public static void main(String[] args) {
		
		//추상 클래스는 미완성된 메서드를 포함할 수도 있으므로 생성할 수 없다
		//모두 완성된 메서드라도(추상메서드가 없어도) 클래스에 abstract 키워드가 붙어 있으면 생성할 수 없다
		//Phone p = new Phone();
		
		//추상클래스를 상속받아 추상메서드를 모두 구현하면 일반클래스로 생성할 수 있다
		SmartPhone sp = new SmartPhone("owner");
		
		//참조형 변수의 타입으로 사용이 가능하다
		//-> 다형성을 활용할 수 있다
		Phone phone = new SmartPhone("캔디");
		
		
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		

	}

}
