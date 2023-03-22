package Car.Objects;

public class Car {

	//필드
	//클래스에 대한 여러 속성값 지정
	//값을 초기화해주지 않으면 기본값을 가짐
	
	String company = "현대자동차";
	
	public Car(String company) {
		//필드의 이름과 매개변수의 이름이 동일한 경우 지역변수인 매개변수가 우선됨
		//결과적으로 블록 내부에서 company값은 매개변수의 값을 가르키고 있다
		//this : 생성된 객체를 의미, 자신이 포함된 클래스를 의미함
		this.company = company;
	}
	
	//기본생성자 : 매개변수가 없는 생성자
	//생성자를 만들지 않으면 컴파일러가 자동으로 만들어주는 생성자
	//생성자를 하나라도 만들면 자동으로 만들어주지 않음
	public Car() {
		// Outline의 초록색 동그라미는 메소드를 의미함
		//초록색 동그라미 오른쪽 상단에 c는 생성자를 의미
		//세모는 필드
		
		
	}

	String model = "그랜저";
	int speed;//0
	boolean engineStart;//false

	
	public void speedUp() {
		speed += 10;
	}
	
}
