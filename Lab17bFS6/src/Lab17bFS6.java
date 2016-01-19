/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Nov 4, 2015
 * Last Update:				Nov 4, 2015
 * 
 * Project Filename:		Lab17bFS6
 * Program Filename(s):		Lab17bFS6.java, WordPrinter.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will ask the user for a phrase and a number. The
 * 				program will then print the phrase that number of times. The
 * 				program will ask the user if they want to print another phrase.
 * 				The program will loop until the user chooses an option other
 * 				than yes.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Ask the user to enter a phrase
 *		2. Ask the user how many times to print the phrase
 *		3. Print the phrase the number of times specified
 *		4. Asks the user if they want to print again
 *		5. Repeats steps 1-4 until the user says not to print again
 */

import static java.lang.System.*;
import java.util.Scanner;

public class Lab17bFS6
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		String choice="";
		
		do
		{
			out.print("Enter the word to display: ");
			String word = scan.next();
	
			out.print("Enter the times to display: ");
 			int times = scan.nextInt();
 			scan.nextLine();
 			
 			WordPrinter.printWord(word, times);
 			
			out.print("Do you want to enter more sample input?: ");
			choice=scan.next();
		}
		while(choice.equals("Y")||choice.equals("y"));		
	}
}
