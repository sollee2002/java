package getter.setter;

public class SingletonMain {
	
	public static void main(String[] args) {
		
		SingletonEx ex1 = SingletonEx.getInstance();
		SingletonEx ex2 = SingletonEx.getInstance();
		SingletonEx ex3 = SingletonEx.getInstance();
		
		//같은 주소를 가지고 있는지 확인
		if(ex1== ex2) {
			System.out.println("같은 객체입니다");
		} else {
			System.out.println("다른 객체입니다");
		}
		
		
		
		
		
		
	}
	
	
	

}
