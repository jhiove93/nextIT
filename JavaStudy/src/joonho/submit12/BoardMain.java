package joonho.submit12;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		ArrayList<Board> board = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 글 목록 | 2. 글쓰기 | 3. 종료");
			System.out.print(">>>   ");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				//TODO 글목록
				
				//테스트주석 ㅇㅇㅇㅇㅇ
			}else if(select == 2) {
				//TODO 글쓰기
				
				
			}
			
			
			
			
		}
		
		
		
		
		
		
	}

}
