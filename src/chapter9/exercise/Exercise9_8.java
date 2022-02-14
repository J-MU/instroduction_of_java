package chapter9.exercise;

class Exercise9_8 {
	/*
	 * (1) round . 메서드를 작성하시오
	 */
	public static double round(double d,int n) {
		
		for(int num=n;num>1; num--) {
			d*=10;
		}
		d=Math.round(d);
		
		for(int num=n;num>1; num--) {
			d/=10.0;
		}
		
		return d;
	}
	public static void main(String[] args) {
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));
	}
}
//이거 값이 왜 이렇게 나오는지 모르겠음 연산자 파트 다시봐야 알듯
//TODO 연산자 보고 다시 이거 보기