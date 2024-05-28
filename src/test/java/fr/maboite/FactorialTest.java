package fr.maboite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testFactorial0() {
        //Arrange
        Factorial f0 = new Factorial();
        //Act
        int test0 = f0.compute(1);
        //Assets
        Assertions.assertEquals(1, test0);
    }

    @Test
    public void testFactorial1() {
        //Arrange
        Factorial f1 = new Factorial();
        //Act
        int test1 = f1.compute(2);
        //Assets
        Assertions.assertEquals(2, test1);
    }

    @Test
    public void testFactorial2() {
        //Arrange
        Factorial f2 = new Factorial();
        //Act
        int test2 = f2.compute(3);
        //Assets
        Assertions.assertEquals(6, test2);
    }

    @Test
    public void testFactorial7() {
        //Arrange
        Factorial factorial = new Factorial();
        //Act
        int test = factorial.compute(7);
        //Assert
        Assertions.assertEquals(5040, factorial.compute(7));
    }

    @Test
    public void testFactoriel12() {
        //Arrange
        Factorial factorial = new Factorial();
        //Act
        int test = factorial.compute(12);
        //Assert
        Assertions.assertEquals(479_001_600, factorial.compute(12));
    }

    @Test
    public void testFactorialZero() {
        //Arrange
        Factorial f4 = new Factorial();
        //Act
        int test4 = f4.compute(0);
        //Assets
        Assertions.assertEquals(1, test4);
    }

    @Test
    public void testFactorialNegatif() {
        //Arrange
        Factorial f5 = new Factorial();
        //Act
        int test5 = f5.compute(-1);
        //Assets
        Assertions.assertEquals(1, test5);
    }
}
