package scanner;

import java.io.IOException;

public class WhileEx {

	/**
	 * 키보드로부터 입력된 키코드를 출력합니다
	 * @param args
	 * @throws IOException
	 */
	
	public static void main(String[] args) throws IOException {
		
		//while () {} : 반복문
		//() 안의 값이 참이면 코드블럭을 계속해서 실행한다	
		
		//반복 () 안의 조건이 true이면 계속해서 코드블럭을 실행한다
		while(true) {
			
			//사용자의 입력을 대기
			System.out.println("키보드 입력을 기다리는 중입니다");
			int keycode = System.in.read();
			
				//Q나 q가 입력되면 반복을 종료
				// a || b : a 이거나 또는 b
				//keycode의 값이 113이거나 81인 경우 반복 종료
				if(keycode==113 || keycode == 81) {
					//break 문이 속해있는 반복문을 탈출 (내가 속한 반복문의 코드블럭)
					System.out.println("종료합니다");
					break;
				}
				
			System.out.println("============");
			//q를 입력했을 경우 출력되지 않도록 if 문장 아래로 출력 위치를 변경
			System.out.printf("keycode: %d\n",keycode);
			
		
		} 
		
		
	}
	
}
