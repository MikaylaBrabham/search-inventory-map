package com.pluralsight;

public class Product {

    //add product to this project from last array project

    private int id;
    private String name;
    private float price;

    // add product format constructor


    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //add getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
