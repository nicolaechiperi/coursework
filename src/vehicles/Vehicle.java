package vehicles;

public abstract class Vehicle {
    private String number;
    private int fuel;
    private String type;

    public Vehicle(String number, int fuel, String type) {
        this.number = number;
        this.fuel = fuel;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
