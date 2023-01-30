package com.gestionRdv.myapplication;

public class Patient {
    private int id;
    private String NomP;
    private int nbJour;
    private String address;
    private int idD;
    private int montant;

    public Patient(int id) {
        this.id = id;
    }

    public Patient(int id, String nomP, int idD) {
        this.id = id;
        NomP = nomP;
        this.idD = idD;
    }

    public Patient(int id, String nomP, int nbJour, String address, int idD, int montant) {
        this.id = id;
        NomP = nomP;
        this.nbJour = nbJour;
        this.address = address;
        this.idD = idD;
        this.montant = montant;
    }

    public Patient(int id, String nomP, int nbJour, String address, int montant) {
        this.id = id;
        NomP = nomP;
        this.nbJour = nbJour;
        this.address = address;
        this.montant = montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomP() {
        return NomP;
    }

    public void setNomP(String nomP) {
        NomP = nomP;
    }

    public int getNbJour() {
        return nbJour;
    }

    public void setNbJour(int nbJour) {
        this.nbJour = nbJour;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
