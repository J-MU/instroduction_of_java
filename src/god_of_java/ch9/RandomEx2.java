package god_of_java.ch9;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand=new Random();
		int[] number=new int[100];            //random���� ����
		int[] counter=new int[10];        //�� ���ں��� ������Դ����� �����Ҳ���.
		
		//���� ����
		for (int i = 0; i < 100; i++) {
			number[i]=rand.nextInt(10);
			System.out.print(number[i]);
		}
		//count ���
		for (int i = 0; i < 100; i++) {
			counter[number[i]]++;
		}
		System.out.println();
		//���
		for(int i=0; i<counter.length; i++) {
			System.out.println(i+"�� ����:"+print_pound(counter[i])+" "+ counter[i]);
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
