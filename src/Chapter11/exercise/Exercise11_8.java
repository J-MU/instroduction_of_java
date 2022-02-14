package Chapter11.exercise;

import java.util.*;

class Student3 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total; // ����
	int schoolRank; // �������

	Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Object o) {
		/*
		 * (1) . �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
		 	total������ �������� �������� ����
		 */
		Student3 stu;
		if(o instanceof Student3) {
			stu=(Student3)o;
		}else {
			return -1;
		}
		if(this.total>stu.total) {
			return -1;
		}else if(this.total<stu.total) {
			return 1;
		}else {
			return 0;
		}
		
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank // �����߰�
		;
	}
} // class Student

class Exercise11_8 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // list . ���� �� �������� ������������ �����Ѵ�
		int prevRank = 0; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();
		int count=1;
		
		/*
		 * (2) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 
		 * 1.  �ݺ����� �̿��ؼ� list�� ����� Student��ü�� �ϳ��� �д´� 
		 * 	1.1  ����(total) �� ��������(prevTotal) �� ������ ���� ���(prevRank) �� ���(schoolRank) �� �Ѵ�.
		 *  1.2  ������ ���� �ٸ��� ���(schoolRank) �� ���� �˸°� ����ؼ� �����Ѵ�. 
		 *  	������ ������ ���ٸ� �� ���� ����� �������� ���� ����ؾ� �Ѵ� , . ( ������ ���� )
		 *  1.3   ���� ������ ����� ��������(prevTotal) �� �������(prevRank) �� �����Ѵ�.
		 */
		Iterator it=list.iterator();
		Student3 stu;
		while(it.hasNext()) {
			stu=(Student3)it.next();
			if(prevTotal==stu.total) {
				stu.schoolRank=prevRank;
				count++;
			}else {//prevTotal>currentTotal;//������ �̹� �Ǿ��ֱ� ������
				stu.schoolRank=prevRank+count;
				count=1;
			}
			prevTotal=stu.total;
			prevRank=stu.schoolRank;
		}
		
		
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student3("���ڹ�", 2, 1, 70, 90, 70));
		list.add(new Student3("���ڹ�", 2, 2, 60, 100, 80));
		list.add(new Student3("ȫ�浿", 1, 3, 100, 100, 100));
		list.add(new Student3("���ü�", 1, 1, 90, 70, 80));
		list.add(new Student3("���ڹ�", 1, 2, 80, 80, 90));
	
		calculateSchoolRank(list); //Student�� ��������� school rank�� ä���ִ� ����.
		System.out.println("���� ��>>>>>>");
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		
	}
}
