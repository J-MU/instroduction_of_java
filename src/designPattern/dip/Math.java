package designPattern.dip;

public class Math implements Subject {
    String name;

    Math(){
        name="Math";
    }

    @Override
    public String toString() {
        return "I'm Study Math";
    }
}
