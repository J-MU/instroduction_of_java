package god_of_java.ch9.exercise;

import java.util.Arrays;

class Exercise9_10 {
	/*
	 * (1) format . 메서드를 작성하시오
	 *  1.length의 값이 str의 길이보다 작으면 length만큼만 잘라서 반환한다
	 * 2. 1의 경우가 아니면 length크기의 char배열을 생성하고 공백으로 채운다 
	 * 3.   
	 * 정렬조건(alignment) 의 값에 따라 문자열(str) 을 복사할 위치를 결정한다 
	 * (System.arraycopy() ) 사용  0왼쪽 1가운데 2오른쪽
	 * 4. 2에서 생성한 char배열을 문자열로 만들어서 반환한다
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
		String str = "가나다";
		System.out.println(format(str, 7, 0)); // 왼쪽 정렬
	
		
		System.out.println(format(str, 7, 1)); // 가운데 정렬
		System.out.println(format(str, 7, 2)); // 오른쪽 정렬
	}
}