package humans;

import java.util.Set;

import items.Luggage;

public class Security extends Personal {

    public Security(String firstName, String lastName, int age, float balance) {
        super(firstName, lastName, age, balance);
    }

    public void checkDocument(Traveler traveler, Set<String> forbidenList, Set<String> deportedList) {
        System.out.println("Checking document: " + traveler.getTravelDocument());

        if (forbidenList.contains(traveler.getTravelDocument())) {
            deport(traveler);
            deportedList.add(traveler.getTravelDocument());
        }
    }

    public void checkLuggage(Luggage luggage) {
        System.out.println("Cheking luggage: " + luggage.getUniqueNumber());
    }

    public void arrest(Traveler traveler) {
        System.out.println("arresting traveler: " + traveler.getFirstName() + " " + traveler.getLastName());
    }

    public void deport(Traveler traveler) {
        System.out.println("Deporting traveler: " + traveler.getFirstName() + " " + traveler.getLastName());
    }

}
