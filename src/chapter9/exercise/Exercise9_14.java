package chapter9.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Exercise9_14 {
	public static void main(String[] args) {
		String[] phoneNumArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890" };
		StringBuffer[] tmp_numArr=new StringBuffer[4];
		
		
		for(int i=0; i<tmp_numArr.length; i++)
		{	
			tmp_numArr[i]=new StringBuffer();
			
		}
		
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print(">>");
			String input = s.nextLine().trim();
			if (input.equals("")) {
				continue;
			} else if (input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			/*
			 * (1) . �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
			 * 1. phoneNumArr-> ������ - �� �� ���ּ� �ٽ� �����ϰ����
			 * 2. str.contains()����ؼ� Ȯ���Ҳ���.
			 * 3. true�� ģ������ answer[] ��Ƴ��
			 */
			int index=-1;
			int start=0;
			String tmp;
			for(int j=0; j<phoneNumArr.length; j++) {
				while(true) {
					index=phoneNumArr[j].indexOf('-');
					if(index==-1)
						break;
					else {
						String[] split_phone=phoneNumArr[j].split("-");
						for(int i=0; i<split_phone.length;i++)
							tmp_numArr[j].append(split_phone[i]);
						
						break;
					}
				}
			}
			
			int count=0;
			for(int i=0; i<tmp_numArr.length; i++) {
				index=tmp_numArr[i].indexOf(input);
				if(index!=-1) {
					list.add(phoneNumArr[i]);
				}
			}
			
			if (list.size() > 0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ� .");
			}
		}
	} // main
}
