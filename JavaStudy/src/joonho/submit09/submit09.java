package joonho.submit09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import ch09_class.school.Student;

public class submit09 {

	public static void main(String[] args) {
		System.out.println("\n============ 1번 =================\n");
		Product ref = new Product("냉장고",2000000);
		Product tv = new Product("TV",1000000);
		Product airC = new Product("에어컨",800000);
		Product com = new Product("컴퓨터",1300000);
		Product fan = new Product("선풍기",100000);
		
		ArrayList<Product> prodList = new ArrayList<>();
		prodList.add(ref);
		prodList.add(tv);
		prodList.add(airC);
		prodList.add(com);
		prodList.add(fan);
		
//		Collections.sort(prodList, (prodA,prodB)-> prodA.getPrice() - prodB.getPrice());
		
		for(int k=0; k< prodList.size() -1 ; k++){
			for(int i = 0; i < prodList.size() -1; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				if(prodList.get(i).getPrice() > prodList.get(i+1).getPrice() ) {
					 Product t = prodList.get(i);
					prodList.set(i , prodList.get(i+1));
					prodList.set(i+1, t);
				}
			}
		}
		for(int i = 0 ;  i < prodList.size(); i++) {
			System.out.println(prodList.get(i));
		}
		
		// indexOf()
		// ArrayList<String> ramen = ["신라면","안성탕면","진라면"]
		// ArrayList<Integer> number = [10, 20, 30]
		// ramen.indexOf("안성탕면") = 1
		
		// ArrayList<Product> proList = [Product객체(냉장고), Product객체(TV), .... ]
		// prodList.indexOf("TV") = x
		
		for(int i = 0; i < prodList.size() ; i++) {
			if(prodList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
			
		}
		
		System.out.println("\n==========================2 번 ===============================\n");
		Cafe starBucks = new Cafe("스타벅스");
		starBucks.addCoffee(new Coffee("아메리카노", 5000));
		starBucks.addCoffee(new Coffee("카푸치노", 6000));
		starBucks.addCoffee(new Coffee("오곡라떼", 7000));
		
		Cafe conte = new Cafe("꽁떼");
		conte.addCoffee(new Coffee("아메리카노", 2500));
		conte.addCoffee(new Coffee("바닐라라떼", 3000));
		conte.addCoffee(new Coffee("아이스티", 3500));
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 스타벅스 방문 | 2. 꽁떼 방문 | 3. 사무실 복귀..");
			System.out.print(">>> ");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				// TODO 스타벅스 방문
				System.out.println("어서오세요 스타벅스 입니다.");
				starBucks.showMenu();
				starBucks.buyCoffee(sc);
				
			}else if (select == 2 ) {
				//  TODO 꽁떼방문
				System.out.println("어서오세요 꽁떼 입니다.");
				conte.showMenu();
				conte.buyCoffee(sc);
				
			}else {
				// 사무실복귀
				System.out.println("사무실로 복귀합니다..");
				break;
			}
		}
		
			
		
		
		
		
	}

}
