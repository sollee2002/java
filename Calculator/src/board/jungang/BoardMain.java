package board.jungang;

public class BoardMain {

	public static void main(String[] args) {
		
		//ctrl+shift+r 리소스 찾기
		
		//게시글 생성
		Board b1 = new Board("게시글1", "어려워요1","작성자1","23-03-22-1",11);
		Board b2 = new Board("게시글2", "어려워요2","작성자2","23-03-22-2",12);
		Board b3 = new Board("게시글3", "어려워요3","작성자3","23-03-22-3",13);
		Board b4 = new Board("게시글4", "어려워요4","작성자4","23-03-22-4",14);
		Board b5 = new Board("게시글5", "어려워요5","작성자5","23-03-22-5",15);
		
		//생성한 게시글을 배열로 생성
		Board[] boardList = new Board[5];
		boardList[0]=b1;
		boardList[1]=b2;
		boardList[2]=b3;
		boardList[3]=b4;
		boardList[4]=b5;
		
		//게시글 리스트 생성
		BoardList list =new BoardList(boardList);
		
		//타입[] 이름 = new 타입[갯수];
		
		for(Board board: boardList) {
			System.out.println("=====================");
			System.out.println(board.title);
			System.out.println(board.content);
			System.out.println(board.writer);
			System.out.println(board.date);
			System.out.println(board.hitcount);
		}
		
		
		
		
		
		
		

	}

}
