package fr.maboite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

	@Test
	public void test0() {
		Assertions.assertEquals(1, Factor.compute(0));
	}

	@Test
	public void test1() {
		Assertions.assertEquals(1, Factor.compute(1));
	}
}
