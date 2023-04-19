package joonho.submit11;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
	private int one;
	private int two;
	private int three;
	
	public Game(int one, int two, int three) {
		super();
		this.one = (int)(Math.random()*7)+1;
		this.two = (int)(Math.random()*7)+1;
		this.three = (int)(Math.random()*7)+1;
	}
	public Game() {}
	
	//슬롯머신의 배율 메소
	public int SlotMoney(int one , int two , int three) {
		if(one == 7) {
			if(two == 7) {
				if(three == 7) {
					System.out.println(" 7 7 7  || 20000코인 ||  당첨입니다!!");
					return 20; 
				}
			}
		}
		
		if(one ==two) {
			if(two == three) {
				System.out.println("같은숫자가 3개! || 10000코인 ||   당첨입니다.");
				return 10;
			}
		}
		
		return 0;
	}
	
	// 1~20까지의 3개의 랜덤한 숫자담는 메소드 
	public static int[] makeRandom() {
		int[] result = new int[3];
		
		int idx = 0;
		outer: while(true) {
			int rand = (int)(Math.random() * 20) +1 ;
			
			for(int i = 0 ; i < result.length; i++ ) {
				if(result[i] == rand) {
					continue outer;
				}
			}
			
			
			result[idx] = rand;
			idx++;
			
			if(idx == 3) {
				break;
			}
			
		}
		Arrays.sort(result);
		return result;
	}
	
	// 3개의 숫자를 받아 랜덤숫자 배열의 값과 같은지 확인하는 메소드.
	public int randomMoney(int[] random,int one,int two, int three ) {
		ArrayList<Integer> ran = new ArrayList<>();
		for(int i = 0 ; i < random.length; i++) {
			ran.add(random[i]);
		}
		for(int i = 0 ; i < ran.size(); i ++) {
			if(ran.contains(one)&& ran.contains(two)&& ran.contains(three)){
				System.out.println("3개를 다 맞추셨습니다");
				System.out.println("! 20배 !");
				return 20;
			}else if(ran.contains(one)|| ran.contains(two)|| ran.contains(three)) {
				if(ran.contains(one)&& ran.contains(two)){
					System.out.println("2개를 맞추셨습니다");
					System.out.println("! 8배 !");
					return 8;
				}else if(ran.contains(two) && ran.contains(three)){
					System.out.println("2개를 맞추셨습니다");
					System.out.println("! 8배 !");
					return 8;
				}else if(ran.contains(one) && ran.contains(three)) {
					System.out.println("2개를 맞추셨습니다");
					System.out.println("! 8배 !");
					return 8;
				}
			}
			if(ran.contains(one)|| ran.contains(two)|| ran.contains(three)) {
				System.out.println("1개를 맞추셨습니다");
				System.out.println("! 3배 !");
				return 3;
			
			}
			
		}
		System.out.println("맞추신 숫자는 0개 입니다.");
		return 0 ;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Slotmachine [one=" + one + ", two=" + two + ", three=" + three + "]";
	}
	public int getOne() {
		return one;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public int getTwo() {
		return two;
	}
	public void setTwo(int two) {
		this.two = two;
	}
	public int getThree() {
		return three;
	}
	public void setThree(int three) {
		this.three = three;
	}
	
	
	
}
