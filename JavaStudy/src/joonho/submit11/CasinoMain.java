package joonho.submit11;

import java.util.ArrayList;
import java.util.Scanner;

public class CasinoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberDB memDB = MemberDB.getInstance();
		Game game = new Game();
		
		
		casino : while(true) {
			System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⢿⣿⣿⡿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⠀⢀⣿⣇⣄⣠⣿⣅⣀⣸⣿⣤⣠⣸⣿⣠⣀⣼⣯⣀⣀⣿⣧⣀⣤⣿⣇⣀⣠⣿⣄⣀⣸⣿⣀⣀⣼⣿⡀⢨⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⡀⢸⣿⣿⡿⠟⠛⠛⢿⣿⣿⠟⠛⢻⣿⣿⠟⠛⠛⠻⣟⡛⠛⣛⡟⠛⢿⣿⠛⢻⣿⡿⠛⠛⠻⣿⣿⣿⡇⢠⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⠿⢿⣿⣿⠃⢠⣾⣆⣀⣿⡟⠀⡄⠘⣿⡇⠀⠾⣷⣴⣿⡇⠀⣿⡇⠀⠈⢿⠀⢸⣿⠀⢰⣷⠀⢸⣿⣿⡿⢿⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⡀⢸⣿⣿⡆⢸⣿⣿⣿⣿⠇⠰⠿⠀⢻⣿⣦⣤⣀⠙⣿⡇⠀⣿⡇⢰⣧⠈⠃⢸⣿⠀⢸⣿⠀⢸⣿⣿⡇⢨⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⠿⢿⣿⣿⣇⠈⠿⠃⢠⡿⠀⣤⣤⣄⠘⣟⠉⠻⠟⠀⣼⡇⠀⣿⡇⢸⣿⣧⠀⢸⣿⡀⠸⠟⠀⣸⣿⣿⡿⢿⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⠀⣸⣿⣿⣿⣷⣶⣶⣿⣷⣶⣿⣿⣿⣶⣿⣷⣶⣶⣿⣷⣶⣶⣾⣷⣾⣿⣿⣷⣾⣿⣿⣶⣶⣾⣿⣿⣿⡇⢨⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⠿⢿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⡟⢿⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⣀⣀⣿⣇⣀⣀⣿⣅⣀⣸⣿⣀⣀⣸⣿⣀⣀⣼⣯⣀⣀⣿⣇⣀⣀⣿⣇⣀⣀⣿⣄⣀⣸⣿⣀⣀⣼⣿⣀⣨⣿⣿⣿⣿⣿\n" + 
					"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			System.out.println("어서오세요 원하시는 항목을 선택해주세요 \n");
			System.out.println("1. 게임룰 보기 | 2. 게임선택 | 3. 코인충전 | 4. 회원가입 | 5.회원목록 | 6.종료");
			System.out.print(">>> ");
			int command = Integer.parseInt(scan.nextLine());
			
			
			if(command == 1){
				//TODO 게임방법
				System.out.println("========== 게임룰 ==========");
				System.out.println("게임을 선택해주세요\n");
				System.out.println("1. 슬롯머신 || 2. 랜덤게임");
				System.out.print(">>> ");
				int roolSelect = Integer.parseInt(scan.nextLine());
				if(roolSelect == 1) {
					System.out.println("========== 슬롯머신 ==========");
					System.out.println("1~7 까지의 랜덤한 숫자가 3개 나옵니다.\n");
					System.out.println("이 3개의 숫자가 같다면 게임비용의 10배\n");
					System.out.println("이 3개의 숫자가 7 7 7 이렇게 7이 3번나온다면 20배\n");
				}else if(roolSelect == 2) {
					System.out.println("==========랜덤 게임==========");
					System.out.println("1~20 까지의 랜덤한 숫자가 3개 등장합니다.\n");
					System.out.println("플레이어가 3개의 숫자를 선택합니다.\n");
					System.out.println("3개의 숫자를선택해 1개가맞으면 게임비용의 3배\n");
					System.out.println("3개의 숫자를선택해 2개가맞으면 게임비용의 8배\n");
					System.out.println("3개의 숫자를선택해 3개가맞으면 게임비용의 20배\n");
				}
				
			}else if(command ==2 ){
				//게임선택
				System.out.println("게임을 선택해주세요");
				System.out.println("1. 슬롯머신 || 2. 랜덤게임 ||3. 이전으로 ");
				System.out.print(">>> ");
				int select = Integer.parseInt(scan.nextLine());
				
				if(select == 1) {
					//슬롯머신
					System.out.println("플레이할 아이디와 비밀번호를 입력해주세요");
					System.out.print("ID : ");
					String idCheck = scan.nextLine();
					System.out.print("PW : ");
					String pwCheck = scan.nextLine();
					
					
					
					slot : while(memDB.check(idCheck,pwCheck)==true) { 
						
						System.out.println("슬롯머신 || 1회 1000 coin");
						memDB.nowCoinShow(idCheck); // 보유한금액 보이는 메소드
						System.out.println("1. 진행 || 2.슬롯머신 나가기");
						System.out.print(">>> ");
						int want = Integer.parseInt(scan.nextLine());
						if((want == 1) && (memDB.checkCoin(idCheck) == 1)) {
							 
							memDB.slotPlay(idCheck); // 실행되면 -1000코인
							int random1 = (int)(Math.random()*7)+1; //첫번째 랜덤정수
							int random2 = (int)(Math.random()*7)+1; //두번째 랜덤정수
							int random3 = (int)(Math.random()*7)+1; //세번째 랜덤정수
							System.out.println("========== 슬롯머신 ==========");
							System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
									"⣿⣿⣿⣿⣿⡟⢛⣛⣛⣛⣛⡛⢛⣛⣛⣛⣛⡛⢛⣛⣛⣛⣛⣛⢻⣿⣿⣿⣿⣿\n" + 
									"⣿⣿⣿⣿⣿⡇⡇⠈⠤⠜⠀⠀⡇⠈⠋⠛⠁⢸⢸⠀⠛⠛⠃⠈⢸⣿⣿⣿⣿⣿\n" + 
									"⣿⣿⣿⣿⣿⡇⡇     ⡇    ⢸⢸⠀    ⢸⣿⣿⣿⣿⣿\n" + 
									"⣿⣿⣿⣿⣿⡇⡇  "+random1+  "  ⡇  "+random2+" ⢸⢸⠀ "+random3+" ⠀⢸⣿⣿⣿⣿⣿\n" + 
									"⣿⣿⣿⣿⣿⡇⡇    ⠀⡇    ⢸⢸⠀    ⢸⣿⣿⣿⣿⣿\n" + 
									"⣿⣿⣿⣿⣿⡇⡇⢠⣶⣾⡓⡀⢇⠀⡃⠆⡀⡸⢸⢀⣨⣻⡁⢀⢸⣿⣿⣿⣿⣿\n" + 
									"⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣾⣿⣿⣿⣿⣿\n" + 
									"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
							
							memDB.winCoin(idCheck, game.SlotMoney(random1, random2, random3));
							
							
						}else {
							break slot;
						}
					}
				}else if(select == 2) {
					//TODO 랜덤게임
					System.out.println("플레이할 아이디와 비밀번호를 입력해주세요");
					System.out.print("ID : ");
					String idCheck = scan.nextLine();
					System.out.print("PW : ");
					String pwCheck = scan.nextLine();
					
					random : while(memDB.check(idCheck,pwCheck)==true) { 
						System.out.println("랜덤게임 || 1회 1000 Coin");
						memDB.nowCoinShow(idCheck); // 보유한금액 보이는 메소드
						System.out.println("\n1. 진행 || 2.랜덤게임 나가기");
						System.out.print(">>> ");
						int want = Integer.parseInt(scan.nextLine());
						if((want == 1) && (memDB.checkCoin(idCheck) == 1)) {
							int[] myRand = game.makeRandom();
							memDB.slotPlay(idCheck);
							System.out.println("3개의 숫자를 선택해주세요");
							System.out.print(">>> ");
							int numberSelect1 = Integer.parseInt(scan.nextLine());
							System.out.print(">>> ");
							int numberSelect2 = Integer.parseInt(scan.nextLine());
							System.out.print(">>> ");
							int numberSelect3 = Integer.parseInt(scan.nextLine());
							
							System.out.println("\n랜덤한숫자는  ||" +myRand[0] + " "+myRand[1]+" " +myRand[2] + "||   입니다\n");
							
							//랜덤한숫자 3개 배열을 선택한 숫자와비교하고 보상을 리턴해주는 메소드와 
							//그에맞는 보상을 그아이디에 추가하는 메소드
							memDB.winCoin(idCheck, game.randomMoney(myRand, numberSelect1, numberSelect2, numberSelect3));
						}else {
							break random;
						}
						
						
					}
				}
				
				
			}else if(command == 3){
				//코인충전
				System.out.println("어떤분의 코인을 충전하시겠습니까?");
				memDB.showMember();
				System.out.println("회원아이디을 입력해주세요 ");
				System.out.print(">>> ");
				String idSelect = scan.nextLine();
				System.out.println("충전할 코인을 입력해주세요 ");
				System.out.print(">>> ");
				int coinSelect = Integer.parseInt(scan.nextLine());
				
				memDB.coinRecharge(idSelect, coinSelect);
				
				
			}else if(command == 4) {
				// 회원가입 
				System.out.println("회원가입 입니다.");
				System.out.println("이름을 입력해주세요.");
				System.out.print(">>> ");
				String name = scan.nextLine();
				System.out.println("아이디를 입력해주세요");
				System.out.print(">>> ");
				String id = scan.nextLine();
				System.out.println("비밀번호를 입력해주세요");
				System.out.print(">>> ");
				String pw = scan.nextLine();
				Member mem = new Member(name,id,pw);
				memDB.registMem(mem);
				
			}else if(command == 5) {
				//회원목록
				
				memDB.showMember();
				
			}else {
				System.out.println("게임을 종료합니다");
				break casino;
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
