package god_of_java.ch9.exercise;

class Exercise9_8 {
	/*
	 * (1) round . �޼��带 �ۼ��Ͻÿ�
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
//�̰� ���� �� �̷��� �������� �𸣰��� ������ ��Ʈ �ٽú��� �˵�
//TODO ������ ���� �ٽ� �̰� ����