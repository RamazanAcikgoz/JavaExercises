package hamburgerOOP;

public class HealthyBurger extends Hamburger {

    private String healthyExtraName;
    private double healthyExtraPrice;

    private String healthyExtraNameTwo;
    private double healthyExtraPriceTwo;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAdditionOne(String name, double price) {
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }

    public void addHealthAdditionTwo(String name, double price) {
        this.healthyExtraNameTwo = name;
        this.healthyExtraPriceTwo = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtraName != null) {
            hamburgerPrice += this.healthyExtraPrice;
            System.out.println("Added " + this.healthyExtraName + " for an extra " + this.healthyExtraPrice);
        }
        if(this.healthyExtraNameTwo != null) {
            hamburgerPrice += this.healthyExtraPriceTwo;
            System.out.println("Added " + this.healthyExtraNameTwo + " for an extra " + this.healthyExtraPriceTwo);
        }

        return hamburgerPrice;
    }

}
