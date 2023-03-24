package getter.setter;

public class Car {

		private int speed;
		private boolean stop;
		
		public int getSpeed() { //필드값을 반환
			return speed;
		}
		public void setSpeed(int speed) { //필드값을 변경
			//검증 후 값을 변경합니다
			if(speed>0) {
				this.speed = speed;				
			} else {
				this.speed=0;
			}
		}
		public boolean isStop() { //메소드 이름이 is로 시작할 경우 t/f 값 반환
			//getter
			return stop;
		}
		public void setStop(boolean stop) {
			if(stop) {
				this.setSpeed(0);
				this.stop = stop;				
			}
		}
	
		
		
}
