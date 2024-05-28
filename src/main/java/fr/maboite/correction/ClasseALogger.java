package fr.maboite.correction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ClasseALogger {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ClasseALogger.class);
	
	public int calculeComplexe() {
		LOGGER.info("Je vais lancer un calcul complexe");
		return 3;
	}
	
	public double division(double a, double b) {
		LOGGER.info("Je vais lancer une division");
		LOGGER.info("a vaut : " + a);
		LOGGER.info("b vaut : " + b);
		double result =  a /b;
		LOGGER.info("result vaut : " + result);
		return result;
	}
	
	public static void main(String[] args) {
		ClasseALogger classeALogger = new ClasseALogger();
		classeALogger.calculeComplexe();
		classeALogger.division(4, 3);
	}

}
