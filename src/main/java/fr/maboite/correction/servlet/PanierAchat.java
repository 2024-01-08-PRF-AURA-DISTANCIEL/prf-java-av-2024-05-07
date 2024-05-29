package fr.maboite.correction.servlet;

public class PanierAchat {

	private int nombreProduits = 0;

	public void ajouteProduit() {
		nombreProduits++;
	}

	public int getNombreProduits() {
		return nombreProduits;
	}

	public void setNombreProduits(int nombreProduits) {
		this.nombreProduits = nombreProduits;
	}

}
