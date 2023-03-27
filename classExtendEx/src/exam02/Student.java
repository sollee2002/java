package exam02;

//자식클래스에서 부모클래스를 정의한다
//자식이 부모를 선택
public class Student extends People {
	
	
	public int studentNo;
	
	
	public Student(String name,String ssn, int studentNo) {
		super(name, ssn); //부모클래스가 가진 생성자, 메소드 호출
		this.studentNo=studentNo;
	}

	
	@Override
	public String toString() {
		return name+" "+ssn+" "+studentNo;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
}
