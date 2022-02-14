package chapter9.exercise;

import java.util.Arrays;

class Exercise9_6 {
	public static String fillZero(String src, int length) {
		/*
		 * (1) fillZero . 메서드를 작성하시오 1. src src.length() length src . 가 널이거나 가 와 같으면 를
		 * 그대로 반환한다 2. length 0 ("") . 의 값이 보다 같거나 작으면 빈 문자열 을 반환한다 3. src length src
		 * length . 의 길이가 의 값보다 크면 를 만큼 잘라서 반환한다 4. length char . 길이가 인 배열을 생성한다 5. 4
		 * char '0' . 에서 생성한 배열을 으로 채운다 6. src 4 . 에서 문자배열을 뽑아내서 에서 생성한 배열에 복사한다 7. 4
		 * String . 에서 생성한 배열로 을 생성해서 반환한다
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
