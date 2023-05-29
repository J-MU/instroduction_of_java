package designPattern.proxyPattern.first;

public class GumballMachine {
    String location;
    String state;
    int count;


    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
        this.state = "운영중";
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public String getState() {
        return state;
    }

}
