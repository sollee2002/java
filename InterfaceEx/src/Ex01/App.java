package Ex01;

public class App {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

		public static void main(String[] args) {
			
			printSound(new Cat());
			printSound(new Dog());
	
		}
	

}
