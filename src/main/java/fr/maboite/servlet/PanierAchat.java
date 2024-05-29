package fr.maboite.servlet;

public class PanierAchat {

    private int nombreProduits = 0;

    public void ajouterProduit() {
        nombreProduits++;
    }

    public int getNombreProduits() {
        return nombreProduits;
    }

    public void setNombreProduits(int nombreProduits) {
        this.nombreProduits = nombreProduits;
    }
}
