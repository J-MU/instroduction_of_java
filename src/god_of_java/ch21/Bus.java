package god_of_java.ch21;

public class Bus extends Car{
    public Bus(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Bus name="+name;
    }

}
