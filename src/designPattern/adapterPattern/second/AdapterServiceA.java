package designPattern.adapterPattern.second;

import designPattern.adapterPattern.first.ServiceA;

public class AdapterServiceA {
    ServiceA sa1=new ServiceA();

    void runService() {
        sa1.runServiceA();
    }
}
