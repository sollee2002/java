package getter.setter;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		//private  접근제한자를 이용한 경우
		//필드에 직접 접근할 수 없으므로
		//set메소드를 이용해서 필드의 값을 변경시켜줄 수 있다
		car.setSpeed(-50);
		System.out.println("현재 속도는: "+car.getSpeed());
		
		car.setSpeed(50);
		System.out.println("현재 속도는: "+car.getSpeed());
		
		//(멈췄을때 값)t/(생성되었을때 초기값)f
		//멈추지 않은 상태라면 멈추는 메서드를 호출
		//상태 확인
		if(!car.isStop()) {
			car.setStop(true);//차 멈춤			
		}
		
		car.setSpeed(50);
		System.out.println("현재 속도는: "+car.getSpeed());
		
		
	}
	
	

}
