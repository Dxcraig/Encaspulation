package org.example;

public class Main {
    public static void main(String[] args) {
       CommissionEmployee cm = new CommissionEmployee("John", "Doe", "123-45-6789", 10000, 0.06);
        System.out.println(cm);

        cm.setGrossSales(15000);
        cm.setCommissionRate(0.5);


        System.out.println(cm.toString());
        System.out.println("Earnings: " + cm.earnings());
        try {

            System.out.println(cm);

            // Test invalid grossSales
            try {
                cm.setGrossSales(-5000);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            // Test invalid commissionRate
            try {
                cm.setCommissionRate(1.5);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            // Test valid updates
            cm.setGrossSales(15000);
            cm.setCommissionRate(0.5);

            System.out.println(cm);
            System.out.println("Earnings: " + cm.earnings());
        } catch (Exception e) {
            System.out.println("Exception caught during initialization: " + e.getMessage());
        }
    }
}