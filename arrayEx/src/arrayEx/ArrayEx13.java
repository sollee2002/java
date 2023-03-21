package arrayEx;

public class ArrayEx13 {

	public static void main(String[] args) {
		
		//향상된 for문을 이용해 점수 총합 구하기
		int[] score = {100,55,95,70,90};
		int i = 0;
		
		for(int scores : score) {
			System.out.println(scores);
			i+=scores;
		}
		
		System.out.println("점수 합계: "+i);
		System.out.println("평균 점수: "+i/score.length);

	}

}
