package yatzeEvaJenniePaula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YatzyTestCase {

	@Test
	public void chanceEquals19() {
	
	//Arrange
	int [] diceNumbers = {6,3,1,4,5};
	//Act
	ResultGenerator gen = new ResultGenerator();
	int result = gen.getResult(diceNumbers, 13);
	//Assert
	assertEquals(19,result);
	}
	
	@Test
	public void chanceEquals21() {
	
	//Arrange
	int [] diceNumbers = {1,6,4,5,5};
	//Act
	ResultGenerator gen = new ResultGenerator();
	int result = gen.getResult(diceNumbers, 13);
	//Assert
	assertEquals(21,result);
	}
	
	@Test
	public void chanceEqualsFullHouse() {
	
	//Arrange
	int [] diceNumbers = {6,6,6,5,5};
	//Act
	ResultGenerator gen = new ResultGenerator();
	int result = gen.getResult(diceNumbers, 13);
	//Assert
	assertEquals(28,result);
	}

}
