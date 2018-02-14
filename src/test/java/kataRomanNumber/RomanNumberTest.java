package kataRomanNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumberTest {

	RomanNumber app = null;

	@Before
	public void before() {
		if(app==null) {
			app = new RomanNumber();
		}
	}
	
	@Test
	public void testConvert_1_I() {
		String expected = "I";
		String actual = app.convert(1);
		assertEquals(expected, actual);
	}

	@Test
	public void testConvert_2_II() {
		String expected = "II";
		String actual = app.convert(2);
		assertEquals(expected, actual);
	}

	@Test
	public void testConvert_3_III() {
		String expected = "III";
		String actual = app.convert(3);
		assertEquals(expected, actual);
	}

}
