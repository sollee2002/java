package exam04;

//final 키워드 + 클래스 : 부모클래스가 될 수 없음
public class Airplane {
	
	public Airplane() {
		System.out.println("Airplane");
	}
	
	public void land() {
		System.out.println("착륙합니다");
	}
	
	//final 키워드 +메소드 : 메소드를 재정의할 수 없다
	public void fly() {
		System.out.println("일반비행입니다");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다");
	}

}
