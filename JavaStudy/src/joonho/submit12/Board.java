package joonho.submit12;

public class Board {
	int number;
	String title;
	String toDate;
	String detail;
	
	public Board() {}
	
	public Board(String title, String toDate, String detail) {
		super();//이거해야됨 해야됨 
		this.number = makeBoardNum();
		this.title = title;
		this.toDate = toDate;
		this.detail = detail;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Board [number=" + number + ", title=" + title + ", toDate=" + toDate + ", detail=" + detail + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
}
