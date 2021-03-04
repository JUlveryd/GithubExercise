package inlamning07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testConverter {
	
	@Test
	void testValidMenuChoice() {
		//Arrange
		Converter con = new Converter();
		//Act
		int answer1 = con.menu(1);
		int answer2 = con.menu(2);	
		//Assert
		assertEquals(1, answer1);
		assertEquals(2, answer2);
	}

	@Test
	void testEnterEReturnDot() {
		//Arrange
		Converter con = new Converter();
		//Act
		String answer = con.engToMorse("E");
		//Assert
		assertEquals(".", answer);
	}
	
	@Test
	void testEnterDotDotReturnI() {
		//Arrange
		Converter con = new Converter();
		//Act
		String answer = con.morseToEng("..");
		//Assert
		assertEquals("I", answer);
	}
}
