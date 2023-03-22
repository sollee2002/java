package Car.Objects;

public class Person {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("이름 "+car.company);
		car.company = "르노삼성";
		System.out.println("변경이름 "+car.company);
		car.speedUp();
		System.out.println("속도 "+car.speed);
		car.speed=100;
		System.out.println("속도변경 "+car.speed);
		
		
		//Car car2 = new Car("기아자동차");
		//필드에 접근하기 위해서는 객체가 생성되어 있어야 한다
//		System.out.println("car1.company: "+car1.company);
//		
//		car1.speedUp();
//		System.out.println("car1.speed: "+car1.speed);
//		
//		//System.out.println("car2.company: "+car2.company);
		

	}

}
