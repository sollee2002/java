package pj;

public class lotto {
	
	public static void main(String[] args) {
		
		int[] lotto = new int[6];

		for(int i =0; i<lotto.length; i++) { // 길이 6 배열에 로또 저장

			int num = (int)((Math.random()*45)+1); // 랜덤숫자 뽑기
			lotto[i] = num;
			
			for(int j=0; j<i; j++) {
			if(lotto[i]==lotto[j]) { //중복 체크
			
			i--;
			}
			}

		}

		for(int i=0; i<lotto.length; i++) { //로또 출력
		System.out.print(lotto[i]+" ");
		}
		
	}

}
