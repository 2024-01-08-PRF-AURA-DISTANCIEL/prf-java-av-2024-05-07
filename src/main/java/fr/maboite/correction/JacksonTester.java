package fr.maboite.correction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {

	public static void main(String[] args) {
		MonPojo myPojo = new MonPojo();
		myPojo.setId(3);
		myPojo.setPrenom("Jean-Jacques");
		myPojo.setNom("Dupont");
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonString = mapper.writeValueAsString(myPojo);
			System.out.println("L'objet en JSON vaut : ");
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		MonRecord monRecord = new MonRecord(1, "Alcazar", "Juan");
		try {
			String jsonString2 = mapper.writeValueAsString(monRecord);
			System.out.println("L'objet en JSON vaut : ");
			System.out.println(jsonString2);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}