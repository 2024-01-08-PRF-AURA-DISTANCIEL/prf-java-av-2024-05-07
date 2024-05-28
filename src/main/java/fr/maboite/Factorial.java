package fr.maboite;


import fr.maboite.logger.LoggerExample;
import fr.maboite.logger.Looper;
import fr.maboite.logger.TestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factorial {

	private static final Logger LOGGER = LoggerFactory.getLogger(Factorial.class);

	public Integer compute(int i) {
		// TODO Auto-generated method stub
		if (i <= 0){
			return 1;
		}
		int fact = 1;
		for (int j = 1; j <= i; j++) {
			fact = fact * j;
		}
        return fact;
    }

	public static void main(String[] args) throws TestException {
		LOGGER.info("Démarrage du main");
		Looper looper = new Looper();
		LOGGER.info("Le factoriel vaut : {}", looper.loop(10));
		LOGGER.debug("Le factoriel des entiers négatifs vaut 1 ");
		LOGGER.error("Le factoriel de zéro vaut 1 ");
		LOGGER.info("Fin du main");

	}

}
