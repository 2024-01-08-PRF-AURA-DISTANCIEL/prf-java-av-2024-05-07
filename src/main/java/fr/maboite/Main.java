package fr.maboite;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws JsonProcessingException {
//		String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
//		PojoToJSON myPojo = new PojoToJSON("salut", "ça va ?", seasons); 
//		ObjectMapper mapper = new ObjectMapper(); 
//		String jsonString = mapper.writeValueAsString(myPojo);
//		System.out.println(jsonString);
		
		Factorial factorial=new Factorial();
		try {
			factorial.compute(-12);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
//	J'ai lancé le main sans les scope test et scope compile cela fonctionne quand même parce que
//	on n'utilise pas junit et derby 
	
//	3 on été ajouté.
}
