package chapter9;

import java.util.Arrays;
import java.util.Random;

public class RandomEx3 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) 
			System.out.println(getRand(5,10)+",");
		System.out.println();
		
		int[] result=fillRand(new int[10],new int[] {2,3,7,5});
		
		System.out.println(Arrays.toString(result));
	}

	private static int getRand(int to, int from) {
		int rand=Math.random()*(to-from)
		return null;
	}
	
	private static int[] fillRand(int[] arr,int from,int to) {
		
	}
	
	private static int[] fillRand(int[] arr,int[] data) {
		
	}
	
}
