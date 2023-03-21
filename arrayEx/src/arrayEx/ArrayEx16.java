package arrayEx;

import java.util.Scanner;

public class ArrayEx16 {

	public static void main(String[] args) {
		//점수 입력받아 최고점수와 평균점수 구하기
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("===================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("===================================================");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(sc.next());
			
			if(selectNo==1) {
				System.out.println("학생수를 입력하세요");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if(selectNo==2) {
				System.out.println("점수를 입력하세요");
				for(int i=0; i<scores.length; i++) {
					scores[i]=Integer.parseInt(sc.next()); //
					System.out.printf("scores[%d]> %d\n",i,scores[i]);
					num += scores[i]; //
					
				}
			} else if(selectNo==3) {
				System.out.println("=====점수리스트=====");
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d\n",i,scores[i]);
				}
			} else if(selectNo==4) {
				System.out.println("최고 점수: ");
				System.out.println("평균 점수: "+num/scores.length);
				
			} else if(selectNo==5) {
				run=false;
			}
			
			
			
			
			
		}
		System.out.println("프로그램 종료");

	}

}
