package vehicles;

public class Helicopter extends Flying {
    private int bladeNumber;

    public Helicopter(String number, int fuel, String type, int bladeNumber) {
        super(number, fuel, type);
        this.bladeNumber = bladeNumber;
    }

    public int getBladeNumber() {
        return bladeNumber;
    }

    public void setBladeNumber(int bladeNumber) {
        this.bladeNumber = bladeNumber;
    }

}
