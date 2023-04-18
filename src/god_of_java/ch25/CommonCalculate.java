package god_of_java.ch25;

public class CommonCalculate {
    private int amount;
    private int interest;

    Object lock=new Object();
    Object lock2=new Object();
    public CommonCalculate(){
        amount=0;
    }

    public void plus(int value){
        synchronized (lock){
            amount+=value;
        }
    }

    public void minus(int value){
        synchronized (lock){
            amount-=value;
        }
    }

    public void addInterest(int value){
        synchronized (lock2){
            interest+=value;
        }
    }
    public int getInterest(){
        return interest;
    }
    public int getAmount(){
        return amount;
    }
}
