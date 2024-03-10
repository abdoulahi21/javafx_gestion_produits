package com.example.projet.model;

public class Orders {
    private int id;
    private int clients_id;
    private String date;

    public Orders(int id, int clients_id, String date) {
        this.id = id;
        this.clients_id = clients_id;
        this.date = date;
    }

    public Orders() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClients_id() {
        return clients_id;
    }

    public void setClients_id(int clients_id) {
        this.clients_id = clients_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
