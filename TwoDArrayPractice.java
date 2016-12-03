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
		//int[][] arr = new int[3][4];
		//printArray(arr);
		
		//String[][] arr1 = new String[3][3];
		//printArray(arr1);
		
		int[][] arr3 = create2D(9);
		printArray(arr3);
		
		//System.out.println(create2D());
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
	  *This is my printArray method. It prints the array in a grid format by figuring out
	  *how many spaces are needed in between each number depending on its index. I use a
	  *helper function known as gridline so that the appropriate number of dashes is printed 
	  *@param int[][] a This is the 2d array
	  */
	public static void printArray(int[][] a)
 	{
 		for(int row = 0; row < a.length; row++) 
 		{
 			gridline(a[row].length); 
 			System.out.print("|"); 
 			
 			for(int col = 0; col < a[row].length; col++) 
 			{ 
 			//finding out the index is key to figuring out the spaces
 				int i = a.length * row + col + 1;  
 				if (i > 10)
 				{
 					System.out.print(" " + i + " |");
 				}
 				else
 				{
 					System.out.print(" " + i + "  |");
 				}
 			}
 			System.out.println();
 		}
 		gridline(a[0].length); 
 		
 	}
 	
 	public static void gridline(int n)
 	{
 		for (int dash = 0; dash < n; dash++)
 		{
 			System.out.print("-----");
 		}
 		System.out.println("");
 	}
	
	
	
}