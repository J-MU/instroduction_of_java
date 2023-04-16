package god_of_java.ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
	static HashMap phoneBook=new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("ģ��", "���ڹ�", "010-111-1111");
		addPhoneNo("ģ��", "���ڹ�", "010-222-2222");
		addPhoneNo("ģ��", "���ڹ�", "010-333-3333");
		addPhoneNo("ȸ��", "��븮", "010-444-4444");
		addPhoneNo("ȸ��", "��븮", "010-555-5555");
		addPhoneNo("ȸ��", "�ڴ븮", "010-666-6666");
		addPhoneNo("ȸ��", "�ڰ���", "010-777-7777");
		addPhoneNo("��Ź", "010-888-8888");
		
		printList();
	}
	
	static void addPhoneNo(String groupName,String name,String tel) {
		addGroup(groupName);
		HashMap group=(HashMap)phoneBook.get(groupName);
		group.put(tel, name);
		
	}
	
	static void addPhoneNo(String name,String tel) {
		addPhoneNo("��Ÿ",name,tel);
	}
	
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}

	static void printList() {
		Set set=phoneBook.entrySet();
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e= (Map.Entry) it.next();
			
			Set subset=((HashMap)e.getValue()).entrySet();
			Iterator subIt=subset.iterator();
			
			System.out.println(" * "+e.getKey()+"["+subset.size()+"]");
			while(subIt.hasNext()) {
				Map.Entry subE=(Map.Entry)subIt.next();
				String telNo=(String)subE.getKey();
				String name=(String)subE.getValue();
				System.out.println(name+" "+telNo);
			}
			System.out.println();
		}
	}
}