package fr.maboite.correction;

/**
 * Classe utilitaire pour sommer les entiers
 * dans une chaîne de caractères.
 */
public class StringSummer {

	public int calcule(String entree) {
		int somme = 0;
		if (entree == null) {
			return somme;
		}

		String[] strings = entree.split(",");
		for (String s : strings) {
			try {
				int sEnEntier = Integer.parseInt(s);
				somme += sEnEntier;
			} catch (NumberFormatException nfe) {
				// Ici, on ne fait rien
			}
		}
		return somme;
	}

}
