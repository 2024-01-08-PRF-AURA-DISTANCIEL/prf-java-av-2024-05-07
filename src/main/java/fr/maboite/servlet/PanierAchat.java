package fr.maboite.servlet;

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

	

	public PanierAchat() {
		// TODO Auto-generated constructor stub
	}

}
