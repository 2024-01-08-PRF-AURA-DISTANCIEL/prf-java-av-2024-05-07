package fr.maboite;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test1 {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @Test
    public void testSuccess() {
        int expectedValue = 4;
        int computedValue = 2 + 2;
        Assertions.assertEquals(expectedValue, computedValue);
        System.out.println("Succès");
    }

    @Test
    public void testFailure() {
        int expectedValue = 5;
        int computedValue = 2 + 2;
        Assertions.assertNotEquals(expectedValue, computedValue);
        System.out.println("Échec");
    }
}