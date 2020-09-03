package com.agibank.entity;

public class Venda {

    private String saleId;
    private double salePrice;
    private String salesMan;

    public Venda(String saleId, double salePrice, String salesMan) {
        this.saleId = saleId;
        this.salePrice = salePrice;
        this.salesMan = salesMan;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getSalesMan() {
        return salesMan;
    }

    public void setSalesMan(String salesMan) {
        this.salesMan = salesMan;
    }

}
