package exam02;

public class StudentEx {

	public static void main(String[] args) {
		
		Student stu = new Student("홍길동","123456-1234567",01);
		
		System.out.println(stu.name+" "+stu.ssn+" "+stu.studentNo);
		
		System.out.println("stu.toString()-----------------------------");
		System.out.println(stu.toString());
		

	}

}
