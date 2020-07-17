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
		int somme;
		Calculator calculator = new Calculator();

		// Act
		
			somme = calculator.add(a, b);
		
			//somme = calculator.add(b, a);
			

		// Assert hhh
		assertEquals(5, somme);
	}
	
	
	@Test
	void Division() {
		// Arra
		int a = 2;
		int b = 3;
		Calculator calculator = new Calculator();

		// Act
		int somme = calculator.Div(a, b);

		// Assert
		assertEquals(5, somme);
	}

}
