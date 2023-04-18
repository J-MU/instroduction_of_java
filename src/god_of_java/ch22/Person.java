package god_of_java.ch22;

public class Person implements Comparable{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{  "+age+"=" + age +" name= "+ name+"}";
    }

    public int compareTo(Object o) {
        Person p=(Person) o;
//        if(this.age>p.age) return 1 ;
//        if(this.age<p.age) return -1 ;
        return this.age-p.age;
        // 잘못된 구현.



    }


}
