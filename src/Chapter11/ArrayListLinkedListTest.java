package Chapter11;

import java.util.*;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList(2000000);
		LinkedList llist = new LinkedList();

		System.out.println("====���������� �߰��ϱ�====");
		System.out.println("ArrayList: " + add1(alist));
		System.out.println("LinkedList: " + add1(llist));
		System.out.println("====�߰��� �߰��ϱ�====");
		System.out.println("ArrayList: " + add2(alist));
		System.out.println("LinkedList: " + add2(llist));
		System.out.println("====�߰����� �����ϱ�====");
		System.out.println("ArrayList: " + remove2(alist));
		System.out.println("LinkedList: " + remove2(llist));
		System.out.println("====���������� �����ϱ�====");
		System.out.println("ArrayList: " + remove1(alist));
		System.out.println("LinkedList: " + remove1(llist));
	}

	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.add(500,"X");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for (int i = list.size()-1; i >= 0; i--) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i <10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}
