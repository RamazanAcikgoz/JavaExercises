package CompositionExample;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("221B", "HP", "220", dimensions);

        Resolution reso = new Resolution(2540, 1440);
        Monitor theMonitor = new Monitor("21 inc Beast", "HP", 27, reso);

        // Monitor theMonitor = new Monitor("21 inc Beast","HP",21, new
        // Resolution(2540,1440);
        // We can write like that too..

        Motherboard theMotherboard = new Motherboard("BB-220", "ASUS", 4, 2, "V2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        // thePC.getMonitor().drawPixelAt(1500,1200,"red");
        // thePC.getMotherboard().loadProgram("Windows 10"); BECAUSE OF PRIVATE ACCESS
        // MODIFIER
        // thePC.getTheCase().pressPowerButton();

        thePC.powerUp();

    }
}
