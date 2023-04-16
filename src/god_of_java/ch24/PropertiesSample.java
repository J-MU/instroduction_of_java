package god_of_java.ch24;

import java.util.Properties;
import java.util.Set;

public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample sample=new PropertiesSample();
        sample.checkProperties();
    }

    private void checkProperties() {
        Properties prop=System.getProperties();
        Set<Object> keySet=prop.keySet();

        for(Object tempObject:keySet)
            System.out.println(tempObject+" = "+prop.get(tempObject));

    }
}
