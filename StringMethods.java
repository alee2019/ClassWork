/**
*This doc contains multiple functions. They find, count and italicize strings.
*@author Andrew Lee
*11/4/16
*/
public class StringMethods
{
	/**
	  * This is the main method that the java interpreter calls. 
	  * @param args This is a command line argument
	  */
	public static void main(String args[])
	{
	System.out.println(findString("he_o", "_", 0 ));
	System.out.println(findString("abcabcdabc", "abc", 2 ));
	System.out.println(findString("abcd", "ef", 1 ));
	System.out.println(countStrings("abcf", "abc"));
	System.out.println(countStrings("abcf", "e"));
	System.out.println(countStrings("abcf", "f"));
	System.out.println(convertItalics("This is _very_ good."));
	System.out.println(convertItalics("I ___ am_a robot."));
	}
	 
	 /**
 	  * Finds the first instance of s in line,
      * starting at the position start
      * @param o the orignal string 
      * @param s the string to find 
      * @param start the position to start searching.
      * Guaranteed to be in the string line. (precondition)
      * @return the index of the first single instance of
      * s if the string is found OR -1 if it is not found.
      */
	public static int findString(String o, String s, int start)
	{
		String k = o.substring(0, start);
		int index = k.length();
		String j = o.substring(start);
		int f = j.indexOf(s);
		if(f == -1)
			return f;
		else
		{
			int findex = f + index;
			return findex;
		}
	}
	/**
	 * Count the number of times instances of s appear in
	 * the line.
	 * @param o the original string
 	 * @param s the string to find.
 	 * @return the number of times the string appears in the line
 	 */
	public static int countStrings(String o, String s)
	{
		int counter = 0;
		for(int number = 0; number < o.length(); number ++)
		{

			if(findString(o, s, number) > -1)
			{
				counter ++;
				number = findString(o, s, number);
			}
			else
				return counter;
		}
		return counter;
	}
	/**
 	 * Replace all instances of underscores in the line given by
 	 * line with italics tags.  There must be an even number of underscores
	 * in the line, and they will be replaced by <I>, </I>, alternating.
	 * @param line a string with 0 or more underscores
	 * @return the line that has underscores replaced with <I> </I> tags or 
	 * the original line if there are not an even number of underscores.
	 */
	public static String convertItalics(String line)
	{
		int pos = 0;
		int occurence = countStrings(line, "_");
		if(occurence % 2 != 0)
			return line;
		else
		{
			int toggle = 0;
			while(occurence > 0)
			{
				int c = findString(line, "_", pos);
				String cx = line.substring(c, c+1);
				String dx = line.substring(c+1, c+2);
				if(cx.equals(dx))
				{
					pos = c+2;
					occurence -= 2;
				}
				else
				{
					if(toggle % 2 == 0)
						line = line.substring(0, c) + "<I>" + line.substring(c + 1);
					else
						line = line.substring(0, c) + "</I>" + line.substring(c + 1);
					pos = c + 1;
					toggle ++;
					occurence -= 1;
				}
			}
			return line;
		}
	}
		
					 


}