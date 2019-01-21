package com.sci.bv.tema14Ianuarie;

/**
 * In this Class are stocked vegetable products and their characteristics.
 * (ID, quantity,name of product, list of vitamins, price, validity, weight)
 */
public class VegetableProduct {

    private int ID;
    private int Qty;
    private String Name;
    private String VitaminsList;
    private double Price;
    private int Validity;
    private double Weight;

    public VegetableProduct() {
        ID = 22222;
        Qty = 34;
        Name = "Cartofi";
        VitaminsList = "Calciu, Magneziu, Viamina C";
        Price = 1;
        Validity = 20190605;
        Weight = 1;
    }

    public VegetableProduct(int ID, int Qty, String Name, String VitaminsList, double Price, int Validity, double Weight) {
        this.ID = ID;
        this.Qty = Qty;
        this.Name = Name;
        this.VitaminsList = VitaminsList;
        this.Price = Price;
        this.Validity = Validity;
        this.Weight = Weight;
    }

    public int getID() {
        return ID;
    }

    public int getQty() {
        return Qty;
    }

    public String getName() {
        return Name;
    }

    public String getVitaminsList() {
        return VitaminsList;
    }

    public double getPrice() {
        return Price;
    }

    public int getValidity() {
        return Validity;
    }

    public double getWeight() {
        return Weight;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setVitaminsList(String VitaminsList) {
        this.VitaminsList = VitaminsList;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setValidity(int Validity) {
        this.Validity = Validity;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public void remove() {
        this.Qty--;
    }
}