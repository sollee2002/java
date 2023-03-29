package exam05;

public class Drive{
	
	public void diver(Vehicle vehicle) {
		vehicle.run();
		
		//강제형변환 시 castingException이 발생할 소지가 있으므로 객체의 생성타입을 먼저 체크한다
		//객체 instanceof 타입 : 객체가 타입으로 생성되었는지를 체크
		if(vehicle instanceof Bus) {
			//원래타입으로 강제 형변환
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		} else if (vehicle instanceof Taxi) {
			Taxi taxi = (Taxi)vehicle;
			taxi.checkFare();
		}
	}
	
	public static void main(String[] args) {
		
		Drive drive = new Drive();
		//인터페이스의 구현체를 생성하여 매개변수에 넣어줍니다
		drive.diver(new Bus());
		System.out.println("===============");
		drive.diver(new Taxi());
		
		
		
		
	}


}
