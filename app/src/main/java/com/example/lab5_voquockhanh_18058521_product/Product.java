package com.example.lab5_voquockhanh_18058521_product;

public class Product {

    private int img;
    private String name;
    private float rating;
    private String price;
    private String oldPrice;

    public Product() {
    }

    /**
     * @param img
     * @param name
     * @param rating
     * @param price
     */
    public Product(int img, String name, float rating, String price, String oldPrice) {
        this.img = img;
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.oldPrice = oldPrice;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }


}
