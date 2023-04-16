package god_of_java.ch24;

import java.awt.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample=new MapSample();
        sample.checkHashMap();
        sample.checkKeySet();
        sample.checkValue();
        sample.checkHashMapEntry();
        sample.checkContains();
    }

    private void checkHashMap() {
        HashMap<String,String> map=new HashMap<>();
        map.put("A","a");
        System.out.println(map.get("A"));
    }

    private void initializeMap(HashMap<String,String> map){
        map.put("A","a");
        map.put("C","c");
        map.put("D","d");
        map.put("E","e");
        map.put("F","f");
        map.put("G","g");
        map.put("H","h");
        map.put("I","i");
    }
    private void checkKeySet(){
        HashMap<String,String> map=new HashMap<>();
        initializeMap(map);

        Set<String> keySet=map.keySet();
        for(String temp:keySet){
            System.out.println(temp+" = "+map.get(temp));
        }
    }

    private void checkValue(){
        HashMap<String,String> map=new HashMap<>();
        initializeMap(map);
        Collection<String> values=map.values();
        for (String tempValue:values){
            System.out.println(tempValue);
        }
    }

    private void checkHashMapEntry(){
        HashMap<String,String> map=new HashMap<>();
        initializeMap(map);

        Set<Map.Entry<String,String>> entries=map.entrySet();
        for(Map.Entry<String,String> tempEntry:entries)
            System.out.println(tempEntry.getKey()+" = "+tempEntry.getValue());
    }

    private void checkContains(){
        HashMap<String,String> map=new HashMap<>();
        initializeMap(map);

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("B"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("b"));
    }
}
