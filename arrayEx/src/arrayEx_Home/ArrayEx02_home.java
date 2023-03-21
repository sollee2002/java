package arrayEx_Home;

import java.util.Scanner;

public class ArrayEx02_home {
	
	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("===================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("===================================================");
			System.out.println("선택> ");
			
			int selectNum = Integer.parseInt(sc.next());
			
			switch (selectNum) {
			case 1:
				System.out.println("학생수를 입력하세요");
				studentNum = sc.nextInt();
				scores = new int [studentNum];//학생수만큼의 배열길이 생성
				break;
				
			case 2:
				System.out.println("점수를 입력하세요");
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> ",i);
			
					scores[i]=sc.nextInt(); //학생인덱스에 입력한 점수 저장
					sum += scores[i]; //총합에 점수 저장
				}
				break;

			case 3:
				System.out.println("=====점수리스트=====");
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d\n",i,scores[i]);
				}
				break;
				
			case 4:
				
				for(int i=0; i<scores.length; i++) {
					if(max<scores[i]) { //최고점보다 인덱스의 값이 클 경우
						max = scores[i];//인덱스 값으로 max 대체
					}
				}
				
				System.out.println("최고 점수: "+max);
				System.out.printf("평균 점수: %.1f\n",(double)sum/scores.length);
				break;
				
			case 5:
				System.out.println("종료합니다");
				run = false;
				break;
			}
			
			
			
			
			
			
			
			
		}
		
	}
	

}
