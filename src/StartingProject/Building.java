package StartingProject;

import java.util.Arrays;

public class Building {

    private Address address;
    private Apartment[] apartments;

    public Building(Address address, Apartment[] apartments) {
        this.address = address;
        this.apartments = new Apartment[apartments.length];
        System.arraycopy(apartments, 0, this.apartments, 0, apartments.length);
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address=" + address +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }
}
