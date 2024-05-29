package fr.maboite;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPremier {
	
		
		@BeforeAll
		public static void initialisationToutTest() {
			 System.out.println("j'initialise l'environnement pour tous les test");	
		}
	  

	   @BeforeEach
	   public static void initialisationChaqueTest() {
			 System.out.println("j'initialise l'environnement pour un test");	
		}
	   
	  
	   
	   @AfterEach
	   public static void finChaqueTest() {
			 System.out.println("je finalise  l'environnement pour un test");	
			
		}
	   

	   @AfterAll
	   public static void finTousTest() {
			 System.out.println("je finalise  l'environnement pour tous les test");	
			
		}
	  
	  @Test 
	   public void testSucced() {
			int nbre = 5;
	        Assertions.assertEquals (5,5);
	        
	        System.out.println("le test a reussi");
	    }
	   
	  @Test
	   public void testFails() {
	    	int nbre = 3;
	    	Assertions.assertEquals(3,1);
	       System.out.println("le test a echoué");
	        
	    }
		
	}


