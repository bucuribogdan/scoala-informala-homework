package com.sci.bv.tema14Ianuarie;

import java.util.ArrayList;
import java.util.Scanner;

public class StorageAnimalList {

    ArrayList<AnimalProduct> list = new ArrayList<AnimalProduct>();

    public StorageAnimalList() {
    }

    /**
     * This method adds animal products in stock in the ArrayList "AnimalProduct",
     * together with it's characteristics.
     *
     * @return a new product in stock
     */
    public ArrayList<AnimalProduct> addAnimalProduct() {
        System.out.println("Enter the product's ID:");
        Scanner keyboard = new Scanner(System.in);
        int ID = keyboard.nextInt();

        System.out.println("Enter the quantity (pieces):");
        int Qty = keyboard.nextInt();

        System.out.println("Enter the name of product:");
        String Name = keyboard.next();

        System.out.println("Enter the optimal temperature (Celsius degrees):");
        double Temp = keyboard.nextDouble();

        System.out.println("Enter the price (RON):");
        double Price = keyboard.nextDouble();

        System.out.println("Enter the validity date (yyyyMMdd)");
        int Validity = keyboard.nextInt();

        System.out.println("Enter the weight (kg):");
        double Weight = keyboard.nextDouble();

        list.add(new AnimalProduct(ID, Qty, Name, Temp, Price, Validity, Weight));
        System.out.println("Product Added");
        return list;
    }

    /**
     * This method display  the stock of animal products and their characteristics.
     * (ID, quantity,name of product, indicated storage temperature, price, validity, weight)
     *
     * @return animal products and their characteristics
     */
    public void displayProduct() {
        AnimalProduct Anim = new AnimalProduct();
        for (int i = 0; i < list.size(); i++) {
            {
                Anim = list.get(i);
                System.out.println(Anim.getProductID() + " " + Anim.getProductQty() + " " + Anim.getProductName() + " " +
                        Anim.getProductTemp() + " " + Anim.getProductPrice() + " " + Anim.getProductValidity() + " " +
                        Anim.getProductWeight());
            }
        }
    }

}

