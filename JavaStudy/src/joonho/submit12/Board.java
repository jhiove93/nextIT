package joonho.submit12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	int number;
	String title;
	String detail;
	String toDate;
	
	public Board() {}
	
	public Board(String title, String detail) {
		BoardDB boardDB = BoardDB.getInstance();
		Date write = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String dateStr = sdf.format(write);
		this.number = boardDB.makeBoardNum();
		this.title = title;
		this.detail = detail;
		this.toDate = dateStr;
	}
	
	
	
	

	@Override
	public String toString() {
		return  "["+number + ". |" + title + "| "+" | " + toDate + "]";
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
