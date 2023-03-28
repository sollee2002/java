package exam03_Tire;

public class CarEx {

	public CarEx() {
		
	}
	
	public static void main(String[] args) {

		//자동차 객체를 생성합니다
		Car car = new Car(new Tire("FR",3),new Tire("FL",3),
					new Tire("BR",3),new Tire("BL",3));
//		Car car = new Car();
		
		for(int i=0; i<10; i++) {
			System.out.println("달립니다>>>>>>");
			int res=car.run();
			if(res>0) {
				car.changeTire(res);
			}
			System.out.println("=========================");
		}
			
		
		
		
	}

}
