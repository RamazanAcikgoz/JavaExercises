package compositionTwo;

public class Room {
    private int number;
    private int size;
    private String furnitures;

    public Room(int number, int size, String furnitures) {
        this.number = number;
        this.size = size;
        this.furnitures = furnitures;
    }

    public void roomColor() {
        System.out.println("Yellow");
    }

    public int getNumber() {
        return number;
    }
    public int getSize() {
        return size;
    }
    public String getFurniture() {
        return furnitures;
    }

}