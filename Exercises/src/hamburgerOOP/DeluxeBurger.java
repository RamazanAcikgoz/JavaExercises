package hamburgerOOP;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHambugerAdditional("Chips", 2.75);
        super.addHamburgerAdditionalTwo("Drink", 1.81);
    }

    @Override
    public void addHambugerAdditional(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionalTwo(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionalThree(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionalFour(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
