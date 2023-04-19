package joonho.submit02;

import java.util.Scanner;

public class Submit02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>> ");
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>> ");
		String koreaLg = scan.nextLine();
		
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>> ");
		String english = scan.nextLine();
		
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>> ");
		String math = scan.nextLine();
		
		System.out.println("이름: " + name );
		System.out.println("국어: " + koreaLg  );
		System.out.println("영어: " + english );
		System.out.println("수학: " + math );
		double intKoreaLg = Integer.parseInt(koreaLg);
		double intenglish = Integer.parseInt(english);
		double intmath = Integer.parseInt(math);
		double per = (intKoreaLg+intenglish+intmath)/3;
		System.out.printf("평균: %.02f\n" , per );
		String grade = (  per >= 90) ? ("A") : ( (per < 90 && per >=80 ) ? ("B") : ("C") );
		System.out.println("등급: " + grade);
		
		
		
		String idBack = "1231476";
		String idBackOne = idBack.substring(0, 1);
		int intIdBackOne = Integer.parseInt(idBackOne);
		String check = (intIdBackOne % 2 == 1 ) ? ("남자") : ("여자");
		System.out.println(check);
		
		
		
		
		
		
		
		
	}

}
