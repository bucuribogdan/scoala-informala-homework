package com.sci.bv.tema14Ianuarie;


/**
 * In this Class are stocked animal products and their characteristics.
 * (ID, quantity,name of product, list of vitamins, price, validity, weight)
 */

public class AnimalProduct {

    private int ID;
    private int Qty;
    private String Name;
    private double Temp;
    private double Price;
    private int Validity;
    private double Weight;

    public AnimalProduct() {
        ID = 12345;
        Qty = 45;
        Name = "Branza de vaci";
        Temp = 8.5;
        Price = 5;
        Validity = 20190305;
        Weight = 1;
    }

    public AnimalProduct(int ID, int Qty, String Name, double Temp, double Price, int Validity, double Weight) {
        this.ID = ID;
        this.Qty = Qty;
        this.Name = Name;
        this.Temp = Temp;
        this.Price = Price;
        this.Validity = Validity;
        this.Weight = Weight;
    }

    public int getProductID() {
        return ID;
    }

    public int getProductQty() {
        return Qty;
    }

    public String getProductName() {
        return Name;
    }

    public double getProductTemp() {
        return Temp;
    }

    public double getProductPrice() {
        return Price;
    }

    public int getProductValidity() {
        return Validity;
    }

    public double getProductWeight() {
        return Weight;
    }

    boolean contains(int ID) {
        return ID == getProductID();
    }

    public void setProductID(int ID) {
        this.ID = ID;
    }

    public void setProductQty(int Qty) {
        this.Qty = Qty;
    }

    public void setProductName(String Name) {
        this.Name = Name;
    }

    public void setProductTemp(double Temp) {
        this.Temp = Temp;
    }

    public void setProductPrice(double Price) {
        this.Price = Price;
    }

    public void setProductValidity(int Validity) {
        this.Validity = Validity;
    }

    public void setProductWeight(double Weight) {
        this.Weight = Weight;
    }

    public void remove() {
        this.Qty--;
    }
}