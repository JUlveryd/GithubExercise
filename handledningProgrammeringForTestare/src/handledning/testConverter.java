package handledning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testConverter {

	@Test
	void testEnterEReturnDot() {
		//Arrange
		Converter con = new Converter();
		//Act
		String answer = con.converter("E");
		//Assert
		assertEquals(".", answer);
	}

}
