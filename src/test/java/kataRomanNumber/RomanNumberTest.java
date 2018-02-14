package kataRomanNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumberTest {

	RomanNumber app = null;
	private String expected;
	private String actual;

	@Before
	public void before() {
		if(app==null) {
			app = new RomanNumber();
		}
	}
	
	@Test
	public void testConvert_1to3_ItoIII() {
		// testConvert_1_I
		expected = "I";
		actual = app.convert(1);
		assertEquals(expected, actual);
		// testConvert_2_II
		expected = "II";
		actual = app.convert(2);
		assertEquals(expected, actual);
		// testConvert_3_III
		expected = "III";
		actual = app.convert(3);
		assertEquals(expected, actual);
	}

	@Test
	public void testConvert_4_IV() {
		expected = "IV";
		actual = app.convert(4);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvert_5_V() {
		expected = "V";
		actual = app.convert(5);
		assertEquals(expected, actual);
	}

	@Test
	public void testConvert_6to8_VItoVIII() {
		expected = "VI";
		actual = app.convert(6);
		assertEquals(expected, actual);
		expected = "VII";
		actual = app.convert(7);
		assertEquals(expected, actual);
		expected = "VIII";
		actual = app.convert(8);
		assertEquals(expected, actual);
	}

	@Test
	public void testConvert_9_IX() {
		expected = "IX";
		actual = app.convert(9);
		assertEquals(expected, actual);
	}

	@Test
	public void testConvert_10_X() {
		expected = "X";
		actual = app.convert(10);
		assertEquals(expected, actual);
	}

}
