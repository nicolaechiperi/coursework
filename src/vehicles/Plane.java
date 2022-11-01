package vehicles;

public class Plane extends Flying {

    private boolean autoPilot;

    public Plane(String number, int fuel, String type) {
        super(number, fuel, type);
    }

    void turnOnAutopilot() {
        autoPilot = true;
    }

    void turnOffAutoPilot() {
        autoPilot = false;
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }

}
