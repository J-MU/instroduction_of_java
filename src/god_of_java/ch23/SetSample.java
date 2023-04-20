package god_of_java.ch23;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample=new SetSample();
        String []cars=new String[]{
                "Tico","Sonata","BMW","Benz",
                "Lexus","Mustang","Grandeure",
                "The Beetle","Mini Cooper","i30",
                "BMW","Lexus","Carnibal","SM5",
                "SM7","SM3","Tico"
        };
        System.out.println(sample.getCarKinds(cars));
    }

    private void printCarSet(Set<String> carSet){
        for(String temp : carSet){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    private int getCarKinds(String[] cars) {
        HashSet<String> carKinds =new HashSet(List.of(cars));
        printCarSet(carKinds);
        return carKinds.size();
    }
}
