package com.ex;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] sArr = new Student[3];
		
		sArr[0]=new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		sArr[1]=new Student("김말똥",21,187.3,80.0,2,"경영학과");
		sArr[2]=new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(Student s : sArr) {
			System.out.println(s.information());
		}
		
		Employee[] eArr  = new Employee[10];
		int index=0;
		
		System.out.println("[사원 정보 입력]");
		
		while(true) {
			
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
			
			eArr[index]=new Employee(name,age,height,weight,salary,dept);
			index++;
			
			if(index!=10) {
				System.out.println("계속 입력하기 : Y 또는 y\n그만 입력하기 : N 또는 n");
				String c = sc.next();
				
				if("Y".equals(c)||"y".equals(c)) {
					continue;
				} else if("N".equals(c)||"n".equals(c)){
					break;
				}
			} else {
				break;
			}
			
		}
		
		for(Employee e : eArr) {
			if(e==null) {
				break;
			}
			System.out.println(e.information());
		}
		
		
		
		
		
	}

}
