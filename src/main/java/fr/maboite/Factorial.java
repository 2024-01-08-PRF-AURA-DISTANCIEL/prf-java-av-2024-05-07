package fr.maboite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Factorial {
	private static final Logger LOGGER = LoggerFactory.getLogger(Factorial.class);
     
	public Integer compute(int i) {
		
		LOGGER.warn("hey dude your code is overcooked spaguetti");
		LOGGER.debug("Could Arrabiata save it?");
		LOGGER.warn("shut up you crazy monkey, just cook some more");
		
		
		
		
		int[] array = new int[i];
		int facto = 1;
	
		// TODO Auto-generated method stub
		for(int j =1; j< array.length; j++) {
			
			array[j] = j+1;
			LOGGER.info("hey this loop looks like it needs some refacto");
			
			
			
		}
		
		for(int k =1; k<array.length; k++)
		facto *= array[k];
		return facto;

}};

