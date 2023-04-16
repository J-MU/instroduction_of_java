package god_of_java.ch24;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMapSample sample=new TreeMapSample();
        sample.checkTreeMap();
    }

    private void checkTreeMap() {
        TreeMap<String,String> map=new TreeMap<>();
        // String기준 숫쟈 > 알파벳 대문자 > 알파벳 소문자 > 한글 순으로 정렬된다.
        map.put("A","a");
        map.put("가","e");
        map.put("1","f");
        map.put("a","g");

        Set<Map.Entry<String,String>> entries=map.entrySet();

        for(Map.Entry<String,String> tempEntry:entries)
            System.out.println(tempEntry.getKey()+" = "+tempEntry.getValue());

    }
}
