package playerAndPrinter;

// Private keyword is a important. Encapsulation allows us
// to hide data. With this way objects is close to outside
// Let's check to differences of "public" VS "private" keywords.

public class Player {
    // public String name;
    // public int health = 100;
    // public String weapon;

    private String name;
    private int health = 100;
    private String weapon;

    // After used "private" keywords fields of class are inaccessible
    // For access to members of class we should use getter and setters

    public Player(String name, int health, String weapon) { // With constructor we can make some validations
        this.name = name;
        if (this.health > 0 && this.health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player is dead!!");
            // Reduce number of lives remaining for the player
        }
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public String getWeapon() {
        return this.weapon;
    }

}

