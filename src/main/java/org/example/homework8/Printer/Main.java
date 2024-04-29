package org.example.homework8.Printer;

public class Main {
    public static void main(String[] args) {
        int tonerAmount = 120;
        int amountOfPages = 7;
        int tonerLevel = -6;
        boolean duplex = true;
        Printer printer = new Printer(tonerLevel, duplex);
        System.out.println(printer.tonerLevel);
        System.out.println("Toner " + printer.addToner(tonerAmount));
        System.out.println("Amount of pages " + amountOfPages);
        printer.printPages(amountOfPages);
        System.out.println("Amount of sheets " + printer.getPagesPrinted());
    }
}
