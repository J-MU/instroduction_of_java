package designPattern.dip;

import java.util.HashMap;

public class Studying {
    public static void main(String[] args) {
        Student ayaan= new Student();
        Math math=new Math();
        English english = new English();
        Korean korean = new Korean();

        ayaan.setSubject(math);
        ayaan.study();

        ayaan.setSubject(english);
        ayaan.study();

        ayaan.setSubject(korean);
        ayaan.study();
    }
    HashMap
}
