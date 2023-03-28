package sec03.exam01;

public abstract class Phone {
	//abstract
	//추상메소드임을 알려줍니다
	//메소드 정의만 되어 있으므로 추상 클래스는 생성이 불가능합니다(new 연산자x)
	//추상메서드를 하나라도 포함하고 있으면 추상클래스가 된다
	//상속받아 구현
	//추상클래스를 private 로 선언하는 것은 불가능하다
	
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner=owner;
	}
	
	//메소드
	//코드블럭이 완성되어있지 않음
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	};
	//하위클래스에게 작성을 강제한다
	//미완성된 메서드를 구현해야 일반 클래스로 작성이 가능하다
	public abstract void turnOff();
}
