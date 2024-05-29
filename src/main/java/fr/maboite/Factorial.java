package fr.maboite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factorial {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Factorial.class);
	
	public static int compute(int n) {
		LOGGER.info(" calculer la factorielle de nombre <=0");
		
		if(n <= 0) {
			
			return 1;
		}
		
		LOGGER.info(" calculer la factorielle de nombre >=1");
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact*=i;
			
		}
		LOGGER.error("error: le calcule a echoué !" );
		LOGGER.debug(" le resultat apres le calcul:" +fact);
		return fact;
		
	}
	
	
		
	    
	    	
	    	

	

	
		// TODO Auto-generated constructor stub
	

	}

