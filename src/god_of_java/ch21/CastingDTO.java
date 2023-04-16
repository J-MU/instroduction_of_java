package god_of_java.ch21;

import java.io.Serializable;

public class CastingDTO implements Serializable {
    private Object object;

    // getter
    public Object getObject() {
        return object;
    }

    // setter
    public void setObject(Object object) {
        this.object = object;
    }
}
