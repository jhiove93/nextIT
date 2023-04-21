package joonho.submit12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import joonho.submit12.DateBoard;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		// dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		for(int i = 0; i < 100; i++) {
			int randDay = (int)(Math.random() * 365) + 1;		// 1~365	
			cal = Calendar.getInstance();
			cal.add(Calendar.DATE, randDay * -1);
					
			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard((i+1) + "번째 생성된 글", strDate));
		}
				
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		System.out.println("======================");
		// TODO 코드작성 시작 ~!!
		// 2-3
		ArrayList<DateBoard> dbList2 = new ArrayList<DateBoard>();
		Date date = new Date();
		Date date2 = new Date();
		for(int k=0; k< dbList.size() -1 ; k++){
			for(int i = 0; i < dbList.size() -1; i++) {
				date = sdf.parse(dbList.get(i).getDate());
				date2 = sdf.parse(dbList.get(i+1).getDate());
				if(date.getTime() > date2.getTime()) {  // 0 번째가 1번째보다 크면  
					 dbList2.add(dbList.get(i));       // 0번째를 dbList2에담고
					dbList.set(i , dbList.get(i+1));   //  0번째를 1번째수로바꾸고
					dbList.set(i+1,dbList2.get(dbList2.size()-1));    // 1번째 를 0번째가이로오게
				}
			}
		}
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		//2-4
//		String temp = "";
//		int toD = 20230420;
//		int dbD = 0;
//		for(int i = 0; i< dbList.size();i++) {
//			   temp = dbList.get(i).getDate().substring(0,10).replace(".","");
//			   toD += Integer.parseInt(temp);
//			  if(toD )
//		}
			
		//2-5
		System.out.println("============================2-5====================");
		Date toDaydate = new Date();
		Calendar toDay = Calendar.getInstance();
		Calendar dbDay = Calendar.getInstance();
		for(int i = 0 ; i <dbList.size(); i++) {
			dbDay.setTime(sdf.parse(dbList.get(i).getDate()));
			toDay.setTime(toDaydate);
			if(dbDay.get(Calendar.YEAR )== toDay.get(Calendar.YEAR)) {
				if(dbDay.get(Calendar.MONTH) == toDay.get(Calendar.MONTH)) {
					System.out.println(dbList.get(i));
				
				}
			}
		}
		//2-6
		System.out.println("===================================2-6==============================");
		for(int i = 0 ; i <dbList.size(); i++) {
			dbDay.setTime(sdf.parse(dbList.get(i).getDate()));
			toDay.setTime(toDaydate);
			if(dbDay.get(Calendar.MONTH) ==1) {
				System.out.println(dbList.get(i));
			
			}
			
		}
		//2-7
		System.out.println("===================================2-7==============================");
		String two = "";
		
		for(int i = 0 ; i <dbList.size(); i++) {
			  two = dbList.get(i).getDate().substring(0,10).replace(".","");
			 int numTwo= Integer.parseInt(two);
			  if(numTwo <20220321) {
				  if( 20220214 <numTwo) {
					  System.out.println(dbList.get(i));
				  }
			  }
		}
		
	}

}
