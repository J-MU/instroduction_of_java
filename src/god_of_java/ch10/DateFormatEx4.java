package god_of_java.ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {

	public static void main(String[] args) {
		String pattern="yyyy/mm/dd";
		DateFormat df=new SimpleDateFormat(pattern);
		Scanner s=new Scanner(System.in);
		
		Date when=new Date();
		
		while(true) {
			try {
				when=df.parse(s.nextLine());
				break;
			}catch(Exception e){
				System.out.println("날짜를 "+pattern+"의 형태로 다시 입력해 주세요.(입력예:2015/09/25)");
			}
		}
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(when);
		Calendar today=Calendar.getInstance();
		long day=Math.abs(today.getTimeInMillis()-cal.getTimeInMillis())/(1000*60*60);
		
		System.out.println("입력하신 날짜는 현재와"+day+"시간 차이가 있습니다.");
	}

}
