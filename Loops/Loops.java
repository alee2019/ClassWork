/**
*<This doc contains multiple functions. The ones specific for printing stars in a nested
*loop are the last two functions. For the last two functions, they print stars in a staircase
*either upwards or downwards.
*@author Andrew Lee
*8/2/16
*/
public class Loops
{
	/**
	  * This is the main method that the java interpreter calls.
	  * @param args This is a command line argument
	  */
	public static void main(String[] args)
	{
		//cal to whileLoop
		//whileLoop();
		
		//System.out.println("-----------------");
		
		//call to forLoop
		//forLoop();
		
		//System.out.println("-----------------");
		
		// call to nestedWhileLoop
		//nestedWhileLoop(4);
		//System.out.println("-----------------");
		//int var = 9;
		//nestedForLoop(var);
		//System.out.println("-----------------");
		
		nestedStairCaseUp(4);
		
		System.out.println("-----------------");
		
		nestedStairCaseDown(4);
		
	}
	
	
	public static void whileLoop()
	{
		int counter = 1;
		while (counter <= 10)
		{
			System.out.println(counter);
			counter++; // counter += 1;
			// counter = counter + 1;
		
		}
		
	}
	
	public static void forLoop()
	{
	// for(init ; cond ; increment)
		//int i = 1;
	// if you declare int, you dont need to initialize it. So the int i = 1 in the parentheses can be taken out
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
	}
	
	public static void nestedWhileLoop(int n)
	{
		char s = '*';
		int col = 0;
		while (col < n)
		{
			int row = 0;
			while (row < n)
			{
				System.out.print(s);
				row += 1;
			}
			System.out.println();
			col += 1;
		}
		
	}
	
	public static void nestedForLoop (int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	/**
	  * This is the method that prints out a staircase starting with one star and increasing
	  *to whatever n is
	  * @param n This is the variable that determines how many stars the last row in the staircase
	  *will finish with
	  */
	public static void nestedStairCaseUp(int n)
	{
		char s = '*';
		int row = 0;
		while (row < n)
		{
			int col = 0;
			while (col <= row)
			{
				System.out.print(s);
				col += 1;
			}
			System.out.println();
			row += 1;
		}
		
	}
	
	
	/**
	  * This is the method that prints out a staircase starting with one star and decreasing
	  *to 1 star
	  * @param n This is the variable that determines how many stars the last row in the staircase
	  *will finish with
	  */
	public static void nestedStairCaseDown(int n)
	{
		char s = '*';
		int row = n;
		while (row > 0)
		{
			int col = row;
			while (col > 0)
			{
				System.out.print(s);
				col -= 1;
			}
			System.out.println();
			row -= 1;
		}
		
	}
	
		
	
}