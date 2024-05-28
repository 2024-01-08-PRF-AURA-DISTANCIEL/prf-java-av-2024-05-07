package fr.maboite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFactorielle {
	
	@Test
	public void testFactorielleZero() {
		 Factorial fc =  new Factorial() ;
		
		Assertions.assertEquals(1, fc.compute(0));
	}
	
	@Test
	public void testFactorielleUn() {
		Factorial fc =  new Factorial() ;
		
		Assertions.assertEquals(1, fc.compute(1));
	}
	
	@Test 
	public void testFactorielleDeux() {
		Factorial fc =  new Factorial() ;
		Assertions.assertEquals(2, fc.compute(2));
	}
	
	@Test 
	public void testFactorielleTrois() {
		Factorial fc =  new Factorial() ;
		
		Assertions.assertEquals(6, fc.compute(3));
	}
	
	
	
	
	

	public TestFactorielle() {
		// TODO Auto-generated constructor stub
		
		
	}

}
