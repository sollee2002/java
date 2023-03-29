package sec01.exam01;

//여러개의 인터페이스를 구현할 수 있다
//인터페이스들에 선언된 추상 메서드를 모두 구현해야한다
//미구현 메서드가 남아 있다면 추상클래스가 된다
public class Audio implements RemoteControl, Search {

	private int volume;
	
	@Override
	public void turnOn() {

		System.out.println("오디오를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		this.volume=volume;
		
		if(volume<MIN_VOLUME) {
			System.out.println("최소 볼륨 = 0");
			System.out.println("볼륨을 0으로 설정합니다");
			this.volume=MIN_VOLUME;
		} else if(volume>Max_VOLUME) {
			System.out.println("최대 볼륨 = 10");
			System.out.println("볼륨을 10으로 설정합니다");
			this.volume=Max_VOLUME;
		} else {
			System.out.println("볼륨을 "+volume+"으로 설정합니다");			
		}
	
	}
	
	
	
	

}
