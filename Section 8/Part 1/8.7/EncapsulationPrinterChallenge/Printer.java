package EncapsulationPrinterChallenge;
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount < 100) {
            int tempAmount = tonerAmount + tonerLevel;
            if(tempAmount > 100) {
                return -1;
            }
            tonerLevel += tonerAmount;
        } else {
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        if(duplex) System.out.println("Printing in duplex");
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
