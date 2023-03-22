package boardEx;

public class BoardMainEx {

	public static void main(String[] args) {
		
		//게시글 생성
		BoardEx b1 = new BoardEx("김자바",20);
		BoardEx b2 = new BoardEx("나자바",26);
		
		//게시글 목록에 게시글 저장
		BoardEx[] ListEx = new BoardEx[2];
		ListEx[0]=b1;
		ListEx[1]=b2;
		
		//BoardEx에 저장된 값을 boaard로 받아서 boardListEx만큼 반복해서 출력
		for(BoardEx board : ListEx) {
			System.out.println(board.name);
			System.out.println(board.age);
		}
		

	}

}
