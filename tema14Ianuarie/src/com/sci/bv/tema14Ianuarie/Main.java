package com.sci.bv.tema14Ianuarie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This Class is the main menu.
 * Depending on the desired option the user can add products and related characteristics,
 * sell products and show sales made on a particular day.
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StorageAnimalList myList = new StorageAnimalList();
        StorageVegetableList myList1 = new StorageVegetableList();
        AnimalProduct Anim = new AnimalProduct();
        VegetableProduct Veg = new VegetableProduct();
        ArrayList<AnimalProduct> Animlist = new ArrayList<AnimalProduct>();
        ArrayList<VegetableProduct> Veglist = new ArrayList<VegetableProduct>();
        DailySales Sales = new DailySales();
        ArrayList<DailySales> DailyS = new ArrayList<DailySales>();
        int x = 0;
        while (x < 4 && x >= 0) {
            System.out.println(
                    "-------------------------------------------------------------\n" +
                            "1. Create product and add it to stock\n" +
                            "2. Sell product\n" +
                            "3. Display daily sales report\n" +
                            "4. Exit\n" +
                            "\n" +
                            "Choose an option:\n" +
                            "-------------------------------------------------------------\n");
            x = scanner.nextInt();
            if (x == 1)  // If the user chooses first option
            {
                System.out.println(
                        "-------------------------------------------------------------\n" +
                                "Product type (1 - animal; 2 - vegetable):\n" +
                                "-------------------------------------------------------------\n" +
                                "\n");
                x = scanner.nextInt();
                while (x == 1) {
                    Animlist = myList.addAnimalProduct(); //Add animal product and characteristics
                    System.out.println(
                            "-------------------------------------------------------------\n" +
                                    "1.Add another animal product\n" +
                                    "0.Go back to main menu\n" +
                                    "-------------------------------------------------------------\n" +
                                    "\n");
                    x = scanner.nextInt();
                }
                while (x == 2) {
                    Veglist = myList1.addVegetableProduct();//Add animal product and characteristics
                    System.out.println("-------------------------------------------------------------\n" +
                            "2.Add another vegetable product\n" +
                            "0.Go back to main menu\n" +
                            "-------------------------------------------------------------\n" +
                            "\n");
                    x = scanner.nextInt();
                }

            }
            while (x == 2) {
                System.out.println("-------------------------------------------------------------\n" +
                        "ID   Quantity   Product's name      Optimal Temperature    Price    Validity    Weight\n");
                myList.displayProduct(); //Display animal products and characteristics
                System.out.println("-------------------------------------------------------------\n" +
                        "ID   Quantity   Product's name      Vitamins List    Price    Validity    Weight\n");
                myList1.displayProduct();//Display vegetable products and characteristics
                System.out.println("Please write the ID product:");
                int ID = scanner.nextInt();
                System.out.println("Please write the quantity:");
                int Qty = scanner.nextInt();
                for (AnimalProduct a : Animlist) {
                    if (ID == a.getProductID()) { // Verify if the given product's ID is on stock
                        if (Qty <= a.getProductQty() && a.getProductQty() != 0) {//Verify if is in stock the given quantity
                            System.out.println("The order is valid.");
                            System.out.println("Plese write the order date (yyyyMMdd):");
                            int day = scanner.nextInt();
                            Sales.setDate(day);
                            Sales.setID(a.getProductID());
                            Sales.setQty(Qty);
                            DailyS.add(new DailySales(a.getProductID(), Qty, day));//Save the sale in Daily Sales
                            for (int y = 1; y <= Qty; y++) {
                                a.remove(); //Updating the quantity of products left in stock
                            }
                        } else System.out.println("You must input a smaller quantity for the searched ID.\n" +
                                "In stock are just:" + a.getProductQty() + " pieces.");
                    } else System.out.println("The ID is not found in stock list.");
                }
                for (VegetableProduct v : Veglist) {
                    if (v.getID() == ID) { // Verify if the given product's ID is on stock
                        if (Qty <= v.getQty() && v.getQty() != 0) {//Verify if is in stock the given quantity
                            System.out.println("The order is valid.");
                            System.out.println("Plese write the order date (yyyyMMdd):");
                            int day = scanner.nextInt();
                            Sales.setDate(day);
                            Sales.setID(v.getID());
                            Sales.setQty(Qty);
                            DailyS.add(new DailySales(v.getID(), Qty, day));//Save the sale in Daily Sales
                            for (int y = 1; y <= Qty; y++) {
                                v.remove();//Updating the quantity of products left in stock
                            }
                        } else System.out.println("You must input a smaller quantity for the searched ID.\n" +
                                "In stock are just:" + v.getQty() + " pieces.");
                    } else System.out.println("The ID is not found in stock list.");
                }
                System.out.println("\"---------------------------------------\n" +
                        "0. Go back to main menu\n" +
                        "2. Sell another product\n" +
                        "\"---------------------------------------\n" +
                        "\n");
                x = scanner.nextInt();
            }
            while (x == 3) {
                System.out.println("Please insert the date (yyyyMMdd)");
                int day = scanner.nextInt();
                for (DailySales d : DailyS) {
                    if (day == d.getDate()) {//Check if sales are made on that given date
                        System.out.println("\"-----------------------------------------\n" +
                                "ID    Quantity    Sold on\n" +
                                "\"------------------------------------------\n");
                        System.out.println(d.getID() + "    " + d.getQty() + "      " + d.getDate());
                    } else System.out.println("No sales were made on:" + day);
                }
                System.out.println("0. Back to main menu");
                x = scanner.nextInt();
            }
        }
        System.out.println("Have a good day!");
    }
}
