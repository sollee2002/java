package com.jungang;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
//		Person hong = new Person();
//		Person kim = new Person();
//		Person kang = new Person();
//		
//		hong.setName("홍길동");
//		kim.setName("김말똥");
//		kang.setName("강개순");
		
//		Student[] sArr = new Student[] {new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과"),
//										new Student("김말똥",21,187.3,80.0,2,"경영학과"), 
//										new Student("강개순",23,167.0,45.0,4,"정보통신학과")};
		//배열 생성
		Student[] sArr = new Student[3];
		//학생 객체 생성
		Student s1=new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		sArr[0]=s1; //객체 생성 후 배열에 저장
		
		sArr[1]=new Student("김말똥",21,187.3,80.0,2,"경영학과"); //배열에 값 바로 생성
		sArr[2]=new Student("강개순",23,167.0,45.0,4,"정보통신학과");		
		
		//학생 명단 출력
//		for(int i=0; i<sArr.length; i++) {
//			sArr[i].information();
//		}
		
		for(Student s : sArr) {
			s.information();
		}
		
		Employee[] eArr = new Employee[10]; 
		int temp=0; //데이터가 저장된 배열 길이
		int max=10; //최대인원
		
		while(true) {
			for(int i=0; i<eArr.length; i++) {
				
				temp++;
				
				System.out.println("=====================");
				System.out.println("이름> ");
				String name = sc.next();
				
				System.out.println("나이> ");
				int age = sc.nextInt();
				
				System.out.println("신장> ");
				double height = sc.nextDouble();
				
				System.out.println("몸무게> ");
				double weight = sc.nextDouble();
				
				System.out.println("급여> ");
				int salary = sc.nextInt();
				
				System.out.println("부서> ");
				String dept = sc.next();
				
				eArr[i]=new Employee(name, age, height, weight, salary, dept);
				max--;
				System.out.println(max);
				
				
				if(max!=0) {
					System.out.println("사원 추가 y, 그만두기 n");
					String c = sc.next();
					if("Y".equals(c)||"y".equals(c)) {
						continue;
					} else if("N".equals(c)||"n".equals(c)) {					
						break;
					}					
				} else {
					break;
				}
			}		
			break;
		}
	
		for(int i=0; i<temp; i++) {
			eArr[i].information();
		}
	
//		for(Employee e : eArr) { //NullPointerException 발생
//			if(e == null) { //null 체크
//				break;  <-- NullPointerException 처리
//			}
//			System.out.println(e.information()); //e. <-- 주소접근연산자인 .을 이용할 경우 null은 주소를 가지고 있지 않으므로 오류발생
//		}
	

	}

}
