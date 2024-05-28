package fr.maboite;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
public class CalculSumTest
{
    @BeforeAll
    public static void testCaculSommeTousTest(){
        System.out.println("J'initialise tous tests");
    }

    @BeforeEach
    public void testCalculSommeChaqueTest(){
        System.out.println("J'initalise chaque test");
    }

    @AfterAll
    public static void testCalculSommeTousLesTest(){
        System.out.println("J'initalise tous les tests");
    }

    @AfterEach
    public void testCalculSommeChacunDesTest(){
        System.out.println("J'initalise chacun des tests");
    }

    @RepeatedTest(1)
    public void testCalculSommeFailure1(){
        int somme = 3 + 2 ;

        Assertions.assertEquals(2, somme);
    }
    @Test
    public void testCalculSommeFailure2(){
        int somme = 3 + 2 ;

        Assertions.assertEquals(3, somme);
    }

    @DisplayName("tester moi si vous pouvez")
    public void testCalculSommeSuccess1(){
        //Arrange
        int somme = 3 + 2 ;
        //Act
        somme = 5 ;

        //Assert
        Assertions.assertEquals(5, somme);
    }
    @Test
    public void testCalculSommeSuccess2(){
        int somme = 3 + 2 ;

        Assertions.assertEquals(5, somme);
    }

}
 **/
