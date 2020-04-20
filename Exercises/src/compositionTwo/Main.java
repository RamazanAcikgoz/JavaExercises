package compositionTwo;

public class Main {
    public static void main(String[] args) {

        Door theDoor = new Door("Oak");
        Room theRoom = new Room(3, 66, "Bed");
        House theHouse = new House("Aparment", theRoom, theDoor, 90);

        theHouse.doorColor();
        theHouse.roomColor();

    }
}
