package getConnection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	
	public static void main(String[] args) {
		// 컬렉션프레임워크
		// 데이터를 효율적으로 관리(추가, 삭제, 검색, 저장)할 수 있는 자료구조
		// List : 인덱스로 관리
		// Set : 중복을 허용하지 않음
		// Map : key, value 형태로 이루어짐
		
		Set lotto = new HashSet<Integer>();
		
		while(lotto.size()<6) {
			int i = (int)(Math.random()*45)+1;
			
			lotto.add(i);
			System.out.println("추출"+i);
			System.out.println(lotto);
			
		}
		/*
		 * 컬렉션에서 요소를 제어하는 기능
		 * next(), previous()를 사용하여 앞뒤로 이동이 가능
		 * hasNext()를 사용하여 다음요소가 있는지 확인하는 기능
		 */
		System.out.println("==================================");
		Iterator i = lotto.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
			
		}
	}
	

}
