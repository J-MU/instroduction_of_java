package Chapter11;

import java.util.TreeSet;

public class TressSetEx2 {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		int[] scores= {80,95,50,35,45,65,10,100};
		
		for (int i = 0; i < scores.length; i++) {
			set.add(Integer.valueOf(scores[i]));
		}
		
		System.out.println(set);
		System.out.println("50���� ������: "+set.headSet(Integer.valueOf(50)));
		System.out.println("50���� ū��  :"+set.tailSet(Integer.valueOf(50)));
	}

}
	