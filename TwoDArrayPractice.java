/**
  *This is my TwoDArrayPractice classwork. I've modified it so that I create a 2d array
  *as instructed in class, and it's printed in a grid format.
  *@author Andrew Lee
  *11/30/16
  */
public class TwoDArrayPractice
{
	public static void main(String[] args)
	{
		int[][] arr = new int[3][4];
		printArray(arr);
		
		//String[][] arr1 = new String[3][3];
		//printArray(arr1);
		
		int[][] arr3 = create2D(10);
		printArray(arr3);
		
		//System.out.println(create2D());
	}
	/**
	  *This is my printArray method. It prints the array in a grid format by figuring out
	  *how many spaces are needed in between each number by using a numDigit helper function.
	  *@param int[][] a This is the 2d array
	  */
	public static void printArray(int[][] a)
	{
		int maxN = a.length * a.length;
		for(int row = 0; row < a.length; row ++)
		{
			for(int col = 0; col < a[row].length; col ++)
			{
				System.out.print(a[row][col] + " ");
				int x = a[row][col];
				int s = numDigits(x);
				for(int num = x; s < numDigits(maxN); s ++) 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	/**
	public static void printArray(String[][] a)
	{
		int maxN = a.length * a.length;
		int space = numDigits(maxN)-1;
		for(int row = 0; row < a.length; row ++)
		{
			for(int col = 0; col < a[row].length; col ++)
			{
				System.out.print(a[row][col]);
				for(int same = 0; same < space; same ++) 
					System.out.print(" ");
			}
			System.out.println();
		}
	 
	}
	*/
	
	/**
	  *This is the method that creates a 2d array
	  *@param n This is the dimension number (as in the array should be n x n)
	  *@return arr This is the finished 2d array
	  */
	public static int[][] create2D(int n)
	{
		int[][] arr = new int[n][n];
		int num = 1;
		for(int row = 0; row < arr.length; row ++)
		{
			for(int col = 0; col < arr[row].length; col ++)
			{
				arr[row][col] = num;
				//System.out.print(arr2 + " ");
				num ++;
			}
			//System.out.println();
		}
		return arr;
	}
	/**
	  *This method figures out the number of digits in a given number
	  *@param n This is the int that has a certain number of digits that we are trying to 
	  *find
	  *@return counter This is the number of digits in the number (plus one)
	  */
	  
	public static int numDigits(int n)
	{
		int counter = 0;
		while(n >= 10)
		{
			counter++;
			n= n/10;
		} 
		return counter+1;
	}
	
	
	
	
}