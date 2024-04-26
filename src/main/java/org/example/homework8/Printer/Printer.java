package org.example.homework8.Printer;

public class Printer {
    int tonerLevel;
    int pagesPrinted;
    boolean duplex;
    public Printer(int tonerLevel, boolean duplex) {

        this.pagesPrinted = 0;
        this.duplex = duplex;

        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
    }

    public int addToner(int tonerAmount) {
        int sum = tonerAmount + this.tonerLevel;
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (sum > 100) {
                return -1;
            } else {
                this.tonerLevel = sum;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        double pagesToPrint = pages;

        if (duplex) {
            pagesToPrint = Math.round((double) pages / 2);
            this.pagesPrinted = (int) pagesToPrint;
            return (int) pagesToPrint;
        } else {
            this.pagesPrinted = (int) pagesToPrint;
            return pages;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

