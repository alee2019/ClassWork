/**
 *This is a simulation to the famous Monty Hall Problem.
 *Andrew Lee
 *Ms. Thuzar
 *Monty Hall Simulation
 *8/2/16
 * @return int return 1 if switch win, otherwise 0
 */
 
 public class MontyHallSimulation
 {
/**
 *game() is a method. main(String[] args) is the main method that is calling game(). 
 *the java interpreter is calling the main method.
 *[] = array
 *The System.out.println(args[0]); allows for the user to input something
 *@param args This is a command line argument
 */
 	public static void main(String[] args)
 	{
 		//System.out.println(args[0]);
 		//System.out.println(args[1]);
 		String input = args[0];
 		int numSim = Integer.parseInt(input); //Type casts a string with integers in it into an int
 		System.out.println(numSim);
 		
 		int switchWin = 0;
 		
 		for(int i = 0; i < numSim; i++)
 			switchWin += game();
 		double percentSwitchWin = format( (double) switchWin/numSim * 100);
 		double percentStayWin = format(100 - percentSwitchWin);
 		
 		System.out.println("% switch_win: " + percentSwitchWin);
 		System.out.println("% stay win: " + percentStayWin);
 	}
 	
 	/**
 	 * This method takes in a double and truncates it 2 decimal places
 	 * @param d the double input to be truncated
 	 * @return double formatted to 2 decimal places
 	 */
 	 public static double format(double d)
 	 {
 	 	int temp = (int) (d * 100);
 	 	return temp / 100.0; // if you decide by a double, the answer will be a double. The answer won't be truncated.
 	 }
 	/**
 	 * This method randomizes two variables b/w 1-3 (car and userPick) to help figure the 
 	 *percent of winning when one switches vs staying
 	 * @return either 0 or 1
 	 */
 	public static int game()
 	{
 		int car = (int) (Math.random() * 3 + 1);
 		int userPick = (int) (Math.random() * 3 + 1);
 		if (car == userPick)
 			return 0;
 		else
 			return 1;
 	}
 }