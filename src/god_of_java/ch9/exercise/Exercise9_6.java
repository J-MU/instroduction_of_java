package god_of_java.ch9.exercise;

import java.util.Arrays;

class Exercise9_6 {
	public static String fillZero(String src, int length) {
		/*
		 * (1) fillZero . �޼��带 �ۼ��Ͻÿ� 1. src src.length() length src . �� ���̰ų� �� �� ������ ��
		 * �״�� ��ȯ�Ѵ� 2. length 0 ("") . �� ���� ���� ���ų� ������ �� ���ڿ� �� ��ȯ�Ѵ� 3. src length src
		 * length . �� ���̰� �� ������ ũ�� �� ��ŭ �߶� ��ȯ�Ѵ� 4. length char . ���̰� �� �迭�� �����Ѵ� 5. 4
		 * char '0' . ���� ������ �迭�� ���� ä��� 6. src 4 . ���� ���ڹ迭�� �̾Ƴ��� ���� ������ �迭�� �����Ѵ� 7. 4
		 * String . ���� ������ �迭�� �� �����ؼ� ��ȯ�Ѵ�
		 */
		if(src==null || src.length()==length) {
			return src;
		}else if(length <=0) {
			return new String("");
		}else if(src.length()>length) {
			String substr=src.substring(0, length);
			return substr;
		}else if(src.length()<length) {
			char[] ch_arr=new char[length];
			Arrays.fill(ch_arr, '0');
			for (int i = 0; i < src.length(); i++) {
				ch_arr[i]=src.charAt(i);
			}
			src=new String(ch_arr);
			return src;
		}else {
			System.out.println("ERROR");
			return "ERROR";
		}

	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}
}
