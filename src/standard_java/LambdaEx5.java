//package standard_java;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.Supplier;
//
//public class LambdaEx5 {
//    public static void main(String[] args) {
//        Supplier<Integer> s = () -> (int) (Math.random() + 100) + 1;
//        Consumer<Integer> c = i -> System.out.println("i = " + i);
//        Predicate<Integer> p = i -> i % 2 == 0;
//        Function<Integer, Integer> f = i -> i / 10 * 10; // i의 일의 자리를 없앤다.
//
//        ArrayList<Object> list = new ArrayList<>();
//        makeRandomList(s, list);
//        System.out.println("list = " + list);
//        printEvenNum(p, c, list);
//        List<Integer> newList = doSomething(f, list);
//    }
//
//    static <?> List<?> doSomething(Function<?,?> f, List<?> list) {
//        List<?> newList=new ArrayList<?>(list.size());
//
//        for (? ? : list) {
//            newList.add(f.apply(?));
//        }
//        return newList;
//    }
//
//    static <?> void printEvenNum(Predicate<?> p, Consumer<?> c, List<?> list) {
//        System.out.print("[ ");
//        for (? i : list) {
//            if(p.test(i));
//                c.accept(i);
//        }
//
//         System.out.println(" ]");
//
//    }
//
//    static <?> void makeRandomList(Supplier<?> s, List<?> list) {
//        for (int i = 0; i < 10; i++) {
//            list.add(s.get());
//        }
//    }
//}
