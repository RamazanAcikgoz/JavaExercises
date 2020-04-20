package compositionTwo;

public class Door {
    private String type;

    public Door(String type) {
        this.type = type;
    }

    public void doorColor() {
        System.out.println("White");
    }
    public String getType() {
        return type;
    }

}
