package joonho.submit10;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Library lib = Library.getInstance();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 책 입고 | 2. 책 대여 | 3. 책 목록| 4. 책 검색 | 5. 종료");
			System.out.print(">>> ");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				// 책입고
				System.out.println("책 입고입니다.");
				System.out.println("입고할 책 번호를 입력해주세요.");
				System.out.print(">>> ");
				int returnInt = Integer.parseInt(scan.nextLine());
				
				lib.bookReturn(returnInt);
				
			}else if(select == 2) {
				// 책 대여
				//이건 첫번째꺼.
//				System.out.println("책번호를 입력해주세요");
//				System.out.print(">>> ");
//				int bookSelect = Integer.parseInt(scan.nextLine());
//				lib.nowRental(bookSelect);
				// @문제 
				System.out.println("책 이름을 입력해주세요 :");
				System.out.print(">>> ");
				String name = scan.nextLine();
				
				// name 을 포함하는 book객체들을 찾아서
				// 가져오기
				ArrayList<Book> serchList = lib.serchBookList(name);
				
				if(serchList.size()==0) {
					System.out.println("해당 책이 존재하지 않습니다.");
				}else if (serchList.size()==1) {
					lib.nowRental(serchList.get(0).getBookNo());
				}else {
					lib.serchBook(name);
					System.out.println("책번호를 입력해주세요");
					System.out.print(">>> ");
					int no = Integer.parseInt(scan.nextLine());
					lib.nowRental(no);
				}
				
			}else if(select == 3) {
				// 책 목록
				lib.showBookList();
				
			}else if(select == 4) {
				// 책 검색
				System.out.print("책 이름을 입력해주세요 :");
				String serchBook = scan.nextLine();
				lib.serchBook(serchBook);
				
			}else {
				System.out.println("종료합니다. ");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
