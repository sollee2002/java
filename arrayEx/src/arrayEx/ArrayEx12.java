package arrayEx;

public class ArrayEx12 {

	public static void main(String[] args) {
		int[] score = {80, 90, 70, 100};
		int i =0;
		//향상된 for문을 이용해 점수 총합 구하기

		for(int scores : score) {
			System.out.println(scores);
			i += scores;
		}
		
		System.out.println("점수 총합: "+i+"(점)");
		System.out.println("평균 점수: "+i/score.length+"(점)");
	}

}
