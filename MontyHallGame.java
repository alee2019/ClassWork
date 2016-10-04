/**
 *This is the actual Monty Hall Game that interacts with the user.
 *@author Andrew Lee
 *Ms. Thuzar
 *Monty Hall Game
 *8/2/16
 * @return r Helps figure out which door to reveal next.
 */

import java.util.Scanner;
public class MontyHallGame
{
	/**
	  * This is the main method that the java interpreter calls. 
	  * @param args This is a command line argument
	  */
	public static void main(String[] args)
	{
		//welcome message
		welcome();
		game();
	}
	/**
	  * This method prints out welcoming statements for players of the game. 
	  */
	public static void welcome()
	{
		System.out.println("Monty Hall Game");
		System.out.print("Pick a door number first. ");
		System.out.print("You will have a chance to switch ");
		System.out.println("after a door has been revealed. ");	
		// print out 3 doors		
	}
	/**
	  * This method is the one that holds the majority of the game. It asks for user input,
	  *and will eventually proclaim the player to either be winner or loser. 
	  */
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		int car = (int) (Math.random() * 3 + 1);
		
		//testing
		System.out.println("car = " + car);
		
		System.out.print("Please choose a door (1, 2 or 3): ");
		int user_pick = keyboard.nextInt();
		// get rid of the newline from the buffer
		keyboard.nextLine();
		
		//testing
		System.out.println("You chose door #: " + user_pick);
		
		int reveal = doorToReveal1(car, user_pick);
		
		//testing
		System.out.println("Open door #: " + reveal);
		
		//ask the user if they want to switch
		System.out.print("Do you want to switch?: ");
		String answer = keyboard.nextLine();
		
		//testing
		System.out.println("The user wants to switch " + answer);
		
		if(answer.equals("yes"))
		{
			user_pick = doorToReveal1(user_pick, reveal);
		}
		
		if ( car == user_pick )
			System.out.println("You Win!!");
		else
			System.out.println("Sorry! You lose!!!");
	}
	/**
	  * This method figures out which door to reveal to the player for the game.
	  * This is only one of the ways to write it. The other method is below
	  *@param c This represents which door the car is in.
	  *@param u This represents which door the user picked.
	  @return i This is the door that will be revealed
	  */
	public static int doorToReveal(int c, int u)
	{
/*
		int d = 1;
		while (d == c || d == u)
		{
			d += 1;
		}
		return d;
*/
		for(int i = 1; i < 4; i++)
		{
			if (i != c && i != u)
				return i;
		}
		return -1;	
	}
	
	
/**
 *The method also figures out which door should be revealed using Math.random()
 *This is less efficient then the method above
 *@param c This represents which door the car is in.
 *@param u This represents which door the user picked.
 *@return r This is the door that will be revealed
 */
	public static int doorToReveal1(int c, int u)
	{
		int r = (int) (Math.random() * 3 + 1);
		while( r == c || r == u)
		{
			r = (int) (Math.random() * 3 + 1);
		}
		return r;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}