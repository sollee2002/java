package objectEx;

import java.util.HashMap;

public class ObjectEx3 {
	
	
	public static void main(String[] args) {
		
		ObjectEx3 check = new ObjectEx3();
//		check.chcekEquals();
		
		HashMap<Key, String> keymap = new HashMap<>();
		
		Key key1 = new Key(1);
		Key key2 = new Key(2);
		Key key3 = new Key(1);
		
		System.out.println("key1 == key3");
		System.out.println(key1.equals(key3));
		
		keymap.put(key1, "홍길동");
		keymap.put(key2, "나잘난");
		keymap.put(key3, "너잘난");
		
		System.out.println(keymap.get(key1));
		System.out.println(keymap.get(key2));
		System.out.println(keymap.get(key3));
		
		
		
	}
	
	
	
	public void chcekEquals() {
		
		Key key1 = new Key(1);
		Key key2 = new Key(1);
		
		//세로 선택 : Alt + Shift + A
		System.out.println("key1===================");
		System.out.println(key1.hashCode());
		System.out.println(key1.toString());
		System.out.println(Integer.toHexString(key1.hashCode()));
		
		System.out.println("key2===================");
		System.out.println(key2.hashCode());
		System.out.println(key2.toString());
		System.out.println(Integer.toHexString(key2.hashCode()));
		
		System.out.println("값 비교==================");
		System.out.println(key1.equals(key2));
	}

}
