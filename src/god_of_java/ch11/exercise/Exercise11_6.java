package god_of_java.ch11.exercise;

import java.util.*;

class StudentA implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	StudentA(String name, int ban, int no, int kor, int eng, int math) {
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

	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student tmp = (Student) o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}
	}
} // class Student

class Exercise11_6 {
	static int getGroupCount(TreeSet tset, int from, int to) {
		/*
		 * (1) . 해당 평균범위에 해당하는 학생의 수를 반환해야함.
		 * 
		 * 1. TreeSet binary tree로 이루어져있어서 head로 받아낼수있음
		 */
		
		//TreeSet to_set=(TreeSet) tset.headSet(new TreeSet().add(new Student("default",0,0,to*3,to*3,to*3)));
		//TreeSet from_to_set=(TreeSet)to_set.tailSet(new TreeSet().add(new Student("default",0,0,from*3,from*3,from*3)));
		//int num=from_to_set.size();
		TreeSet from_to_set=new TreeSet();
		
		Iterator it=tset.iterator();
		while(it.hasNext()) {
			Student st=(Student) it.next();
			if(st.getAverage()>=(float)from && st.getAverage()<(float)to) {
				from_to_set.add(st);
			}
		}
		int num=from_to_set.size();
		return num;
	}

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				/*
				 * 학생의 평균을 기준으로 정렬해야함.
				 */
				Student stu1;
				Student stu2;
				
				if(o1 instanceof Student && o2 instanceof Student) {
					stu1=(Student)o1;
					stu2=(Student)o2;
				}else {
					return -1;
				}
				float s1_avg=stu1.getAverage();
				float s2_avg=stu2.getAverage();
				return (s1_avg>s2_avg ? 1 : (s1_avg<s2_avg? -1 : 0));
			}
		});
		
		set.add(new Student("홍길동", 1, 1, 100, 100, 100)); // avg=100
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));	   // avg=80
		set.add(new Student("김자바", 1, 3, 80, 80, 90));    // avg=83.33333
		set.add(new Student("이자바", 1, 4, 70, 90, 70));    // avg=76.66666
		set.add(new Student("안자바", 1, 5, 60, 100, 80));   // avg=80
		
		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}
