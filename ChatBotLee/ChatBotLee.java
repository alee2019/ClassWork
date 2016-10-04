/**
*<This is a simple Chat Bot, asking questions and only being able to move forward if the user
*enters yes or no. For the last question, the user must input bye or Bye for the bot to stop.
*@Andrew Lee
*10/2/16
*/



import java.util.Scanner;

 public class ChatBotLee
{
	/**
	  * This is the main method that the java interpreter calls. Inside is the entirety of
	  * the ChatBot.
	  * @param args This is a command line argument
	  */
	public static void main(String[] args)
	{
		// create/construct a Scanner obj
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = kb.nextLine();
		//System.out.println("Hi " + name + "!. How are you doing today?");
		System.out.print("Hi " + name + "!. How are you doing today?: ");
		String input = kb.nextLine();
		System.out.println("Your answer is " + input);
		System.out.print("How old are you? ");
	
		int age = kb.nextInt();
		if(age > 30)
		{
			System.out.println(name + ", you are old!");
		}
		else
		{
			System.out.println("Nice.");
		}
		System.out.print("How tall are you: ");

		double height = kb.nextDouble();

		if (height > 6.0)
		{
			System.out.println(name + ", you are tall!");
		}
		else if (height > 5.0)
		{
			System.out.println(name + ", good height");
		}
		else
		{
			System.out.println(name + ", you are short! :P");
		}
		// will get rid of the newLine char from the previous input
		kb.nextLine();
	
		String color = "blue";
		while(!color.equals("bye") && !color.equals("Bye"))
		{
			System.out.println("What is your fav color?: " );
			color = kb.nextLine();
			if (color.equals("bye") || color.equals("Bye")) 
			{
				System.out.println("Have a good day");
			}
			else
			{
				System.out.println(color + " is your fav!");
			}
		}

		
	}
	

	
 }