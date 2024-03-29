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
    public static double calculateTotalCost (double unitPrice, int quantityOfProduct) {
        if (quantityOfProduct <= 10) {
            return quantityOfProduct * unitPrice;
        }

        if (quantityOfProduct <= 20) {
            return quantityOfProduct * unitPrice * 0.95;
        }

        if (quantityOfProduct <= 30) {
            return quantityOfProduct * unitPrice * 0.90;
        }

        if (quantityOfProduct <= 80) {
            return quantityOfProduct * unitPrice * 0.88 - quantityOfProduct * unitPrice * ((quantityOfProduct - 30) / 10) * 0.004;
        }

        return quantityOfProduct * unitPrice * 0.87;
    }
}
