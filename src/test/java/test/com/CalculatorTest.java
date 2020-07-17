package test.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.com.Calculator;

class CalculatorTest {

	@Test
	void testAddTwoPositiveNumbers() {
		// Arrange
		int a = 2;
		int b = 3;
		Calculator calculator = new Calculator();

		// Act
		int somme = calculator.add(a, b);

		// Assert
		assertEquals(5, somme);
	}
	
	
	@Test
	void Division() {
		// Arrange
		int a = 2;
		int b = 3;
		Calculator calculator = new Calculator();

		// Act
		int somme = calculator.Div(a, b);

		// Assert
		assertEquals(5, somme);
	}

}
