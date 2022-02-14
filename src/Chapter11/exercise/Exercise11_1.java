package Chapter11.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합
		ArrayList cha = new ArrayList(); // 차집합
		ArrayList hap = new ArrayList(); // 합집합

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		/*
		 * 1.list1->data 2.list2.contains(data) 3.true->put(kyo)
		 * 
		 */
		Iterator it = list1.iterator();
		while (it.hasNext()) {
			Integer value = (Integer) it.next();
			if (list2.contains(value))
				kyo.add(value);
		}
		/*
		 * 1.list1-list2 list1.iterator->it; !list2.contains(it->value) true->추가
		 * 
		 */
		it = list1.iterator();
		while (it.hasNext()) {
			Integer value = (Integer) it.next();
			if (!list2.contains(value))
				cha.add(value);
		}

		/*
		 * 1.list1.iterator->it it.hasNext->put list2.iterator->it
		 * it.hasNext->contains->false->put
		 *
		 * 
		 */
		it = list1.iterator();
		while (it.hasNext()) {
			hap.add((Integer) it.next());
		}

		it = list2.iterator();
		while (it.hasNext()) {
			Integer value = (Integer) it.next();
			if (!hap.contains(value))
				hap.add(value);
		}
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
	}

}
