package fr.maboite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factorial {

	private static final Logger LOGGER=LoggerFactory.getLogger(Factorial.class);
	
	public Integer compute(int i) {
		LOGGER.info("Méthode compute dans la classe Factoriel");
		LOGGER.trace("Début");
		int res=1;
		LOGGER.debug("Initialisation de la variable res : {}", res);
		if(i < 0) {
			LOGGER.error("Entrée invalide dans la condition i < 0 {} : ", i);
			return 0;
		}else if(i == 0 || i == 1) {
			LOGGER.debug("Dans la condition i==0 || i==1 : {} ", i);
			return 1;
		}else {
			LOGGER.debug("Dans la condition else.");
			for (int j = i; j > 1; j--) {
				LOGGER.debug("i : {}", i);
				LOGGER.debug("j : {}", j);
				res*=j;
				LOGGER.debug("res : {}", res);
			}
		}
		
		LOGGER.trace("FIN");
		return res;
	}
}
