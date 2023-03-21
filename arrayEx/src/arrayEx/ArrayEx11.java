package arrayEx;

public class ArrayEx11 {

	public static void main(String[] args) {
		
		String[] oldArray = {"java","array","copy"};
		String[] newArray = new String[5];
		
		//(원본배열, 복사시작 index, 새로만든배열, 새배열의 복사를 시작할 index, 복사할 갯수)
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		//old배열의 0번부터 new배열의 0번으로 old배열의 길이만큼 붙여넣어
		
		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
		} //복사된 값 3개 제외 2칸은 null 값 출력
		
		System.out.println("=======향상된 for문");
		//향상된 for문을 이용하는 방법
		//for(타입 변수명 : 배열의 이름)
		//배열의 요소를 모두 순회합니다. 0<배열명.length
		//배열이름[인덱스]
		for(String str : newArray) {
			System.out.println(str);
		}
		
		
	}

}
