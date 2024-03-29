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
        double initialCost = quantityOfProduct * unitPrice;
        if (quantityOfProduct <= 10) {
            return initialCost;
        }

        if (quantityOfProduct <= 20) {
            return initialCost * 0.95;
        }

        if (quantityOfProduct <= 30) {
            return initialCost * 0.90;
        }

        if (quantityOfProduct <= 80) {
            double discountForEveryAdditionalTenProducts = initialCost * ((quantityOfProduct - 30) / 10) * 0.004;
            return initialCost * 0.88 - discountForEveryAdditionalTenProducts;
        }

        return initialCost * 0.87;
    }
}
