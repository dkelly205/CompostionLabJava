package device_management;

import behaviours.IInput;

public class Mouse implements IInput {

    private String type;
    private int buttons;

    public Mouse(String type, int buttons) {
        this.type = type;
        this.buttons = buttons;
    }

    public String getType() {
        return type;
    }

    public int getButtons() {
        return buttons;
    }

    public String move() {
        return "moving mouse";
    }

    public String click() {
        return "Click";
    }


    @Override
    public String sendData(String data) {
        return "sending " + data;
    }
}
