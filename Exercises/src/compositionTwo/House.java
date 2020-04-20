package compositionTwo;

public class House {

    private String type;
    private Room rooms;
    private Door doors;
    private int meterSquare;

    public House(String type, Room rooms, Door doors, int meterSquare) {
        this.type = type;
        this.rooms = rooms;
        this.doors = doors;
        this.meterSquare = meterSquare;
    }
    public void roomColor() {
        rooms.roomColor();
    }
    public void doorColor() {
        doors.doorColor();
    }
    public String getType() {
        return type;
    }
    public Room getRoom() {
        return rooms;
    }
    public Door getDoor() {
        return doors;
    }
    public int getMeter() {
        return meterSquare;
    }

}
