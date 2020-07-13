package app.com;

public class Calculator {

	// Ok toujours
	public int add(int a, int b) {
		
		if (a > b)
		{a = a + 0;}
		else
		{
			b = b + 0;
		}
	    return a + b;
	}

}
