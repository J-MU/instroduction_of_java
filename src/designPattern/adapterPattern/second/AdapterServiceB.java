package designPattern.adapterPattern.second;

import designPattern.adapterPattern.first.ServiceB;

public class AdapterServiceB {
    ServiceB sb = new ServiceB();

    void runService() {
        sb.runServiceB();
    }
}
