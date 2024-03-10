package com.example.projet.model;

public class Product {
    private String id;
    private String name;
    private String descript;
    private int pryce;
    private int quantity;
    private String category_id;
    private String image;

    public Product() {
    }

    public Product(String id, String name, String descript, int pryce, int quantity, String category_id, String image) {
        this.id = id;
        this.name = name;
        this.descript = descript;
        this.pryce = pryce;
        this.quantity = quantity;
        this.category_id = category_id;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public int getPryce() {
        return pryce;
    }

    public void setPryce(int pryce) {
        this.pryce = pryce;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
