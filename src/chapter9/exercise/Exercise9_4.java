package chapter9.exercise;

class Exercise9_4 {
	static void printGraph(int[] dataArr, char ch) {
		/*
		 * (1) printGraph . 메서드를 작성하시오
		 */
		int count=0;
		
		for(int i=0; i<dataArr.length; i++) {
			count=dataArr[i];
			for (int j = 0; j < count; j++) {
				System.out.print(ch);
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		printGraph(new int[] { 3, 7, 1, 4 }, '*');
	}
}
