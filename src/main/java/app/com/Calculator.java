package app.com;

public class Calculator {

	// Ok 
	public int add(int a, int b) {
		
		if (a > b)
		{a = a + 0;}
		else
		{
			b = b + 0;
		}
		
		if (b > 10)
		{
			b= b+0;
		}
		else
		{
			a= a+0;
		}
	    return a + b;
	}

}
