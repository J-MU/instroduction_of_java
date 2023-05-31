package designPattern.dip;

public class English implements Subject{
    String name;

    English(){
        name="English";
    }

    @Override
    public String toString() {
        return "I'm Study English";
    }
}
