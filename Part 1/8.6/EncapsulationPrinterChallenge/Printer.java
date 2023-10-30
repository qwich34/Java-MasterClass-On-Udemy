package EncapsulationPrinterChallenge;
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
          // Not such a useful if statement
//        if(tonerLevel > 100 || tonerLevel < 0){
//            this.tonerLevel = -1;
//        } else {
//            this.tonerLevel = tonerLevel;
//        }
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addTuner(int tonerAmount) {
//        if((this.tonerLevel + tonerAmount) < 0 ||
//                (this.tonerLevel + tonerAmount) > 100) {
//            return this.tonerLevel = -1;
//        } else {
//            return this.tonerLevel += tonerAmount;
//        }
        int tempAmount = tonerAmount + tonerLevel;
        if(tempAmount > 100 || tempAmount < 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
//        if(duplex) {
//            return this.pagesPrinted += pages / 2;
//        } else {
//            return  this.pagesPrinted += pages;
//        }
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;

        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
