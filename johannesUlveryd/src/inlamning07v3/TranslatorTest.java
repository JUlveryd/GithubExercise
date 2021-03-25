package inlamning07v3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TranslatorTest {

	@Test
	void testsmallAReturnsDotDash() {
		// Arrange
		Support s = new Support();
		// Act
		String input = s.reMorse("a");
		// Assert
		assertEquals(".-", input);
	}

	@Test
	void testbigAReturnsDotDash() {
		// Arrange
		Support s = new Support();
		// Act
		String input = s.reMorse("A");
		// Assert
		assertEquals(".-", input);
	}

	@Test
	void testEReturnsDot() {
		// Arrange
		Support s = new Support();
		// Act
		String ans = s.reMorse("e");
		// Assert
		assertEquals(".", ans);
	}

	@Test
	void testDotDashReturnsA() {
		// Arrange
		Support s = new Support();
		// Act
		String ans = s.noRemorse(".-");
		// Assert
		assertEquals("A", ans);
	}

	@Test
	void test5Returns5Dots() {
		// Arrange
		Support s = new Support();
		// Act
		String ans = s.reMorse("5");
		// Assert
		assertEquals(".....", ans);
	}

	@Test
	void test5DashesReturnsZero() {
		// Arrange
		Support s = new Support();
		// Act
		String ans = s.noRemorse("-----");
		// Assert
		assertEquals("0", ans);
	}
}