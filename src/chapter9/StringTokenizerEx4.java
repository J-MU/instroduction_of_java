package chapter9;

public class StringTokenizerEx4 {

	public static void main(String[] args) {
		String input="삼십만삼천백십오";
		System.out.println(input);
		System.out.println(hangulToNum(input));
	}

	public static String hangulToNum(String input) {
		String number=null;
		/*1.input->만 천 백 십으로 tokenizer할꺼임
			->이때 오천 이런식이면 ㄱㅊ은데 삼천백 이면 백이 delimiter이자 toekn으로 작동해야함.
			->백 이면 앞에 일 백 으로 바꿔주는건 어떨까 싶음
		*/
		
		/*
		 	2. 삼십만 삼천 일백 십 오
		 	 잠만 이러면 십이 token으로 작용하면 문제가될꺼같은데? 이게 재귀적으로 이뤄져야할꺼같은데 안그럼?
		 	 
		 */
		
		return number;
	}
}


