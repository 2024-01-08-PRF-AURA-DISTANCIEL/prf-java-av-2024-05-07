package fr.maboite.correction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialCorrectionTest {
	
	@Test
	public void test0() {
		FactorialCorrection FactorialCorrection = new FactorialCorrection();
		Assertions.assertEquals(1, FactorialCorrection.compute(0));
	}

	@Test
	public void test1() {
		FactorialCorrection FactorialCorrection = new FactorialCorrection();
		Assertions.assertEquals(1, FactorialCorrection.compute(1));
	}

	@Test
	public void test2() {
		FactorialCorrection FactorialCorrection = new FactorialCorrection();
		Assertions.assertEquals(2, FactorialCorrection.compute(2));
	}

	@Test
	public void test3() {
		FactorialCorrection FactorialCorrection = new FactorialCorrection();
		Assertions.assertEquals(6, FactorialCorrection.compute(3));
	}

	@Test
	public void test4() {
		FactorialCorrection FactorialCorrection = new FactorialCorrection();
		Assertions.assertEquals(24, FactorialCorrection.compute(4));
	}

	@Test
	public void test7() {
		FactorialCorrection FactorialCorrection = new FactorialCorrection();
		Assertions.assertEquals(5040, FactorialCorrection.compute(7));
	}

	@Test
	public void test12() {
		FactorialCorrection FactorialCorrection = new FactorialCorrection();
		Assertions.assertEquals(479_001_600, FactorialCorrection.compute(12));
	}
	

}
