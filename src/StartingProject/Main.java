package StartingProject;

public class Main {

    private static int numOfLargeApartments(Building building) {
        int numApartments = 0;
        for (Apartment apartment : building.getApartments()) {
            if (apartment.getCategory().equals("large")) {
                numApartments++;
            }
        }
        return numApartments;
    }

    public static void printBuildingsWithMostLargeApartments(Building[] buildings) {
        Building maxBuilding = buildings[0];
        for (Building building: buildings) {
            int numLargeApartments = 0;
            for (Apartment apartment : building.getApartments()) {
                if (numOfLargeApartments(building) > numOfLargeApartments(maxBuilding)) {
                    maxBuilding = building;
                }
            }
        }

        for (Building building : buildings) {
            if (numOfLargeApartments(building) == numOfLargeApartments(maxBuilding)) {
                System.out.println(building.getAddress());
                for (Apartment apartment : building.getApartments()) {
                    if (apartment.getCategory().equals("large")) {
                        System.out.println(apartment.getOwnerName());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Room room = new Room("yes", 10, 20);
        Apartment apartment = new Apartment("123", new Room[]{
                new Room("2", 10, 10),
                new Room("3", 10, 10),
                new Room("4", 10, 10),
        });

        System.out.println(room.getArea());

        System.out.println(apartment.getTotalArea());

        Building building2 = new Building(new Address("Yes st", 10, "Rehovot"), new Apartment[]{
                new Apartment("5", new Room[]{
                        new Room("a", 1, 1), // small
                        new Room("b", 1, 2), // small
                        new Room("c", 100, 100), // large
                        new Room("d", 100, 100) // large
                }), // large apartment

                new Apartment("6", new Room[]{
                        new Room("e", 1, 1), // small
                        new Room("f", 1, 2), // small
                        new Room("g", 1, 1), // small
                        new Room("h", 100, 100) // large
                }), // large apartment
        });

        Building building1 = new Building(
                new Address("Yes 2 st", 20, "Rehovot"),
                new Apartment[]{
                        new Apartment("7", new Room[]{
                                new Room("i", 1, 1),
                                new Room("j", 1, 1),
                        }), // small apartment
                        new Apartment("8", new Room[]{
                                new Room("k", 1, 1),
                                new Room("l", 100, 100)
                        }) // large apartment
                }
        );

        Building[] buildings = new Building[2];
        buildings[0] = building1;
        buildings[1] = building2;

        printBuildingsWithMostLargeApartments(buildings);
    }
}
