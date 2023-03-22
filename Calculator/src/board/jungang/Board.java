package board.jungang;

public class Board {
	
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	//생성자의 특징(메소드와 비교했을 때)
	//이름이 클래스명과 동일함
	//반환타입이 없다
	
	public Board(String title, String content) {
		this(title,content,"로그인한 회원아이디","현재 컴퓨터 날짜",0);
	}
	
	//생성자: 필드초기화
	//중복을 제거하기 위해 다른 생성자를 호출
	public Board(String title, String content, String writer, String date, int hitcount) {
		this.title=title;
		this.content=content;
		this.writer=writer;
		this.date=date;
		this.hitcount=hitcount;

	}
	
	
	
	
	
}
