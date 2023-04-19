package joonho.submit11;

import java.util.ArrayList;

public class MemberDB {
	private ArrayList<Member> memList = new ArrayList<>();
	
	private MemberDB() {
		memList.add(new Member("배준호","a001","1234"));
	}
	
	private static MemberDB instance = new MemberDB();
	
	public static MemberDB getInstance() {
		return instance;
	}
	
	// 회원목록조회
	public void showMember() {
		for(int i = 0 ; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}
	}
	
	// 회원가입 하는 메소드 중복되면 불가
	public void registMem(Member mem) {
		for(int i = 0 ; i < memList.size(); i++) {
			if(mem.getId().equals(memList.get(i).getId())){
				System.out.println("중복된 아이디 입니다.");
				return;
			}
		}
		memList.add(mem);
	}
//	 코인충전 메소드 
	public void coinRecharge(String id,int coin) {
		for(int i = 0 ; i < memList.size(); i++) {
			if(memList.get(i).getId().equals(id)) {
				System.out.println(memList.get(i).getId() + "의 코인을 충전합니다.");
				memList.get(i).setCoin(memList.get(i).getCoin()+coin);
			}
		}
	}
		
	// 아이디 비밀번호 확인 메소드
	public boolean check(String id, String pw) {
		boolean check = false;
		for(int i = 0 ; i < memList.size(); i++) {
			if(memList.get(i).getId().equals(id)) {
				if(memList.get(i).getPw().equals(pw)) {
					return check = true;
				}
			}
			
		}
		System.out.println("아이디 비밀번호가 틀립니다.");
		System.out.println("초기화면으로 돌아갑니다");
		return false;
		
		
	}
	// 승리보상금 충전메소드
	public void winCoin(String id,int win){
		for(int i = 0 ; i < memList.size(); i++) {
			memList.get(i).setCoin(memList.get(i).getCoin()+(1000*win));
		}
		
	}
	// 현재가진코인 메소드
	public void nowCoinShow(String id) {
		for(int i = 0 ; i < memList.size(); i++) {
			if(memList.get(i).getId().equals(id)) {
				System.out.println("현재코인은 "+memList.get(i).getCoin() + "을 보유중입니다.");
			}
		}
	}
	
	// 슬롯머신 1회당 차감 천원메소드
	public void slotPlay(String id) {
		for(int i = 0 ; i < memList.size(); i++) {
			if(memList.get(i).getId().equals(id)) {
				memList.get(i).setCoin(memList.get(i).getCoin()-1000);
			}
		}
	}
	//코인 1000이 아닌지 확인
	public int checkCoin(String id ) {
		int no = 0;
		for(int i = 0; i <memList.size(); i++) {
			if(memList.get(i).getId().equals(id)) {
				if(memList.get(i).getCoin() >=1000) {
					return no = 1;
				}else if(memList.get(i).getCoin()< 1000) {
					System.out.println("보유코인이 부족합니다.");
					return no = 0;
				}
			}
			
		}
		System.out.println("보유코인이 부족합니다.");
		return no;
		
	}
	
}
