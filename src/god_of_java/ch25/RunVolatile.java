package god_of_java.ch25;

public class RunVolatile {
    public static void main(String[] args) {
        RunVolatile sample=new RunVolatile();
        sample.runVolatileSample();
    }

    private void runVolatileSample() {
        VolatileSample sample=new VolatileSample();
        sample.start();

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Sleep ended !!!");
        sample.setDouble(-1);
        System.out.println("Set value is completed!!!");
    }
}