package vehicles;

public class Car extends Ground {
    private String plate;

    public Car(String number, int fuel, String type, String plate) {
        super(number, fuel, type);
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

}
