package com.sci.bv.tema14Ianuarie;

import java.util.ArrayList;
import java.util.Scanner;

public class StorageVegetableList {

    ArrayList<VegetableProduct> list = new ArrayList<VegetableProduct>();

    public StorageVegetableList() {
    }

    /**
     * This method adds vegetable products in stock in the ArrayList "VegetableProduct",
     * together with it's characteristics.     *
     *
     * @return a new product in stock
     */
    public ArrayList<VegetableProduct> addVegetableProduct() {
        System.out.println("Enter the product's ID:");
        Scanner keyboard = new Scanner(System.in);
        int ID = keyboard.nextInt();

        System.out.println("Enter the name of product:");
        String Name = keyboard.next();

        System.out.println("Enter the quantity (pieces):");
        int Qty = keyboard.nextInt();

        System.out.println("Enter the list of vitamins it contain:");
        java.lang.String VitaminsList = keyboard.next();

        System.out.println("Enter the price (RON):");
        double Price = keyboard.nextDouble();

        System.out.println("Enter the validity date (yyyyMMdd)");
        int Validity = keyboard.nextInt();

        System.out.println("Enter the weight (kg):");
        double Weight = keyboard.nextDouble();

        list.add(new VegetableProduct(ID, Qty, Name, VitaminsList, Price, Validity, Weight));
        System.out.println("Product Added");
        return list;
    }

    /**
     * This method display  the stock of vegetable products and their characteristics.
     * (ID, quantity,name of product, list of vitamins, price, validity, weight)
     *
     * @return vegetable products and their characteristics
     */
    public void displayProduct() {
        VegetableProduct Veg = new VegetableProduct();
        for (int i = 0; i < list.size(); i++) {
            {
                Veg = list.get(i);
                System.out.println(Veg.getID() + "    " + Veg.getQty() + "    " + Veg.getName() + "    " +
                        Veg.getVitaminsList() + "     " + Veg.getPrice() + "     " + Veg.getValidity() + " " +
                        Veg.getWeight());
            }
        }

    }
}