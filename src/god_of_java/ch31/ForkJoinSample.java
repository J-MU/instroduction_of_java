package god_of_java.ch31;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinSample {
    static final ForkJoinPool mainPool = new ForkJoinPool();

    public static void main(String[] args) {
        ForkJoinSample sample = new ForkJoinSample();
        sample.calculate();
    }

    private void calculate() {
        long from = 0;
        long to = 10;

        GetSum sum = new GetSum(from, to);
        Long result = mainPool.invoke(sum);
        System.out.println("Fork Join: Total sum of " + from + " ~ " + to + " = " + result);
    }
}
