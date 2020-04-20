package hamburgerOOP;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionName;
    private double additionPrice;

    private String additionNameTwo;
    private double additionPriceTwo;

    private String additionNameThree;
    private double additionPriceThree;

    private String additionNameFour;
    private double additionPriceFour;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHambugerAdditional(String name, double price) {
        this.additionName = name;
        this.additionPrice = price;
    }
    public void addHamburgerAdditionalTwo(String name, double price) {
        this.additionNameTwo = name;
        this.additionPriceTwo = price;
    }
    public void addHamburgerAdditionalThree(String name, double price) {
        this.additionNameThree = name;
        this.additionPriceThree = price;
    }
    public void addHamburgerAdditionalFour(String name, double price) {
        this.additionNameFour = name;
        this.additionPriceFour = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is " + this.price);
        if (this.additionName != null) {
            hamburgerPrice += this.additionPrice;
            System.out.println("Added " + this.additionName + " for an extra " + this.additionPrice);
        }
        if (this.additionNameTwo != null) {
            hamburgerPrice += this.additionPriceTwo;
            System.out.println("Added " + this.additionNameTwo + " for an extra " + this.additionPriceTwo);
        }
        if (this.additionNameThree != null) {
            hamburgerPrice += this.additionPriceThree;
            System.out.println("Added " + this.additionNameThree + " for an extra " + this.additionPriceThree);
        }
        if (this.additionNameFour != null) {
            hamburgerPrice += this.additionPriceFour;
            System.out.println("Added " + this.additionNameFour + " for an extra " + this.additionPriceFour);
        }

        return hamburgerPrice;
    }

}

