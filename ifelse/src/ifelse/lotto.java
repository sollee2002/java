package ifelse;

public class lotto {

	public static void main(String[] args) {
		//1부터 45까지의 수 중에서 무작위로 5개의 숫자를 출력
		//카운트 : 숫자를 출력할 때마다 1씩 증가
		
		int i = 0;
		System.out.println("=======================\n[오늘의 로또번호]");
		
		//카운트
		while(i<5) {
			int lotto = (int)(Math.random() * 45) + 1;
			i++;
			System.out.print(lotto+" ");
			
			if(i==5) {
				
				System.out.println("\n=======================");
			}
		}
		
		
		
		
		
		
		
	}
	
}
