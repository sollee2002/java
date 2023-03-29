package sec01.exam01;

public class SmartTv extends Tv implements Search {
	
	@Override
	public void turnOn() {
		System.out.println("SmartTv를 킵니다");
}
	@Override
	public void turnOff() {
		System.out.println("SmartTv를 끕니다");
	}

	public void setVolume(int volume) {
		System.out.println("Smart TV의 볼륨을 설정합니다");
		
		if(volume>Max_VOLUME) {
			System.out.println("볼륨은 10을 넘을 수 없습니다");
			this.setVolumu(Max_VOLUME);
			System.out.println("볼륨을 "+getVolumu()+"으로 설정합니다");

		} else if(volume<MIN_VOLUME) {
			System.out.println("볼륨은 0보다 작을 수 없습니다");
			this.setVolumu(MIN_VOLUME);
			System.out.println("볼륨을 "+getVolumu()+"으로 설정합니다");

		} else {
			this.setVolumu(volume);
			System.out.println("볼륨을 "+getVolumu()+"으로 설정합니다");
		}
	}
	
	

}
