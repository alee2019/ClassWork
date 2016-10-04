/**
* This is my Farmers Game. The point of the game is to get all of the things from one side
*to the next. However, if the human leaves the sheep and wolf alone, or the sheep and cabbage
*alone, then it's game over. For this game, false is bank 0 and true is bank 1.
* @author Andrew Lee
* 
*/
import java.util.Scanner;
public class FarmersGame
{
	//global scope
	public static boolean cabb;
	public static boolean sheep;
	public static boolean wolf;
	public static boolean human;
	/**
	  * This is the main method that the java interpreter calls.
	  * @param args This is a command line argument
	  */
	public static void main(String[] args)
	{
		welcome();
		displayGameStatus();
		game();
	}
	
	/**
	*This is the welcome method. How it works is there is no return type, as the title of the
	*game is being printed.
	*/
	public static void welcome()
	{
		System.out.println("Farmer's Game");
	}
	
	/**
	*This method displays the status of the game. It is used frequently to check which things
	*are on which bank. It does this by "flipping" each of the boolean variables between
	*true and false.
	*/
	public static void displayGameStatus()
	{
		String bank0 = "    ";
		String bank1 = "    ";
		
		if(!cabb)
			bank0 += "C   ";
		else
			bank1 += "C   ";
		if(!sheep)
			bank0 += "S   ";
		else
			bank1 += "S   ";
		if(!wolf)
			bank0 += "W   ";
		else
			bank1 += "W   ";
		if(!human)
			bank0 += "H   ";
		else
			bank1 += "H   ";
			
		System.out.println(bank0);
		System.out.println("------------------------");
		System.out.println("\n \n \n");
		System.out.println("------------------------");
		System.out.println(bank1);
	}
	/**
	 *This is the main game method. There is no return type, hence the void. Inside there is
	 *a while loop that continuously asks the user to input a variable so that they can win the game.
	 *Also, it double checks to see that the restrictions are met each time they input something.
	 *X starts off at 0, and once the person wins or loses the game will x become 1.
	 */
	public static void game()
	{
		int x = 0;
		while (x<=0)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter C, S, W, or H here (cap sensitive): ");
			String answer = keyboard.nextLine();
			if(answer.equals("C"))
			{
				if(cabb == human)
				{
					cabb = !cabb;
					human = !human;
					displayGameStatus();
				}
				else
					System.out.println("The human must be on the same side of the thing you're moving.");
			}
			if(answer.equals("S"))
			{
				if(sheep == human)
				{
					sheep = !sheep;
					human = !human;
					displayGameStatus();
				}
				else
					System.out.println("The human must be on the same side of the thing you're moving.");
			}
			if(answer.equals("W"))
			{
				if(wolf == human)
				{
					wolf = !wolf;
					human = !human;
					displayGameStatus();
				}
				else
					System.out.println("The human must be on the same side of the thing you're moving.");
			}
			if(answer.equals("H"))
			{
				human = !human;
				displayGameStatus();
			}
			if(wolf == sheep && wolf != human && wolf != cabb)
			{
				System.out.println("Sorry, you lose. The wolf ate the sheep.");
				x += 1;
			}
			if(sheep == cabb && sheep != human && sheep != wolf)
			{
				System.out.println("Sorry, you lose. The sheep ate the cabbage.");
				x += 1;
			}
			if(wolf == true && human == true && sheep == true && cabb == true)
			{
				System.out.println("CONGRATS. YOU WIN!!!");
				x += 1;
			}
		}
	}
}
