package joonho.submit12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import ch09_class.nextit.NextStudent;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		// dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		for(int i = 0; i < 100; i++) {
			int randDay = (int)(Math.random() * 365) + 1;		// 1~365	
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, randDay * -1);
					
			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard((i+1) + "번째 생성된 글", strDate));
		}
				
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		// TODO 코드작성 시작 ~!!
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
					dbList.set(i+1,dbList.get(i));    // 1번째 를 0번째가이로오게
				}
			}
		}
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		
		
		
		
	}

}
