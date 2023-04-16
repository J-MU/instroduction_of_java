package god_of_java.ch9.exercise;

import java.util.Scanner;

public class Exercise9_11 {

	public static void main(String[] args) {
		int first=0,second=0;
		Scanner scan=new Scanner(System.in);
		
		first=scan.nextInt();
		second=scan.nextInt();
		for(int i=first;i<=second;i++) {
			gugudan_print(i);
		}
	}
	
	public static void gugudan_print(int num) {
		for(int i=1; i<10; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		System.out.println();
	}

}
