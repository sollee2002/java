package bmiEx;

public class mondai2_4 {
	
	public static void main(String[] args) {
		
		//1번
		String name = "김자바";
		int age = 25;
		String tel1 ="010", tel2="123",tel3="4567"; 
		
		System.out.println("println");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("전화: "+tel1+"-"+tel2+"-"+tel3);
		
		System.out.println("print");
		System.out.print("이름: "+name+"\n나이: "+age+"\n전화: "+tel1+"-"+tel2+"-"+tel3);
		
		System.out.println("\nprintf");
		System.out.printf("이름: %s \n나이: %d \n전화: %3$s-%4$s-%5$s\n",name,age,tel1,tel2,tel3);
		
		
		//해답
		System.out.println("이름: "+name);
		System.out.print("나이: "+age);
		System.out.printf("\n전화: %s-%s-%s",tel1,tel2,tel3);
		
		
	}

}
