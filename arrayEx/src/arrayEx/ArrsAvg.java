package arrayEx;

public class ArrsAvg {

	public static void main(String[] args) {
		//평균
		
		int score[] = {100, 55, 90, 70, 75, 85, 85, 80, 90, 95};
		int sum=0;
		
		for(int i=0; i<score.length; i++) {
			System.out.printf("[%d] %d\n",i,score[i]);
			sum += score[i];
		}
		
		System.out.println("점수 합계: "+sum+"(점)");
		System.out.println("점수 평균: "+(double)sum/score.length+"(점)");
		
	}

}
