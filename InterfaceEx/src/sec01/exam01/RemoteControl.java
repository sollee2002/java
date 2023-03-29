package sec01.exam01;

public interface RemoteControl {
	//생성자를 가질 수 없음
	//인스턴스 필드도 가질 수 없음 -> 상수 사용가능
	//대체로 추상메서드를 가지고 있음
	
	//static final 자동으로 붙임 -> 상수취급
	//상수: 대문자로 작성하고 문자가 연결될 경우 언더바(_)를 이용
	public int Max_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//abstract를 붙이지 않아도 추상메서드로 인식
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
