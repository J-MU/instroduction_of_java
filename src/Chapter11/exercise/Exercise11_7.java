package Chapter11.exercise;

import java.util.*;

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
} // class Student

class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		/*
		 * (1) . �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
		 * �� �̶� ��ȣ�� �������� ����
		 * ���̸��� ������ �ܿ쿡�� ��ȣ�� ����
		 */
		Student2 stu;
		Student2 stu2;
		
		if(o1 instanceof Student2 && o2 instanceof Student2) {
			stu=(Student2)o1;
			stu2=(Student2)o2;
		}else {
			return -1;
		}
		
		if(stu.ban>stu2.ban) {
			return 1;
		}else if(stu.ban<stu2.ban) {
			return -1;
		}else {//stu.ban==stu2.ban
			if(stu.no>stu2.no) {
				return 1;
			}else if(stu.no<stu2.no) {
				return -1;
			}else {//stu.no==stu2.no
				return 0;
			}
		}
	}
}

public class Exercise11_7 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Student2("���ڹ�",2,1,70,90,70));
		list.add(new Student2("���ڹ�",2,2,60,100,80)); 
		list.add(new Student2("ȫ�浿",1,3,100,100,100)); 
		list.add(new Student2("���ü�",1,1,90,70,80)); 
		list.add(new Student2("���ڹ�",1,2,80,80,90)); 
		
		Collections.sort(list, new BanNoAscending());
		
		Iterator it = list.iterator();
		while(it.hasNext())
		System.out.println(it.next());

	}

}
