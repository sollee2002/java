package connection;

import java.sql.Date;

public class Book {
		int no;
		String title;
		String author;
		String isrent;
		Date regdate;
		Date editdate;
		
		public Book(int no, String title, String author,
				String isrent, Date regdate, Date editdate) {
			this.no = no;
			this.title = title;
			this.author = author;
			this.isrent = isrent;
			this.regdate = regdate;
			this.editdate = editdate;
		}
	

		@Override
		public String toString() {
			return getNo()+" "+getTitle()+" "+getAuthor()+" "+getIsrent()+" "+getRegdate()+" "+getEditdate();
		
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getIsrent() {
			return isrent;
		}

		public void setIsrent(String isrent) {
			this.isrent = isrent;
		}

		public Date getRegdate() {
			return regdate;
		}

		public void setRegdate(Date regdate) {
			this.regdate = regdate;
		}

		public Date getEditdate() {
			return editdate;
		}

		public void setEditdate(Date editdate) {
			this.editdate = editdate;
		}
		
		
		
}
