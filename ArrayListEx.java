/** 
 * This doc contains multiple functions, all focused on practicing the usage of ArrayLists
 * The main two methods remove occurrences and replace certain letters with e. Description
 * will be below. 
 * @author Andrew Lee
 * 11/8/16
 */

import java.util.ArrayList;

public class ArrayListEx
{
	public static void main(String[] args)
	{
	//You have to capitalize the type of whatever you want the ArrayList to contain
	//ex. Integer. String. Double. Character
		ArrayList<Integer> a = new ArrayList<Integer>();
		//System.out.println(a.size());
		a.add(3);
		a.add(4);
		//System.out.println(a.size());
		//System.out.println(a);
		//int j = a.get(0);   this will make j = 3
		
		Integer i = new Integer(5);
		a.add(i);
		//System.out.println(a);
		i = 6;
		//the reason why the 5 isn't being changed to 6 is because the array is still referencing
		//to 5, and the 6 is at a different memory space
		//System.out.println(i);
		//System.out.println(a);
		a.add(0, -3);
		//System.out.println(a);
		a.set(a.size()-1, 6);
		//System.out.println(a);	
		
		//a.add(9, 1);  will lead to an index out of range because although the capacity
		//is 10, you can only add an index thats at most equal to a.size. This will not
		//be a compilation error, but a runtime error
		a.add(a.size(), 1);
		//System.out.println(a);
		
		a.set(0, -2);
		
		//System.out.println(a.size());
		//System.out.println(a);
		
		a.remove(0); //remove changes size and index
		
		//System.out.println(a.size());
		//System.out.println(a);
		
		
		ArrayList<Integer> o = new ArrayList<Integer>();
		o.add(2);
		o.add(2);
		o.add(0);
		o.add(-2);
		o.add(4);
		o.add(2);
		//System.out.println(o);
		occurence(o, 2);
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("eye");
		s.add("abc");
		s.add("elephant");
		//System.out.println(s);
		replace(s);
		

	}
	
	/**
	 * This is my occurence method. It prints out a modified int ArrayList, as every
	 * int n in the ArrayList a will be removed. I solve this by comparing each item within
	 * the ArrayList with n, and removing that item if it's equal to n.
	 * @param a This is the integer ArrayList that is being modified
	 * @param n This is the integer that we're looking to remove in ArrayList a
	 */
	public static void occurence(ArrayList<Integer> a, int n)
	{
		for(int index = 0; index < a.size(); index ++)
		{
			int checker = a.get(index);
			//System.out.println(checker);
			if(checker == n)
			{
				a.remove(index);
				index --;
			}
		}
		System.out.println(a);
	}
	
	/**
	 * This is my replace method. It replaces every "e" for every item within string ArrayList
	 * with an x. I do this by checking each letter within each item of the ArrayList to 
	 * see if it equals e. If so, then "x" will be added to another string known as 
	 * finalstring. I then set that finalstring to an index every time it goes through the
	 * for loop.
	 * @param a This is the string ArrayList that is having its items replaced with a 
	 * modified version
	 */ 
	public static void replace(ArrayList<String> a)
	{
		
		for(int index = 0; index < a.size(); index ++)
		{
			String finalstring = "";
			for(String checker = a.get(index); checker.length() > 0; checker=checker.substring(1))
			{
				if(checker.substring(0, 1).equals("e"))
				{
					finalstring += "x";
				}
				else
					finalstring += checker.substring(0, 1);
			}
			a.set(index, finalstring);

		}
		System.out.println(a);
	}

}