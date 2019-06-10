package engsoft.travisintegration.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import engsoft.travisintegration.Calculator;

@DisplayName("CalculatorExample")
public class CalculatorTest {

	@Test
	void correctExample() {
		Calculator c;
		c = new Calculator();
		assertEquals(10, c.add(3, 7));
	}
	
	@Test
	void wrongExample() {
		Calculator c;
		c = new Calculator();
		assertNotEquals(11, c.add(3, 7));
	}
	
}
