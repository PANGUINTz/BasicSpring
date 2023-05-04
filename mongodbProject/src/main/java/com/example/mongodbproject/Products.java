package com.example.mongodbproject;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "products")
public class Products {

    @Id
    private String id;
    private String title;
    private String type;
    private String description;
    private String filename;
    private int height;
    private int width;
    private double price;
    private int rate;

    public Products() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Products(String id, String title, String type, String description, String filename, int height, int width, double price, int rate) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.description = description;
        this.filename = filename;
        this.height = height;
        this.width = width;
        this.price = price;
        this.rate = rate;
    }
}
