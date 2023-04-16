package god_of_java.ch9;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand=new Random();
		int[] number=new int[100];            //random숫자 저장
		int[] counter=new int[10];        //각 숫자별로 몇번나왔는지를 지정할꺼임.
		
		//랜덤 생성
		for (int i = 0; i < 100; i++) {
			number[i]=rand.nextInt(10);
			System.out.print(number[i]);
		}
		//count 기록
		for (int i = 0; i < 100; i++) {
			counter[number[i]]++;
		}
		System.out.println();
		//출력
		for(int i=0; i<counter.length; i++) {
			System.out.println(i+"의 개수:"+print_pound(counter[i])+" "+ counter[i]);
		}
	}
	
	public static String print_pound(int size) {
		StringBuilder pound=new StringBuilder("");
		for(int j=0; j<size; j++) {
			pound.append("#");
		}
		
		return pound.toString();
	}

}
