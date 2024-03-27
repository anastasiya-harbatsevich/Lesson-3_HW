package org.example.homework4;

public class ProductCostCalculator {
    public static void main(String[] args) {
        // price of the product
        double unitPrice = 10.0;
        // Quantity
        int quantity = 100;

        double totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);
    }
    public static double calculateTotalCost (double unitPrice, int quant) {
        if (quant <= 10) {
            return quant * unitPrice;
        }

        if (quant <= 20) {
            return quant * unitPrice * 0.95;
        }

        if (quant <= 30) {
            return quant * unitPrice * 0.90;
        }

        if (quant <= 80) {
            return quant * unitPrice * 0.88 - quant * unitPrice * ((quant - 30) / 10) * 0.004;
        }

        return quant * unitPrice * 0.87;
    }
}
