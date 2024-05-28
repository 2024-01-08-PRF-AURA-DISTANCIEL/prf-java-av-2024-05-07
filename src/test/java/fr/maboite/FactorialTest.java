package fr.maboite;

import org.junit.jupiter.api.Assertions;

public class FactorialTest {
	
	public void test0() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(1, factorial.compute(0));
	}

	public void test1() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(1, factorial.compute(1));
	}

	public void test2() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(2, factorial.compute(2));
	}

	public void test3() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(6, factorial.compute(3));
	}

	public void test4() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(24, factorial.compute(4));
	}

	public void test7() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(5040, factorial.compute(7));
	}

	public void test12() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(479_001_600, factorial.compute(12));
	}
	

}
