package fr.maboite.correction;

/**
 * Utilisation de la récursivité pour coder une factorielle
 */
public class FactorialCorrection {

	public Integer compute(int i) {
		if (i <= 1) {
			return 1;
		}
		return i * compute(i - 1);
	}

}
