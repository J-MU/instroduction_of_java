package god_of_java.ch21;

class Car {
    protected String name;

    public Car(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Car name="+name;
    }
}
