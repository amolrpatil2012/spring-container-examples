package com.example.beans;

public class Mobile {

    private String brandName;
    private int price;

    @Override
    public String toString() {
        return "Mobile{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
