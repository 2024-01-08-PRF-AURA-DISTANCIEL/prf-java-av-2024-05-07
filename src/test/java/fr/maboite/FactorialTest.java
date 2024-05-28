package fr.maboite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

	@Test
	public void test0() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(1, Factorial.compute(0));
	}

	@Test
	public void test1() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(1, Factorial.compute(1));
	}
}
