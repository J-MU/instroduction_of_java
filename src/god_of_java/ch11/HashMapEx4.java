package god_of_java.ch11;

import java.util.*;

public class HashMapEx4 {

	public static void main(String[] args) {
		String[] data= {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		
		HashMap map=new HashMap();
		//map->data[i] put
		//map   key    value
		//    "알파벳"   그 개수
		//if map.contains(data[i]) -> value++;
		//else map.put(data[i],1)
		//print(map);
		
		for (int j = 0; j < data.length; j++) {
			if(map.containsKey(data[j])) {
				Integer value=(Integer)map.get(data[j]);
				map.put(data[j], Integer.valueOf(value+1));
			}else {
				map.put(data[j], 1);
			}
		}
		
		Set entry_set=map.entrySet();
		Iterator it=entry_set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e=(Map.Entry)it.next();
			System.out.println(e.getKey()+" : "+print_pound(e.getValue())+" "+e.getValue());
		}
	
	}

	public static String print_pound(Object i) {
		String str="";
		if(i instanceof Integer) {
			Integer in=(Integer)i;
			int value=in.intValue();
			
			for(int j=0; j<value; j++) {
				str+="#";
				
			}
			
		}
		return str;
		
	}
}
