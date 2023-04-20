package joonho.submit12;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardDB boardDB = BoardDB.getInstance();
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 글 목록 | 2. 글쓰기 | 3. 종료");
			System.out.print(">>>  ");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				//TODO 글목록
				boardDB.boardList();
			}else if(select == 2) {
				//TODO 글쓰기
				System.out.println("글 제목을 입력해주세요");
				System.out.print(">>>   ");
				String title = scan.nextLine();
				System.out.println("글 내용을 입력해주세요");
				System.out.print(">>>   ");
				String detail = scan.nextLine();
				
				boardDB.write(title, detail);
				
			}else {
				System.out.println("종료합니다.");
				break;
			}
			
			
			
			
		}
		
		
		
		
		
		
	}

}
