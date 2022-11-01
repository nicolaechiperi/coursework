package humans;

import items.Luggage;
import vehicles.Flying;

public class Traveler extends Human {
    private String TravelDocument;
    private Luggage luggage;

    public Traveler(String firstName, String lastName, int age, float balance, String travelDocument, Luggage luggage) {
        super(firstName, lastName, age, balance);
        TravelDocument = travelDocument;
        this.luggage = luggage;
    }

    public void board(Flying aircraft) {
        System.out.println(
                getFirstName() + " " + getLastName() + " is boarding on the aircraft number: " + aircraft.getNumber());
    }

    public String getTravelDocument() {
        return TravelDocument;
    }

    public void setTravelDocument(String travelDocument) {
        TravelDocument = travelDocument;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public void setLuggage(Luggage luggage) {
        this.luggage = luggage;
    }

    public void buySnacks() {
        System.out.println(getFirstName() + " " + getLastName() + " has purchased snacks");
    }

}
