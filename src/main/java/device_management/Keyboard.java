package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

    private String type;

    public Keyboard(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override
    public String sendData(String data) {
        return "typing " + data;
    }
}


