package Chapter10;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MessageFormatEx1 {

	public static void main(String[] args) {
		String msg="Name: {0} \nTel: {1} \nAge: {2} \nBirthday:{3}";
		Calendar cal=Calendar.getInstance();
		cal.set(1999, 01, 02);
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		Date birthday=cal.getTime();
		String birth=sdf1.format(birthday);
		Object[] arguments= {
				"Á¤¹Î¿í","010-8505-0877","24",birth
		};
		
		String result=MessageFormat.format(msg, arguments);
		System.out.println(result);
	}

}
