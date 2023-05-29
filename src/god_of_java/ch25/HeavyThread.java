package god_of_java.ch25;

import java.util.ArrayList;

public class HeavyThread extends Thread{
    public HeavyThread(){

    }
    public void run(){
        int a=10;
        try {
            for (int i = 0; i < 99999999; i++) {
                System.out.println("이거 씀?");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
