package god_of_java.ch22;

import java.util.ArrayList;
import java.util.Stack;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample=new ListSample();
        ArrayList<String> returnArray=sample.checkArrayList3();
        System.out.println(returnArray);
    }

    private void checkArrayList1() {
        ArrayList<String> list1=new ArrayList();
        list1.add("ArrayListSample- String");
    }

    private ArrayList<String> checkArrayList2(){
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list.size());

//        list.add(9,"A1");
        return list;
    }

    private ArrayList<String> checkArrayList3(){
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        ArrayList<String> temp=new ArrayList<>();
        temp.add("A");
        list.removeAll(temp);
        return list;
    }

}
