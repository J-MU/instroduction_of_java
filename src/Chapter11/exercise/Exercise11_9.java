package Chapter11.exercise;

import java.util.*;

class Student4 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank; // 전교등수
	int classRank; // 반등수

	Student4(String name, int ban, int no, int kor, int eng, int math) {
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
		if (o instanceof Student4) {
			Student4 tmp = (Student4) o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank + "," + classRank // 새로추가
		;
	}
} // class Student

class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		/*
		 * (1) . 알맞은 코드를 넣어 완성하시오
		 */
		Student4 stu,stu2;
		if(o1 instanceof Student4 && o2 instanceof Student4) {
			stu=(Student4)o1;
			stu2=(Student4)o2;
		}else {
			return -1;
		}
		
		if(stu.ban==stu2.ban) {
			return stu.total-stu2.total;
		}else {
			return stu.ban-stu2.ban;
		}
	}
}

class Exercise11_9 {
	public static void calculateClassRank(List list) {
// . 먼저 반별 총점기준 내림차순으로 정렬한다
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		int count = 1;
		
		

		Iterator it = list.iterator();
		Student4 stu;
		while (it.hasNext()) {
			stu = (Student4) it.next();
			if(prevBan==stu.ban) {
				if (prevTotal == stu.total) {
					stu.classRank = prevRank;
					count++;
				} else {// prevTotal>currentTotal;//정렬이 이미 되어있기 때문에
					stu.classRank = prevRank + count;
					count = 1;
				}
			}else {//prevBan<CurrentBan
				prevBan=stu.ban;
				stu.classRank=1;
				count=1;
			}
			prevTotal = stu.total;
			prevRank = stu.classRank;
		}
	} // public static void calculateClassRank(List list) {

	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
		int prevRank = 0; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		int count = 1;

		Iterator it = list.iterator();
		Student4 stu;
		while (it.hasNext()) {
			stu = (Student4) it.next();
			if (prevTotal == stu.total) {
				stu.schoolRank = prevRank;
				count++;
			} else {// prevTotal>currentTotal;//정렬이 이미 되어있기 때문에
				stu.schoolRank = prevRank + count;
				count = 1;
			}
			prevTotal = stu.total;
			prevRank = stu.schoolRank;
		}

	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student4("이자바", 2, 1, 70, 90, 70));
		list.add(new Student4("안자바", 2, 2, 60, 100, 80));
		list.add(new Student4("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student4("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student4("김자바", 1, 2, 80, 80, 90));

		calculateSchoolRank(list);
		calculateClassRank(list);

		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
