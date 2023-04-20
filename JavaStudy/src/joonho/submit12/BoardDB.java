package joonho.submit12;

import java.util.ArrayList;
import java.util.Date;

public class BoardDB {
	private ArrayList<Board> boardList = new ArrayList<>();
	
	private BoardDB() {
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	
	public int makeBoardNum() {
		return boardList.size()+1;
	}
	
	public void write(String title,String detail) {
		//제목이랑 내용 입력받아 boardList 에담기
		boardList.add(new Board(title,detail));
	}
	
	public void boardList() {
		for(int i=0 ; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
			
		}
	}
	
	
	
}
