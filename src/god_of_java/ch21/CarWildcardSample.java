package god_of_java.ch21;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample=new CarWildcardSample();

        sample.callBoundedWildcardSample();
    }

    private void callBoundedWildcardSample() {
        WildcardGeneric<Car> wildcard=new WildcardGeneric<>();
        wildcard.setWildcard(new Car("람보르기니"));
        boundedWildcardMethod(wildcard);

        WildcardGeneric<Bus> wildcard2=new WildcardGeneric<>();
        wildcard2.setWildcard(new Bus("급행 3"));
        boundedWildcardMethod(wildcard2);
    }

    private void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value=c.getWildcard();
        System.out.println(value);
    }


}
