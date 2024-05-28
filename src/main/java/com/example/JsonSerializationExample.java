package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializationExample {
    public static void main(String[] args) {

        MyPojo myPojo = new MyPojo("John Doe", 30);
        

        ObjectMapper mapper = new ObjectMapper();
        
        try {
            String jsonString = mapper.writeValueAsString(myPojo);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
