package exam03_Tire;

public class Tire {

	public int maxRotation; //최대회전수
	public int Rotaion; //누적회전수
	public String location;//타이어의 위치
	
	public Tire(String location, int maxRotation) {
		//필드 초기화
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	/**
	 * 타이어 1회전 - Rotaion 1증가
	 * 1번 실행할때마다 누적회전수를 증가시킵니다
	 * 만약 maxRotation(최대회전수)보다 크면 false를 리턴합니다
	 * @return
	 */
	public boolean roll() {

			Rotaion++; //타이어회전 1증가
			if(Rotaion>maxRotation) { //누적회전수가 최대회전수보다 크면
				System.out.println("타이어를 교체하세요"); //교체알림
				return false;			
			}
			
			return true;

	}

}
