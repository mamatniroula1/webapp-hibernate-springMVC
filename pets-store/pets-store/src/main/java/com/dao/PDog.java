package com.dao;

import java.sql.Timestamp;

public class PDog {
    private int did;
    private String name;
    private String color;
    private int price;
    private Timestamp doe;
    public PDog(){}

    public PDog(int did, String name, String color, int price, Timestamp doe) {
        this.did = did;
        this.name = name;
        this.color = color;
        this.price = price;
        this.doe = doe;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Timestamp getDoe() {
        return doe;
    }

    public void setDoe(Timestamp doe) {
        this.doe = doe;
    }

    @Override
    public String toString() {
        return "PDog{" +
                "did=" + did +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", doe=" + doe +
                '}';
    }
}
