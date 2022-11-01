import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import humans.Personal;
import humans.Pilot;
import humans.Security;
import humans.Traveler;
import items.LicenseType;
import items.Luggage;
import vehicles.Car;
import vehicles.Helicopter;
import vehicles.Hoverboard;
import vehicles.Plane;

public class AirportSimulator {

    public static void main(String[] args) {

        Set<String> forbidenList = new HashSet<>();
        forbidenList.add("RU164535");

        Plane plane1 = new Plane("A123", 100, "Airbus A319");
        Plane plane2 = new Plane("B987", 90, "Boeing 767");

        Car c1 = new Car("C33", 23, "BMW", "AA1122");

        Hoverboard hoverboard = new Hoverboard("H0", 66, "Xiomi");

        Helicopter helicopter = new Helicopter("VH00", 50, "Zeitgeit", 5);

        Pilot p1 = new Pilot("Pavel", "Popusoi", 50, 1500000);
        Pilot p2 = new Pilot("Levap", "Iosupop", 50, 1500000);

        List<Traveler> travelers = new ArrayList<>();
        travelers.add(new Traveler("Alex", "Arbore", 21, 1100, "AB192624", new Luggage(25, 12F)));
        travelers.add(new Traveler("Boris", "Brinza", 16, 33, "AB261818", new Luggage(11, 5F)));
        travelers.add(new Traveler("Catalin", "Covrig", 70, 0, "RU164535", new Luggage(33, 1F)));
        travelers.add(new Traveler("Gheorghe", "Gavril", 26, 6512, "MD456454", null));

        Personal personal1 = new Personal("Denis", "Dobrojan", 30, 23000);
        personal1.getLicenseTypes().add(LicenseType.A);
        personal1.getLicenseTypes().add(LicenseType.D1);
        Personal personal2 = new Personal("Florentina ", "Frunze", 35, 600000000);
        Personal personal3 = new Personal("Vasile", "Vlaicu", 21, 0);

        // airport personal activities
        personal1.drive(c1);
        personal2.cleanArea();
        personal2.refuelAircraft(plane2);
        personal3.drive(hoverboard);

        travelers.get(0).buySnacks();

        Security sec1 = new Security("Elizaveta", "Eleanor", 61, 70000000);

        Set<String> deported = new HashSet<>();

        // luggage and document check
        for (Traveler traveler : travelers) {
            if (traveler.getLuggage() != null) {
                sec1.checkLuggage(traveler.getLuggage());
            }
            sec1.checkDocument(traveler, forbidenList, deported);
        }

        travelers.removeIf(t -> deported.contains(t.getTravelDocument()));

        // travelers onboarding
        for (Traveler traveler : travelers) {
            traveler.board(plane1);
        }

        p1.fly(plane1);
        p2.fly(helicopter);
    }

}
