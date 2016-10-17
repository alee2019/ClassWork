/**
*This file contains multiple functions. One of the functions check to see if there is a 
*digit in the given string. All of the other functions are different ways to test whether
*the parameter is a palindrome or not.
*@author Andrew Lee
*10/18/16
*/
public class ExerciseWork
{
	/**
	  * This is the main method that the java interpreter calls. 
	  * @param args This is a command line argument
	  */
	public static void main(String[] args)
	{
		System.out.println(hasDigit("abc"));
		System.out.println(hasDigit("abc1"));
		System.out.println(isPalindrome("mom"));
		System.out.println(isPalindrome("o"));
		System.out.println(isPalindrome("jk"));
		System.out.println(isPalindromeR("mom"));
		System.out.println(isPalindromeR("o"));
		System.out.println(isPalindromeR("jk"));
		System.out.println(isPalindromeAPI("racecar"));
		System.out.println(isPalindromeAPI("o"));
		System.out.println(isPalindromeAPI("jk"));
		System.out.println(isPalindromeAPR("racecar"));
		System.out.println(isPalindromeAPR("o"));
		System.out.println(isPalindromeAPR("jk"));
	}
/**
	 *This method takes in a string and returns true if the given string has a digit,
	 *false otherwise
	 *@ param s the given string to check whether it has a digit
	 *@ return boolean true if it has a digit, false otherwise
	 */
	public static boolean hasDigit(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			if((s.charAt(i) >= 48) && (s.charAt(i) <= 57))
				return true;
		}
		return false;
				
	}
	
	/**
	 *This method takes in a String and returns true if the given String is a palindrome.
	 *This is the iterative version using charAt(). 
	 *@param s the String to check whether it is a palindrome
	 *@return boolean true if palindrome, false otherwise
	 */
	public static boolean isPalindrome(String s)
	{
		while(s.length() > 1)
		{
			int l = s.length() - 1;
			
			if(s.charAt(0) == s.charAt(l))
			{
				s = s.substring(1, l);
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	/**
	 *This method takes in a String and returns true if the given String is a palindrome.
	 *This is the recursive version using charAt(). 
	 *@param s the String to check whether it is a palindrome
	 *@return boolean true if palindrome, false otherwise
	 */
	public static boolean isPalindromeR(String s)
	{
		int l = s.length() - 1;
		if(s.length() <= 1)
			return true;
		if(s.charAt(0) == s.charAt(l))
			return isPalindromeR(s.substring(1, l));
		else
			return false;
		 
	
	}		
	/**
	 *This method takes in a String and returns true if the given String is a palindrome.
	 *This is the iterative version using the AP subset. 
	 *@param s the String to check whether it is a palindrome
	 *@return boolean true if palindrome, false otherwise
	 */
	public static boolean isPalindromeAPI(String s)
	{
		while(s.length() > 1)
		{
			int l = s.length() - 1;
			if(s.substring(0, 1).equals(s.substring(l)))
			{
				s = s.substring(1, l);
			}
			else
			{
				return false;
			}
		}
		return true;
	
	
	}
	/**
	 *This method takes in a String and returns true if the given String is a palindrome.
	 *This is the recursive version using the AP subset. 
	 *@param s the String to check whether it is a palindrome
	 *@return boolean true if palindrome, false otherwise
	 */
	public static boolean isPalindromeAPR(String s)
	{
		int l = s.length() - 1;
		if(s.length() <= 1)
			return true;
		if(s.substring(0, 1).equals(s.substring(l)))
			return isPalindromeR(s.substring(1, l));
		else
			return false;
		 
	
	}		
	
	//iteratively and recursively with CharAt
	//iteratively and recursively with without charAt only using the AP Subset
	
	
}