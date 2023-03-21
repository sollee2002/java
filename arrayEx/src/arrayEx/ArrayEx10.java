package arrayEx;

public class ArrayEx10 {
	
	public static void main(String[] args) {
		//배열의 길이를 변경할 수 없으므로 
		//배열의 길이를 늘이거나 줄이기 위해서는 새로운 배열을 만들고
		//새로운 배열을 만들고 기존 배열을 복사한다
		
		//int 타입 배열을 선언
		//배열의 값 목록: 값{1,2,3}
		
		int[] oldArray = {1,2,3};
		int[] newArray = {0,0,0,0,0}; //new int[5];
		
		for(int i=0; i<oldArray.length; i++) {
			System.out.println(oldArray[i]);
			newArray[i] = oldArray[i];
			System.out.println("oldArray + i : "+oldArray[i]);
			System.out.println("newArray + i : "+newArray[i]);
		}
		
		//newArray출력
		System.out.println("=====newArray");
		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
	}

}
