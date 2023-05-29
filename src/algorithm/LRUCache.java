package algorithm;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    private int capacity;
    private HashMap cache;
    private LinkedList linkedList;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        cache=new HashMap(3);
    }

    public int get(int key) {
        return (int) cache.get(key);
    }

    public void put(int key, int value) {

    }
}
