package boardEx;

public class BoardExMain_02 {

	public static void main(String[] args) {
		//정보 생성
		//BoardEx_02에서 가져오기
		
		BoardEx_02 b1 = new BoardEx_02("김자바",20);
		BoardEx_02 b2 = new BoardEx_02("나자바",26);
		
		//정보를 리스트에 넣기
		//BoardEx_02 값을 배열에 넣기
		BoardEx_02[] list = new BoardEx_02[2];
		list[0]=b1;
		list[1]=b2;
		
		//정보 출력
		for(BoardEx_02 boards : list) {
			System.out.println(boards.name);
			System.out.println(boards.age);
		}

	}

}
