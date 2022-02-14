package chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {

	public static void main(String[] args) {
		String[] data= {"bat","baby","bonus","cA","ca","co","c.","c0","car","combat","count","date","disc"};
		
		Pattern p=Pattern.compile("c[a-z]*");
		Matcher m = null;
		
		for (int j = 0; j < data.length; j++) {
			m=p.matcher(data[j]);
			if(m.matches()) {
				System.out.print(data[j]+", ");
			}
		}
		
		
	}

}
