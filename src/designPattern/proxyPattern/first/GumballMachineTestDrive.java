package designPattern.proxyPattern.first;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("GumballMachine <name> <inventory>");

        count=10;
        String name="민욱's 껌볼 기계";

        GumballMachine gumballMachine = new GumballMachine(name, count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        // 기타


        monitor.report();
    }
}
