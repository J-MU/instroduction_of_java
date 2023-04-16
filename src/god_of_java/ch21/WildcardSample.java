package god_of_java.ch21;

public class WildcardSample {

    public static void main(String[] args) {
        WildcardSample sample=new WildcardSample();
        sample.callWildcardMethod();
    }

    public void callWildcardMethod(){
        WildcardGeneric<String> wildcard=new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }

//    private void wildcardStringMethod(WildcardGeneric<String> c) {
//        String value=c.getWildcard();
//        System.out.println(value);
//    }

    // Generic Type을 바꾸는 것으로는 오버로딩을 할 수 없다. 어떤 Generic Type이든
    // 매개변수로 받고싶다면 wildCard(?)를 사용해야한다.
    private void wildcardStringMethod(WildcardGeneric<?> c){
        Object value=c.getWildcard();
        if(value instanceof String){
            System.out.println(value);
        }
    }
}
