package StartingProject;

public class Room {

    private String type;
    private double width;
    private double height;

    public Room(String type, double width, double height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public Room(Room room) {
        this.type = room.getType();
        this.height = room.getHeight();
        this.width = room.getWidth();
    }

    public double getArea() {
        return width * height;
    }

    public String getType() {
        return type;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
