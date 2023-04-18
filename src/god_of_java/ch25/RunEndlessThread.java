package god_of_java.ch25;

public class RunEndlessThread {
    public static void main(String[] args) {
        RunEndlessThread sample=new RunEndlessThread();
        sample.endless();
    }

    private void endless() {
        EndlessThread thread=new EndlessThread();
        thread.start();
    }
}
