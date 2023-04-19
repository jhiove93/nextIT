package joonho.submit07;

import java.util.ArrayList;
import java.util.Arrays;

public class Submit07 {

	public static void main(String[] args) {
//		Q.01
//		정수를 담을 수 있는 ArrayList 객체를 생성하고, 10부터 20 사이의 랜덤 숫자를 10개 담으시오. (10도 나오고 20도 나올 수 있어야 함)
		ArrayList<Integer> numbers = new ArrayList<>();
		int random = makeRandom(10,20);
		System.out.println(random);
		for(int i = 0; i <= 9; i++) {
			numbers.add(makeRandom(10,20));
		}
		System.out.println("랜덤숫자: " +numbers);
		
		
		System.out.println("\n============================================\n");
		//중복제거 
		ArrayList<Integer> numbersTwo = new ArrayList<>();
		for(int i = 0 ; i < numbers.size();i++) {
			// newList 안에 현재의 intList.get(i) 가 존재하지 
			// 않는 경우에만 추가해주기 
			if(!numbersTwo.contains(numbers.get(i) ) ) {
				numbersTwo.add(numbers.get(i));
			}
		}
		System.out.println("중복제거된값: "+ numbersTwo);
		
		//중복제거 두번째방법
		for(int i = 0 ; i < numbers.size(); i++) {
			
			for(int k = numbers.size()-1 ; k > i; k--) {       // 앞에서부터 지우면 배열인덱스값이 줄어 중복제거가 잘 되지않음
				if(numbers.get(i) == numbers.get(k)) {
					numbers.remove(k);
				}
			}
		}
		System.out.println("두번째 중복제거방법 : "+ numbers);
		
		
		for(int k=0; k< numbersTwo.size() -1 ; k++){
			for(int i = 0; i < numbersTwo.size() -1; i++) {
				if(numbersTwo.get(i) > numbersTwo.get(i+1)) {
					int t = numbersTwo.get(i);
					numbersTwo.set(i , numbersTwo.get(i+1));
					numbersTwo.set(i+1, t);
				}
			}
		}
		
		System.out.println("오름차순 : " + numbersTwo);
		
		
		for(int k=0; k< numbersTwo.size() -1 ; k++){
			for(int i = 0; i < numbersTwo.size() -1; i++) {
				if(numbersTwo.get(i) < numbersTwo.get(i+1)) {
					int t = numbersTwo.get(i);
					numbersTwo.set(i , numbersTwo.get(i+1));
					numbersTwo.set(i+1, t);
				}
			}
		}
		
		System.out.println("내림차순 : " + numbersTwo);
		
		System.out.println("\n==========================================\n");
		
//		Q. 02
//		아내가 사고 싶은 물건  ["냉장고", "로봇청소기", "세탁기", "에어컨"] 을 리스트에 담아주세요.
//		남편이 사고 싶은 물건 ["노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"] 을 다른 리스트에 담아주세요.
		
		ArrayList<String> girlList = new ArrayList<>();
		ArrayList<String> boyList = new ArrayList<>();
		girlList.add("냉장고");
		girlList.add("로봇청소기");
		girlList.add("세탁기");
		girlList.add("에어컨");
		boyList.add("노트북");
		boyList.add("TV");
		boyList.add("에어컨");
		boyList.add("플레이스테이션");
		boyList.add("로봇청소기");
		
		
		// 서로사고싶은 물건목록 
		ArrayList<String> wantList = new ArrayList<>(); 
		
		for(int i = 0 ; i < girlList.size() ; i++ ) {
			
			if(boyList.contains(girlList.get(i))) {
				wantList.add(girlList.get(i));
			}
		}
		System.out.println("서로사고싶은물건 :"+ wantList);
		
		// 교집합을 위한 .retainAll()
		
		wantList.clear();
		
		wantList.addAll(girlList); // 아내의 구매목록 전부를 담기
		wantList.retainAll(boyList); // 교집합 메소드
		System.out.println(wantList);
		
		ArrayList<String> allBuy = new ArrayList<>(); 
		allBuy.addAll(girlList);
		
		
		// 전체구매목록 
		for(int i = 0 ; i< boyList.size(); i++) {
			if(!allBuy.contains(boyList.get(i))){
				allBuy.add(boyList.get(i));
			}
			
		}
			
		System.out.println("사고싶은걸 다산다면 :" + allBuy);
		
		
		
		
	} //메인끝
	// 선생님답 
	public static int makeRandom1(int a, int b) {
		return (int)(Math.random() * (b-a+1)) + a; 
	}
	
	
	
	public static int makeRandom(int start, int end) {
		int idx = 0;
		out: while(true) {
		int rand =  (int)(Math.random() * end) +1 ;
			if(rand >= start) {
				return rand;
				
			}
			continue out;
		}
		
	}
//	public static int makeRandom(int start, int end) {
//		int[] result =  new int[10];
//		int idx = 0;
//		outer: while(true) {
//			int rand =  (int)(Math.random() * end) +1 ;
//			for(int i = 0 ; i < result.length; i++ ) {
//				if(result[i] == 10) {
//					continue outer;
//					
//				}
//			}
//			for(int i = 0 ; i< result.length; i++) {
//				if(result[i] <= start) {
//					result[idx] = rand;
//					idx++;
//				}
//				
//			}
//			if(idx== 10) {
//				break;
//			}
//			
//			
//		}
//		Arrays.sort(result);
//		
//		return result ;
//	}
	
		
	
}
