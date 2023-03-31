package com.classEx;

public class ClassEx {
	
	public static void main(String[] args) {
		
		//객체로부터 직접 생성
//		Class clazz = Car.class; //클래스가 가진 데이터 가져오기
		
		Class clazz;
		try {
			//해당 경로(패키지를 포함한 경로이름)에 클래스가 존재할 경우 해당 클래스를 반환
			//없을 경우 오류발생
			
			
			//라이브러리가 잘 로드되었는지 확인할 때 사용
//			clazz = Class.forName("com.classEx.Car2"); <-- 오류발생
			clazz = Class.forName("com.classEx.Car");
			
			System.out.println(clazz.getName()); //이름 가져오기
			System.out.println(clazz.getSimpleName()); //클래스 이름 가져오기
			System.out.println(clazz.getPackage()); //패키지 가져오기
			
			//클래스 경로를 활용하여 리소스의 절대경로를 얻어오기
//			String path = clazz.getResource("photo1.jpg");
//			System.out.println(path);
			
			
			//해당 경로에서 클래스를 찾을 수 없을 때
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 정보 얻기 실패");
		} 
		
		
		
		
		
		
	}
	
	

}
