package joonho.submit08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Submit08 {

	public static void main(String[] args) {
//		Q. 01
//		makeLotto를 ArrayList와 HashSet을 이용해서 만들어보세요
//		Hint
//		먼저 빈 HashSet을 하나 만들고, while문 내에서 빈 HashSet에 랜덤 로또 번호를 HashSet의 사이즈가 6개가 될 때까지 넣는다.
//		이후 HashSet을 ArrayList로 변환한 다음, 오름차순으로 ArrayList를 정렬하여 리턴한다
		System.out.println("\n============================= 1 번 ================================\n");
		ArrayList<Integer> myLotto = makeLotto();
		System.out.println(myLotto);
		
		
		System.out.println("\n=============================  2번 ===============================\n");
		
//		Q. 02
//		infoMap의 Key는 사용자의 아이디, Value는 사용자의 비밀번호라고 했을 때 아래와 같이 데이터를 추가해주세요.
		
		HashMap<String, String> infoMap = new HashMap<>();
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
//		사용자가 아이디와 비밀번호를 파라미터로 넣었을때, 
//		infoMap의 Key(아이디)와 Value(비밀번호)와 비교하여
//		아이디와 비밀번호가 infoMap 내에 존재하는 데이터와 일치하면 로그인 성공 출력
//		아이디가 존재하지 않으면, 존재하지 않는 아이디입니다. 출력 
//		아이디는 존재하지만 비밀번호가 일치하지 않으면 비밀번호가 틀렸습니다. 출력
		Scanner scan = new Scanner(System.in);
		Set<String> idset = infoMap.keySet();
		
		
		
		// 입력한 id가 key값중 존재하면 true, 없으면false
//		infoMap.containsKey(id);
		
		// 입력한 id가 key값 중에 존재하면 value리턴 , 없으면 null리턴
		// 입력한 id가 key값 중에 존재하면 null이 아님, 없으면 null리턴
//		infoMap.get(id);
		
		
		outer : while(true) {
			System.out.println("아이디를 입력해주세요 : ");
			System.out.print(">>>>  ");
			String id = scan.nextLine();
			for(String strid : idset) {
				if(idset.contains(id)) {
					System.out.println("비밀번호를 입력해주세요 : ");
					System.out.print(">>>>  ");
					String pass = scan.nextLine();
					for(String strpass : idset) {
						if( infoMap.get(id).equals(pass) ) {
							System.out.println("로그인성공");
							break outer;
						}else {
							System.out.println("비밀번호가 틀렸습니다.");
							break;
						}
						
					}
				}else {
					System.out.println("존재하지 않는 아이디입니다.");
					break;
				}
				
			}

			
		}
		
		
		
		
		
		
		
		
	}//메인끝
	
	public static ArrayList<Integer> makeLotto() {
		HashSet<Integer> result = new HashSet<>();
		ArrayList<Integer> arrayNum = new ArrayList<>();
		int idx = 0;
		outer : while(true) {
			int random = (int)(Math.random() * 45) +1 ;
			for(int num : result) {
				if(result.contains(random)) {           //HashSet은 중복이 들어가지 않으니 중복제거 할필요가없음 
					continue outer;
				}
			}
			
			result.add(random);
			
			if(result.size() == 6) {     //hashSet result 에 사이즈6이 될때까지 담는다
				break;
			}
		}
		for(Integer num : result) {
			arrayNum.add(num);
		}
		Collections.sort(arrayNum);
		return arrayNum;
	}
		
		
		
		
		
		
	
		
	
	
	
	
	
}
