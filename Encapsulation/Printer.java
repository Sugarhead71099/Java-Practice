package Encapsulation;

/**
 * Created by braij on 4/7/2017.
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex; // Can print on both sides of paper

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel >=1 && tonerLevel <= 100 ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }
    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
    public boolean isDuplex() {
        return this.duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100)
            if(this.tonerLevel + tonerAmount > 100)
                return -1;
            else {
                this.tonerLevel += tonerAmount;
                return tonerLevel;
            }
        else
            return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

}
