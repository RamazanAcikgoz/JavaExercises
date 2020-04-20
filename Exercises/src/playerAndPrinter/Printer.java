package playerAndPrinter;

public class Printer {
    private int tonerLevel;
    private int printedPage;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(this.tonerLevel>-1 && this.tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }
    public int printedPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("Printing is duplex mode...");
        }
        this.printedPage += pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted() {
        return printedPage;
    }

}
