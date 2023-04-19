package joonho.submit12;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardDB {
	private ArrayList<Board> boardList = new ArrayList<>();
	
	private BoardDB() {
		Date write = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String writeStr = sdf.format(write);
		boardList.add(new Board(boardList.size()+1,"첫번째글",writeStr,"무야호무야호"));
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	public ArrayList<Board> getBoardList(){
		return boardList;
	}
	
	public int makeBoardNum() {
		return boardList.size()+1;
	}
	
}
