package com.sci.bv.tema14Ianuarie;

/**
 * This Class stores products sold on a particular day (Daily Sales).
 * In this Class are storing the product's ID, sold quantity and date of sale.
 */
public class DailySales {
    private int ID;
    private int Qty;
    private int Date;

    public DailySales() {
        ID = 1234;
        Qty = 12;
        Date = 20190505;
    }

    public DailySales(int ID, int Qty, int Date) {
        this.ID = ID;
        this.Qty = Qty;
        this.Date = Date;
    }

    public int getID() {
        return ID;
    }

    public int getQty() {
        return Qty;
    }

    public int getDate() {
        return Date;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public void setDate(int Date) {
        this.Qty = Date;
    }


}
