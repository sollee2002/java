package exam04;

public class Main {
	
	public static void main(String[] args) {
		//부모타입으로 자식 객체를 생성합니다
		//자동형변환 됩니다
		Airplane air = new SupersonicAirplane(SupersonicAirplane.SUPERSONIC);
		
		//1.부모타입으로 변환 시 부모가 가지고 있는 필드에만 접근이 가능하다
		//2.재정의(오버라이드) 메소드 호출 시 자식클래스에서 재정의한 메소드가 호출
		System.out.println("재정의 메소드 호출> ");
		air.fly();
		//air.booster(); 자식객체에서 정의해서 호출할 수 없음
		
		//자식타입으로 형변환 -> 강제형변환
		//원래타입으로 변환되면 자식클래스가 가지고 있는 필드 또는 메소드에 접근 가능
		SupersonicAirplane supersonic = (SupersonicAirplane)air;
		
		supersonic.booster();
		
	}

}
