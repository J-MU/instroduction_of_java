package god_of_java.ch9.exercise;

import java.util.Random;

public class Exercise9_12 {

	public static void main(String[] args) {
		for(int i=0; i< 20; i++)
			System.out.print(getRand(1,-3)+",");
	}

	public static int getRand(int from,int to) {
		Random rand=new Random();
		int tmp=rand.nextInt(Math.abs(from-to)+1);
		return tmp+Math.min(from,to);
	}
}
