package fr.maboite;

public class ClasseADebugger {

	public static void main(String[] args) {
		boolean isTrue = true;
		int leNombre = 1;
		for (int i = 0; i < 3000; i++) {
			if (isTrue) {
				System.out.println("Ce programme affichera toujours cette ligne.");
			} else {
				System.out.println("Ce programme n'affichera jamais cette ligne.");
			}
		}
	}

}