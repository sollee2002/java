package exam03_Tire;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		//부모가 가진 생성자를 호출
		//생성자를 만들면 기본생성자가 생성되지 않는다
		super(location, maxRotation+2);
	}

//	@Override
//	public boolean roll() {
//		return super.roll();
//	}
	
	@Override
	public boolean roll() { //메소드 재정의
		Rotaion++; //타이어회전 1증가
		System.out.println("******금호타이어"+location+"누적 회전수: "+Rotaion);
		System.out.println("******금호타이어"+location+"최대 회전수: "+maxRotation);
		if(Rotaion>=maxRotation) { //누적회전수가 최대회전수보다 크면
			System.out.println("타이어를 교체하세요"); //교체알림
			return false;			
		}
		
		return true;
	}


	
	
	
	
	

}
