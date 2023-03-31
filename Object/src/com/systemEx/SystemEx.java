package com.systemEx;

public class SystemEx {
	
	public static void main(String[] args) throws InterruptedException {
		//수행시간 구하기
		//1000분의 1초를 구합니다
		
		Long startTime = System.currentTimeMillis();
		
//		System.in
//		system.out
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum += i;
			
			if(i==4) {
				//JVM 강제 종료
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			Thread.sleep(1000); //1초대기
		}
		
		System.out.println("총 합계는 : "+sum);
		
		Long endTime =System.currentTimeMillis();
		
		System.out.println("소요시간: "+((long)(endTime-startTime)/1000)+"초");
		
	}

}
