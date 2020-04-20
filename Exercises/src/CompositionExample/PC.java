package CompositionExample;

public class PC {
    private Case theCase;  // Pc has a case
    private Monitor monitor;  // Pc has a monitor
    private Motherboard motherboard;  // Pc has a motherboard

    public PC(Case theCase,Monitor monitor,Motherboard motherboard){
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        // Fancy graphics
        monitor.drawPixelAt(400,400,"Gray");
    }
    private Case getTheCase(){
        return theCase;
    }
    private Monitor getMonitor(){
        return monitor;
    }
    private Motherboard getMotherboard(){
        return motherboard;
    }
}