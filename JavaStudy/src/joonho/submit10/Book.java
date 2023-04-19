package joonho.submit10;

public class Book {
	private int bookNo;           //도서 번호
	private String title; 		  //도서 이름
	private String  rental; 	  //대여 여부
	
	public Book(int bookNo, String title, String rental) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.rental = rental;
	}
	
	@Override
	public String toString() {
		return "[책번호: " + bookNo + ", 책 제목: " + title + ", 대여상태: " + rental + "]";
	}

	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRental() {
		return rental;
	}

	public void setRental(String rental) {
		this.rental = rental;
	}
	
	
	
}
