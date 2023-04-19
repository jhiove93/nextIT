package joonho.submit10;

import java.util.ArrayList;


public class Library {
	
	// 선언부 
	private ArrayList<Book> bookList = new ArrayList<>();
	

	
	
	private Library() {
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
		
		String bList[] = strBooks.split(",");
		ArrayList<String> booklst = new ArrayList<>();
		for(int i = 0 ; i < bList.length; i++) {
			bList[i] = bList[i].trim();
		}
		
		for(int i = 0; i < bList.length; i++ ) {
			booklst.add(bList[i]);
		}
		for (int i = 0 ; i < booklst.size() ; i++) {
			bookList.add(new Book(makeBookNo(),booklst.get(i),"입고중"));
		}
	}
	
	//책입고
	public void bookReturn(int num) {
		for(int i = 0 ; i < bookList.size(); i++) {
			if(num == bookList.get(i).getBookNo()) {
				System.out.println(bookList.get(i)+"가 입고되었습니다.");
				bookList.get(i).setRental("입고중");
			}
		}
		
	}
	// 책검색 + 검색된 책 목록리턴
	public ArrayList<Book> serchBookList(String keyword){
		ArrayList<Book> result = new ArrayList<>();
		for(int i = 0 ; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				result.add(bookList.get(i));
			}
		}
		
		return result;
	}
	
	
	
	//책 대여  1
	public void nowRental(int num){
		for(int i = 0 ; i < bookList.size() ; i ++) {
			if(bookList.get(i).getBookNo()==num) {
				if(bookList.get(i).getRental().equals("대여중")) {
					System.out.println("이미 대여중입니다.");
				}else {
					System.out.println(bookList.get(i).getTitle() + "를 대여하셨습니다.");
					bookList.get(i).setRental("대여중");
				}
			}
		}
		
	}
	
	//책 검색 
	public void serchBook(String name) {
		ArrayList serchBk = new ArrayList<>();
		for(int i = 0 ; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(name)) {
				serchBk.add(bookList.get(i));
			}
		}
		for(int i = 0; i < serchBk.size(); i ++) {
			System.out.println(serchBk.get(i));
		}
	}
	
	private static Library instance = new Library();
	
	
	public static Library getInstance() {
		return instance;
	}
	
	
	public int makeBookNo() {
		return bookList.size()+1;
	}
	
	//책 목록 조회
	public void showBookList() {
		for(int i = 0 ; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	
	
	
	
}
