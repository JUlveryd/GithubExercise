package inlamning07v1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TranslatorTest1 {

	@Test
	void testValidMenuOp() {
		// Arrange
		String op = "";
		boolean ans = false;
		// Act
		if (op == "1" || op == "2" || op == "3") {
			ans = true;
		}
		// Assert
		assertEquals(true, ans);
	}

	@Test
	void testAReturnsDot() {
		// Arrange
		Converter1 con = new Converter1();
		// Act
		String answer = con.engToMorse("a");
		// Assert
		assertEquals(".", answer);
	}

	@Test
	void testDotReturnsA() {
		// Arrange
		Converter1 con = new Converter1();
		// Act
		String answer = con.morseToEng(".");
		// Assert
		assertEquals("a", answer);
	}

}
