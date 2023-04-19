package joonho.submit03;

public class Submit03 {

	public static void main(String[] args) {
		
		//for문을 사용해서 10팩토리얼의 값을 출력해주세요.
		// 1 x2 x3 x4 x5 x6 x7... x10
		
		int sum = 1;
		for(int i = 1; i <= 10 ; i++ ) {
			sum = sum * i ;
			}
		System.out.println(sum);
		
		
		long sum1 = 1;
		for(long i = 1; i <= 15 ; i++ ) {
			sum1 = sum1 * i ;
			}
		System.out.println(sum1);
		
//		Q. 02
//
//		월리를 찾아라!!
//
//		아래의 문자열 변수 findWally 중에 월리가 몇개 들어있는지 콘솔에 출력해주세요.

		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		
		int count = 0;
		for(int i = 0 ; i < findWally.length()-1; i++) {
			
			String str = findWally.substring(i,i+2);
			
			if(str.equals("월리")) {
			count++;
			}
			
		}
		System.out.println("월리의 개수: " + count);
		
		
//		Q. 03 거꾸로 트리를 5층 만들어주세요.
//		***** 
//		****
//		***
//		**
//		*
//		for문을 5번 반복하면서 stars를 아래와 같이 나오도록 잘라서 출력해보세요
		
		// i가  	0, 1, 2, 3, 4 일때
		// stars는  5, 4, 3, 2, 1 개  
		
		String stars = "*****";
		for(int i = 0 ; i < 5 ; i++) {
			String star = stars.substring(i);
			System.out.println(star);
		}
		
		
		//for문을 사용해서 8팩토리얼의 값을 출력해주세요.
		// 1 x2 x3 x4 x5 x6 x7..
		
		int sum2 =1 ; 
		for (int i = 1 ; i <= 4 ; i++ ) {
			sum2 = i * sum2;
			
			
		}System.out.println(sum2);
		
//		 1 2 6 24
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
