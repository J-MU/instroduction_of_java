package designPattern.adapterPattern.second;

public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asa2 = new AdapterServiceB();

        System.out.println("Client With Adapter");

        asa1.runService();
        asa2.runService();

    }
}
