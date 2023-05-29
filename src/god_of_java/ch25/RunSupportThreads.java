package god_of_java.ch25;

import java.util.Set;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads sample=new RunSupportThreads();

        sample.interruptThread();
    }

    private void interruptThread(){
        HeavyThread thread=new HeavyThread();

        try{
            synchronized (this){
                System.out.println("thread statue="+thread.getState());
                thread.start();
            }

            System.out.println("thread statue="+thread.getState());
            thread.join();
            thread.interrupt();
            System.out.println("thread State(after join)="+thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void checkThreadState1() {
        SleepThread thread=new SleepThread(2000);
        Set<Thread> threads= Thread.getAllStackTraces().keySet();
        System.out.println(threads);
        System.out.println(threads.size());
        try{
            System.out.println("thread statue="+thread.getState());
            thread.start();
            System.out.println("thread State(after start)="+thread.getState());

            Thread.sleep(1000);
            System.out.println("thread State(after 1 sec)="+thread.getState());

            System.out.println("뭐지?");
            threads= Thread.getAllStackTraces().keySet();
            System.out.println(threads);
            System.out.println(threads.size());
            thread.join();
            thread.interrupt();
            System.out.println("thread State(after join)="+thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void checkJoin(){
        SleepThread thread=new SleepThread(2000);
        try{
            thread.start();
            thread.join(3000);
            thread.interrupt();
            System.out.println("thread state(after join)="+thread.getState());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
