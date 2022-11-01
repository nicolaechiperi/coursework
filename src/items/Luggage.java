package items;

public class Luggage {
    private int UniqueNumber;
    private float weight;

    public Luggage(int uniqueNumber, float weight) {
        UniqueNumber = uniqueNumber;
        this.weight = weight;
    }

    public int getUniqueNumber() {
        return UniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        UniqueNumber = uniqueNumber;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
