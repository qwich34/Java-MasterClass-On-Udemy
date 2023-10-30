package EncapsulationPrinterChallenge;

public class TestPrinterObjectClass {
    public static void main(String[] args) {
        Printer duplexPrinter = new Printer(50,true);
        System.out.println("initial page count = "
                + duplexPrinter.getPagesPrinted());

        int pagesPrinted = duplexPrinter.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, duplexPrinter.getPagesPrinted());

         pagesPrinted = duplexPrinter.printPages(15);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, duplexPrinter.getPagesPrinted());

        System.out.println("_ ".repeat(23));
        Printer notDuplexPrinter = new Printer(24,false);

        System.out.println("initial page count = " +
                notDuplexPrinter.getPagesPrinted());

         pagesPrinted = notDuplexPrinter.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, notDuplexPrinter.getPagesPrinted());

        pagesPrinted = notDuplexPrinter.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, notDuplexPrinter.getPagesPrinted());
    }
}
