package Chapter10;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK= {"","일","월","화","수","목","금","토"};
		
		Calendar date1= Calendar.getInstance();
		Calendar date2= Calendar.getInstance();
		
		date1.set(2015,7,15);
		System.out.println("date1은 "+toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("date2은 "+toString(date2)+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);
		
		long difference=Math.abs(date1.getTimeInMillis()-date2.getTimeInMillis())/1000;
		System.out.println("그날(date1)부터 지금(date2)까지 "+difference+"초가 지났습니다.");
		System.out.println("일(day)로 계산하면 "+difference/(24*60*60)+"일 입니다.");
		
		
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+date.get(Calendar.MONTH)+"월 "+date.get(Calendar.DATE)+"일 ";
	}
}
