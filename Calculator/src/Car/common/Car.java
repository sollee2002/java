package Car.common;

public class Car {
	//필드 생성
	String model;
	String color;
	int maxspeed;
	
	//생성자의 오버로딩
	//매개변수의 타입, 개수, 순서가 다르게 여러개를 선언
	
	//생성자의 특징
	//1.클래스명과 이름이 같다
	//2.변환타입이 없다
	
	//this. : 필드
	//this(): 생성자
	//생성자를 사용하기 위해서 매개변수에 알맞은 파라메터를 넣어줍니다
	//1. 생성자에서 다른 생성자를 호출할 수 있다
	//-> 중복되는 코드를 줄이기 위해서

	public Car() { //기본생성자
		this("기본모델","블랙",150); //생성자 호출
	}
	
	public Car(String model) {
		//model = model; <--필드와 매개변수가 아닌 같은 매개변수만 의미
		//코드블럭 안에서는 로컬변수가 우선되므로 아무런 의미가 없음
//		this.model=model;
		this(model,"",150);
	} //생성자 오버로딩	
	
	public Car(String model, String color) {
		//생성자를 호출하는 것은 첫번째 줄에서만 가능하다
//		this.model=model;
//		this.color=color;
		this(model,color,0);
	}	
	public Car(String model, String color, int maxspeed) {
		this.model=model;
		this.color=color;
		this.maxspeed=maxspeed;
	}
	
	public Car(String model, int maxspeed) {
		this.model=model;
		this.maxspeed=maxspeed;
	}
	//public Car(String model2, int maxspeed2) {} 타입이 같을 경우 오류
	
	public Car(int maxspeed, String model) {
		this.maxspeed=maxspeed;
		this.model=model;
	} 
	
	
}
