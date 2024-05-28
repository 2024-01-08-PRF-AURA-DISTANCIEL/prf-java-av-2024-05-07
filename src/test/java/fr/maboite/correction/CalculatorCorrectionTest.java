package fr.maboite.correction;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.maboite.Calculator;

/**
 * Classe de test pour Calculator
 */
public class CalculatorCorrectionTest {
	
	@BeforeAll
	public static void initialisationToutTest() {
		System.out.println("J'initialise l'environnement pour tous les test");
	}
	
	@BeforeEach
	public void initialisationChaqueTest() {
		System.out.println("J'initialise l'environnement pour un test");
	}
	
	@AfterEach
	public void finChaqueTest() {
		System.out.println("Je finalise l'environnement pour un test");
	}
	
	@AfterAll
	public static void finToutTest() {
		System.out.println("Je finalise l'environnement pour tous les tests");
	}

	@Test
	public void testAdditionEntiers() {
		int somme = 3 + 2;
		Assertions.assertEquals(5, somme);
	}

	@Test
	public void testDivisionFlottants() {
		double quotient = 2.0 / 3;
		Assertions.assertEquals(0.66, quotient, 0.01);
	}
	
	@Test
	public void testPlusGrandeLongueur() {
		//Arrange
		Calculator calc = new Calculator();
		int xPointA = 0;
		int yPointA = 0;
		
		int xPointB = 0;
		int yPointB = 3;
		
		int xPointC = 4;
		int yPointC = 0;
		
		//Act 
		double plusGrandeLongueur = calc.calculePlusGrandeLongueur(xPointA, yPointA, xPointB, yPointB, xPointC, yPointC);
		
		//Assert
		Assertions.assertEquals(5, plusGrandeLongueur , 0.01);
	}
	
	

}
