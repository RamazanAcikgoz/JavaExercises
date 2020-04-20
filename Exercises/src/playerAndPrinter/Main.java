package playerAndPrinter;

public class Main {
    public static void main(String[] args) {

        // As we see below with "public" keywords we can directly accessable to
        // class members (fields) and assigned values. It is not recommended!


        //Player ra = new Player();
        //ra.name = "Excalibur";
        //ra.health = 150;
        //ra.weapon = "AK-47";

        //System.out.println("Player Name : " + ra.name + "\r Player health : " + ra.health + "\r Player weapon : " + ra.weapon);

        Player raTwo = new Player("Excalibur",150,"AK-47");
        System.out.println("Player info : " + raTwo.getName() + " Health : " + raTwo.getHealth() + " Weapon : " + raTwo.getWeapon());
        int damage = 20;
        raTwo.loseHealth(damage);
        System.out.println("Player Health : " + raTwo.getHealth());


        // Let's make a another example for printers.

        // Create a class and demonstate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

        Printer hp = new Printer(80,true);
        System.out.println("Initial page count : " + hp.getPagesPrinted());
        int pagesPrinted = hp.printedPages(12);
        System.out.println("Pages printed was : " + pagesPrinted + " new total print count for printer = " + hp.getPagesPrinted());

    }
}
