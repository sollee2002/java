package objectEx;

import java.util.HashMap;

public class ObjectEx02 {
	
	public static void main(String[] args) {
		/**
		 * 		   타입   타입
		 * HashMap<Key, Value>
		 * 
		 * 해쉬맵 선언부
		 * HashMap<String, String> hashMap = new HashMap<>();
		 * 
		 * 동일한 키가 저장될 수 없다
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기
		 * 
		 * 1 홍길동
		 * 2 너잘난
		 * 3 나잘난
		 * 
		 */
		HashMap<String,String> hashMap = new HashMap<>();
		hashMap.put("key", "value"); //해쉬맵에 데이터 저장
		hashMap.put("key1", "value1");
		hashMap.put(new String("key"), "new value");
		
		String str = hashMap.get("key"); //저장 데이터 가져오기		
		System.out.println(str);

//		String str2 = hashMap.get("key1");	
//		System.out.println(str2);
		System.out.println(hashMap.get("key1"));
		
		System.out.println(hashMap.get("key2"));

		System.out.println("==========================");
		
		HashMap<Integer,String> hashMap2 = new HashMap<>();
		hashMap2.put(1, "홍길동");
		hashMap2.put(2, "너잘난");
		hashMap2.put(2, "나잘난");
		System.out.println("1 "+hashMap2.get(1));
		System.out.println("2 "+hashMap2.get(2));
		System.out.println("3 "+hashMap2.get(3));
		
		
		
		
		
	}
	
	

}
