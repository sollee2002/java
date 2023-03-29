package sec01.exam01;

public abstract class Tv implements RemoteControl {
	
	private int volumu;

	@Override
	public void turnOn() {
		System.out.println("TV를 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	public int getVolumu() {
		return volumu;
	}

	public void setVolumu(int volumu) {
		this.volumu = volumu;
	}

	//인터페이스에서 정의한 3개의 추상메서드를 모두 구현해야하는데
	//2개만 구현한 경우 ====> 추상 클래스가 된다
//	@Override
//	public void setVolume(int volume) {
//		System.out.println("TV의 볼륨을 설정합니다");
//		this.volumu=volume;
//		
//		if(volume>Max_VOLUME) {
//			System.out.println("볼륨은 10을 넘을 수 없습니다");
//			this.volumu=Max_VOLUME;
//			System.out.println("현재 볼륨: "+this.volumu);
//		} else if(volume<MIN_VOLUME) {
//			System.out.println("볼륨은 0보다 작을 수 없습니다");
//			this.volumu=MIN_VOLUME;
//			System.out.println("현재 볼륨: "+this.volumu);	
//		} else {
//			System.out.println("볼륨을 "+volume+"으로 설정합니다");
//		}
//	}

}
