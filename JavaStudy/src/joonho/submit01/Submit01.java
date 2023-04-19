package joonho.submit01;

public class Submit01 {

	public static void main(String[] args) {
		String name = "배준호";
		int age = 31;
		double height = 187.1;
		String phone = "010-2983-3931";
		String email = "jhiove93@naver.com";
		System.out.println("이름: "+name);
		System.out.println("나이: "+ age);
		System.out.println("키: " + height);
		System.out.println("연락처: " + phone);
		System.out.println("이메일: " + email);
		
		String enigma = "너오구늘리뭐너먹구지리";
		enigma = enigma.replace("너", "");
		enigma = enigma.replace("구", "");
		enigma = enigma.replace("리", "");
		System.out.println(enigma);
	
		
		int example = 278;
		String strex = example + "";
		int numOne = Integer.parseInt(strex.charAt(0)+"");
		int numTwo = Integer.parseInt(strex.charAt(1)+"");
		int numThree = Integer.parseInt(strex.charAt(2)+"");
		System.out.println(numOne+numTwo+numThree);
		
		
		
		
		
		
		
		
		// Q.01
		
		String name1 = "배준호";
		int age1 = 31;
		double height1 = 187.0;
		String phone1 = "010-2983-3931" ;
		String email1 = "jhiove93@naver.com";
		System.out.println("이름: " + name1 );
		System.out.println("나이: "+ age1);
		System.out.println("나이: "+ age1);
		System.out.println("나이: "+ age1);
		
		
		// Q.02
		
		String enigma1 = "너오구늘리뭐너먹구지리";
		
		// 너 ,  구, 리 , 제거
		
		String tryone = enigma1.replace("너","");
		String trytwo = tryone.replace("구","");
		String trythree = trytwo.replace("리","");
		System.out.println(trythree);
		
		
		// Q.03
		
		int example1 = 278;
		String strex1 = example1 + "";
		
		//문자열을 각 자리수마다 자른다.
		//substring 추천
		String str1 = strex1.substring(0, 1); //"2"
		String str2 = strex1.substring(1, 2); //"7"
		String str3 = strex1.substring(2, 3); //"8"
		int int1 = Integer.parseInt(str1); 
		int int2 = Integer.parseInt(str2); 
		int int3 = Integer.parseInt(str3); 
		
		int result = int1+int2+int3;
		System.out.println(result);
		
		int result1 = Integer.parseInt(strex1.substring(0, 1))
				+Integer.parseInt(strex1.substring(1, 2))
				+Integer.parseInt(strex1.substring(2, 3));
		System.out.println(result1);
		
		
		
		
		
		
	}

}
