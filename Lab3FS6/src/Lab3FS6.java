/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Oct 1, 2015
 * Last Update:				Oct 7, 2015
 * 
 * Project Filename:		Lab3FS6
 * Program Filename(s):		Lab3FS6.java, 
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will ask the user to enter a phrase. The program
 * 				will then ask the user to choose various tasks to do with
 * 				the phrase. The program performs the task based on what
 * 				the user chooses. The program will ask the user for another
 * 				phrase until the user chooses to quit.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Ask the user to enter a phrase
 *		2. Ask the user what to do with the phrase
 *		3. Completes the user's request
 *		4. Asks the user for another phrase until the exit option is chosen.
 */

import java.util.Scanner;
import static java.lang.System.*;

public class Lab3FS6 
{
	public static int choice = 0;
	
	/**
		Purpose: Calls the methods from the worker file.
		Preconditions: StringClass strCl, Scanner scan
		Postconditions: Calls the methods from the worker file.
	*/
	public static void main(String[] args) 
	{
		StringClass strCl = new StringClass();
		Scanner scan = new Scanner(System.in);
		
		while(choice != 7)
		{
			String phrase = strCl.inputFS();
			out.println("1: Middle character(s)");
			out.println("2. Backwards");
			out.println("3. Last word");
			out.println("4. Every word on different lines");
			out.println("5. Number of vowels");
			out.println("6. Appearance of 3rd character");
			out.println("7. Exit program");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice)
			{
				case 1:
					strCl.middleLetter(phrase);
				break;
				
				case 2:
					strCl.backwardsFS(phrase);
				break;
				
				case 3:
					strCl.lastWordFS(phrase);
				break;
				
				case 4:
					strCl.everyWordFS(phrase);
				break;
				
				case 5:
					strCl.vowelsFS(phrase);
				break;
				
				case 6:
					strCl.thirdLetFS(phrase);
				break;
				
				case 7:
					choice = 7;
				break;
				
				default:
					out.println("Invalid choice.");
			}
		}
	}
}
