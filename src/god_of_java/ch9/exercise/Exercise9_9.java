package god_of_java.ch9.exercise;

class Exercise9_9 {
	/*
	 * (1) delChar . 메서드를 작성하시오
	 */
	
	public static String delChar(String target,String prohibit) {
		StringBuffer sb=new StringBuffer(target);
		int index=sb.indexOf(prohibit);
		
		return target;
	}
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}
//모르겟음 ㅋㅋㅋ
