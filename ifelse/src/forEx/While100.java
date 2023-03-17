package forEx;

public class While100 {

		public static void main(String[] args) {
			
			int sum = 0;
			int i = 1;
			
			while(i<=100) {		
				System.out.println(i+"번째 반복");
				sum += i;
				System.out.println("현재 값: "+sum);
				i++;
			}
	
		}
	
	
}
