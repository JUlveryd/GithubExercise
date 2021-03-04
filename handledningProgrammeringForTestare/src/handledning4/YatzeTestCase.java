package handledning4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class YatzeTestCase {

	@Test
	public void chance() {
		// Arrange
		int[] diceRolls = { 6, 3, 1, 4, 5 };
		// Act
		ResultGenerator gen = new ResultGenerator();
		int result = gen.getResult(diceRolls, 13);
		// Assert
		assertEquals(19, result);
	}
}
