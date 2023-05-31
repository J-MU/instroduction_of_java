package designPattern.dip;

public class Korean implements Subject{
    String name;

    Korean(){
        name="Korean";
    }

    @Override
    public String toString() {
        return "I'm Study Koeran";
    }
}
