package exam04;

//상속받을때 사용하는 키워드
//extends + 부모 클래스명
public class SupersonicAirplane extends Airplane {
	
	//상수(final)
	//한번 정의 후 값을 변경할 수 없다
	//비행모드를 숫자타입으로 정의
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	//비행상태
	public int flyMode;
	
	//가독성을 높여주기 위해 상수를 사용
	//매개변수를 받아서 flyMode를 세팅
	public SupersonicAirplane(int flyMode) {
		System.out.println("supersonic");
		if(flyMode == NORMAL || flyMode == SUPERSONIC) {
			this.flyMode=flyMode;			
		} else {
			flyMode= NORMAL;
		}
	}

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행입니다");
		} else {
			//fly()를 재작성 했지만
			//부모가 가지고 있는 fly() 메소드를 호출할 수 있다
			//super를 이용해서 접근
			super.fly();
		}
	}
	
	public void booster() {
		System.out.println("부스터 작동!!!!");
	}
	

}
