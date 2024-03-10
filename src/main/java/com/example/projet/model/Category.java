package com.example.projet.model;

public class Category {
    private String id;
    private String libelle;

    public Category(String id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Category() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
