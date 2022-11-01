package humans;

import java.util.HashSet;
import java.util.Set;

import items.LicenseType;
import vehicles.Flying;
import vehicles.Ground;

public class Personal extends Human {

    Set<LicenseType> licenseTypes;
    

    public Personal(String firstName, String lastName, int age, float balance) {
        super(firstName, lastName, age, balance);
        licenseTypes = new HashSet<>();
    }

    public void drive(Ground vehicle) {
        System.out.println(getFirstName() + " " + getLastName() + " is driving vehicle with number: " + vehicle.getNumber());
    }

    public void cleanArea() {
        System.out.println(getFirstName() + " " + getLastName() + " is cleaning the area...");
    }

    public void refuelAircraft(Flying aircraft) {
        System.out.println(getFirstName() + " " + getLastName() + " is refueing aircraft with number: " + aircraft.getNumber());
    }

    public Set<LicenseType> getLicenseTypes() {
        return licenseTypes;
    }

    public void setLicenseTypes(Set<LicenseType> licenseTypes) {
        this.licenseTypes = licenseTypes;
    }

}
