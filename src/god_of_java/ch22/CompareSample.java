package god_of_java.ch22;


public class CompareSample {
    public static void main(String[] args) {
        Person[] personArrayList=new Person[2];
        personArrayList[0]=new Person(25,"정민욱");
        personArrayList[1]=new Person(24,"이은비");


        for(Person person : personArrayList)
            System.out.println(person);


    }
}
