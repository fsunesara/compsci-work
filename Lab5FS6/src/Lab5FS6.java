/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Oct 13, 2015
 * Last Update:				Oct 16, 2015
 * 
 * Project Filename:		Lab5FS6
 * Program Filename(s):		Lab5FS6.java, 
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	This project will simulate conversations between a person
 * 				and a parrot that repeats back the last thing the person
 * 				said. The person has the option to either speak or listen
 * 				Each time the person speaks, the parrot will remember the
 * 				last thing s/he said and repeat it back when the person	
 * 				listens.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Asks the user to speak or listen
 *		2. If user chooses to speak, prompt the user to enter something
 *		3. If user chooses to listen, repeats what the user last said
 *		4. Loops until the user chooses to exit.
 *
 */

import java.util.Scanner;
import static java.lang.System.*;

public class Lab5FS6 
{
	public static Scanner scan = new Scanner(System.in);
	public static Parrot polly = new Parrot();
	
	/**
		Purpose: Asks the user to enter a choice and a phrase depending
			on what the user chooses. The program then calls the 
			necessary methods to run the program. The menu will loop until
			the user chooses to exit.
		Preconditions: int choice, String speech
		Postconditions: Asks the user for the value of choice and speech.
	*/
	public static void main(String[] args)
	{
		String choice = "";
		String speech;
		
		while(choice.equals("3") == false)
		{
			out.println("Do you want to speak or listen?");
			out.println("1. Speak");
			out.println("2. Listen");
			out.println("3. Exit");
			out.print("Enter a choice: ");
			choice = scan.nextLine();
			switch(choice)
			{
				case "1":
					out.print("Enter what you want to say: ");
					speech = scan.nextLine();
					polly.listen(speech);
				break;
				
				case "2":
					out.println("The parrot says: " + polly.speak());
				break;
				
				case "3":
					out.println("Exiting...");
				break;
				
				default:
					out.println("Invalid choice");	
			}
		}
	}
}
