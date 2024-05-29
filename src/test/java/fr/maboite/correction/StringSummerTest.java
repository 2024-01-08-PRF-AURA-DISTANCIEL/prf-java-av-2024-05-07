package fr.maboite.correction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringSummerTest {

	@Test
	public void testNull() {
		StringSummer stringSummer = new StringSummer();
		int result = stringSummer.calcule(null);
		Assertions.assertEquals(0, result);
	}

	@Test
	public void testIncorrecte() {
		StringSummer stringSummer = new StringSummer();
		int result = stringSummer.calcule("salut");
		Assertions.assertEquals(0, result);
	}

	@Test
	public void test2_coucou_3() {
		StringSummer stringSummer = new StringSummer();
		int result = stringSummer.calcule("2,coucou,3");
		Assertions.assertEquals(5, result);
	}

	@Test
	public void test5_6() {
		StringSummer stringSummer = new StringSummer();
		int result = stringSummer.calcule("5,6");
		Assertions.assertEquals(11, result);
	}

	@Test
	public void test9_5_5_40() {
		StringSummer stringSummer = new StringSummer();
		int result = stringSummer.calcule("9,5,5,40");
		Assertions.assertEquals(59, result);
	}

}
