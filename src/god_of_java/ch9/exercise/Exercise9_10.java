package god_of_java.ch9.exercise;

import java.util.Arrays;

class Exercise9_10 {
	/*
	 * (1) format . �޼��带 �ۼ��Ͻÿ�
	 *  1.length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�
	 * 2. 1�� ��찡 �ƴϸ� lengthũ���� char�迭�� �����ϰ� �������� ä��� 
	 * 3.   
	 * ��������(alignment) �� ���� ���� ���ڿ�(str) �� ������ ��ġ�� �����Ѵ� 
	 * (System.arraycopy() ) ���  0���� 1��� 2������
	 * 4. 2���� ������ char�迭�� ���ڿ��� ���� ��ȯ�Ѵ�
	 */
	public static String format(String str, int length, int alignment) {
		if(length<str.length()) {
			String length_str=str.substring(0, length);
			return length_str;
		}
		char[] ch_arr=new char[length];
		Arrays.fill(ch_arr,' ');
		
		if(alignment ==0) {
			System.arraycopy(str.toCharArray(), 0, ch_arr, 0, str.length());
		}else if(alignment==1) {
		System.arraycopy(str.toCharArray(), 0, ch_arr, (length/2)-(str.length()/2), str.length());
		}else if(alignment==2) {
			System.arraycopy(str.toCharArray(), 0, ch_arr, length-str.length(), str.length());
		}
		str=new String(ch_arr);
		return str;
	}

	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str, 7, 0)); // ���� ����
	
		
		System.out.println(format(str, 7, 1)); // ��� ����
		System.out.println(format(str, 7, 2)); // ������ ����
	}
}