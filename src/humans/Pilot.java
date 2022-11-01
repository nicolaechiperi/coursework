package humans;

import vehicles.Flying;

public class Pilot extends Personal {

    public Pilot(String firstName, String lastName, int age, float balance) {
        super(firstName, lastName, age, balance);
    }

    public void fly(Flying aircraft) {
        System.out.println("Pilot " + getFirstName() + " " + getLastName() + " is flying the aircraft: " + aircraft.getNumber());
    }
    
}
