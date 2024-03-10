package com.example.projet.model;

public class OrdersDetails {
    private int id;
    private int orders_id;
    private int product_id;
    private int quantity;
    private int total;

    public OrdersDetails(int id, int orders_id, int product_id, int quantity, int total) {
        this.id = id;
        this.orders_id = orders_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.total = total;
    }

    public OrdersDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
