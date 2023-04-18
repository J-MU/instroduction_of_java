package god_of_java.ch25;

public class VolatileSample extends Thread{
    private volatile double instanceVariable=0;

    void setDouble(double value){
        this.instanceVariable=value;
    }

    public void run(){
        while(instanceVariable==0);
        System.out.println(instanceVariable);
    }

}
