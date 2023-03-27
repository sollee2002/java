package com.jungang;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		Student[] sArr = new Student[] {new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과"),
										new Student("김말똥",21,187.3,80.0,2,"경영학과"), 
										new Student("강개순",23,167.0,45.0,4,"정보통신학과")};
	
		//학생 명단 출력
		for(int i=0; i<sArr.length; i++) {
			sArr[i].information();
		}
	
		Employee[] eArr = new Employee[9]; 
		int temp=1;
		int max=10;
		
		while(true) {
			for(int i=0; i<eArr.length; i++) {
				
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
				
				System.out.println("사원 추가 y, 그만두기 n");
				String c = sc.next();
				
				if("Y".equals(c)||"y".equals(c)) {
					temp++;
					continue;
				} else if("N".equals(c)||"n".equals(c)) {					
					break;
				}
			}		
			break;
		}
	
		for(int i=0; i<temp; i++) {
			eArr[i].information();
		}
	
	

	}

}
