package com.gestionRdv.myapplication;

public class Doctor {
    private int id;
    private String Nom;
    private int Prestation;

    public Doctor(int id) {
        this.id = id;
    }

    public Doctor(int id, String nom, int prestation) {
        this.id = id;
        Nom = nom;
        Prestation = prestation;
    }

    public int getPrestation() {
        return Prestation;
    }

    public void setPrestation(int prestation) {
        Prestation = prestation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
}
