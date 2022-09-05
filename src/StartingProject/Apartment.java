package StartingProject;

import java.util.Arrays;

public class Apartment {

    private String ownerName;
    private Room[] rooms;

    public Apartment(String ownerName, Room[] rooms) {
        this.ownerName = ownerName;
        this.rooms = new Room[rooms.length];
        System.arraycopy(rooms, 0, this.rooms, 0, rooms.length);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getTotalArea() {
        double area = 0;
        for (Room room : rooms) {
            area += room.getArea();
        }
        return area;
    }

    public String getCategory() {
        if (getTotalArea() <= 70) {
            return "small";
        }
        else if (getTotalArea() <= 110) {
            return "medium";
        }
        else {
            return "large";
        }
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "ownerName='" + ownerName + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
