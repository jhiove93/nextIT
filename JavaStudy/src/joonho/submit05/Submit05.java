package joonho.submit05;

public class Submit05 {

	public static void main(String[] args) {

		// Q.01
//		for문을 배울때, 트리를 참 많이 만들었죠?
//		근데 항상 5층짜리 트리여서 아쉬웠을거에요.
//		n층 짜리 트리를 출력할 수 있는 makeTree(int n) 메소드를 만들어서 실행시켜 주세요

		makeTree(5);
		makeTree(7);

		// Q.02
		// 로꾸꺼를 메소드로 만들어서
		// 파라미터로 들어온 String 문자열에 대해 뒤집은 결과를 리턴하는 메소드
//		실행결과
//		꺼꾸로 꺼꾸로

		String example = "로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);

		// Q.03
//		십진수를 이진수(String 타입)로 리턴해주는 makeBinary(int 타입) 함수를 만들어보세요
//		Hint
//		문자열 변수를 하나 선언해서 
//		입력받은 정수를 2로 나눈 나머지를 문자열 변수에 더한다.
//		그 다음 입력받은 정수를 2로 나눈 몫을 이용하여 위 과정을 반복한다.
//		2로 나눈 몫이 1이 된다면 반복을 종료한다.
//		이진수로 만들어진 문자열 변수를 거꾸로(로꾸꺼) 뒤집은 다음 리턴한다.

		
		
		
		
		String myBinaryStr = makeBinary(17);
		System.out.println(myBinaryStr);
		
		
		
		
		
		
		
		
		
		
	}// main 끝지점
//	Q.02

	public static String reverseStr(String str) {

		String rogu = "";
		String sum = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rogu = str.substring(i, i + 1);
			sum += rogu;

		}
		return sum;
	}

//	Q.03
	// 23 10111
	// 23/2 = 몫 11 , 나머지 23%2 	   = 1  ^ 
	// 11/2 = 몫 5  , 나머지 11%2 	   = 1  ^
 	// 5/2 =  몫 2  , 나머지 5%2       = 1  ^
	// 2/1 =  몫 1 (스탑) , 나머지 2%2 = 0	 ^
	//          >>>>>>>>>>>>>>>>>>>>>>>>>>>>>^
//	결과 : 10111
//	
	public static String makeBinary(int num) {

		// 반복횟수와 기준이 애매하면 while(true)
		boolean exit = true;
		String two = "";
		String sum = "";
		while (num >0) {
			if (num % 2 == 1) {
				two = (num % 2) + ""; // 1110
				num = num / 2;
			} else if (num % 2 == 0) {
				two = (num % 2) + "";
				num = num / 2;
			}
			sum = two + sum;
			}
		
		return sum;
	}

//	Q.01
	public static void makeTree(int sum) {

		for (int i = 0; i < sum; i++) {
			String space = "";
			for (int k = 0; k < sum - i; k++) {
				space += " ";
			}
			String stars = "";
			for (int k = 0; k < i + (i + 1); k++) {
				stars += "*";
			}
			System.out.println(space + stars);
		}
	}

}
