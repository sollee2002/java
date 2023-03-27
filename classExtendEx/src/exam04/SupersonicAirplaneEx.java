package exam04;

public class SupersonicAirplaneEx {
	
	public SupersonicAirplaneEx() {
		
	}

	public static void main(String[] args) {
		//자식개체가 생성될 때 자동으로 부모객체가 생성된다
		SupersonicAirplane air = new SupersonicAirplane(SupersonicAirplane.NORMAL);
		
		//이륙합니다
		air.takeOff();
		air.fly();
		
		air.flyMode = SupersonicAirplane.SUPERSONIC;
		air.fly();
		
		air.flyMode = SupersonicAirplane.NORMAL;
		air.fly();
		
		//착륙
		
		air.land();
		

	}

}
