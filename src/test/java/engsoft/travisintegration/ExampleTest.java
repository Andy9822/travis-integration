package engsoft.travisintegration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CalculatorExample")
public class ExampleTest {

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
