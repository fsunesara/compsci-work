/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Nov 5, 2015
 * Last Update:				Nov 10, 2015
 * 
 * Project Filename:		Lab17cFS6
 * Program Filename(s):		Lab17cFS6.java, BoxPrinter.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will take a letter and a box size, pass these 
 * 				values as parameters to a method that will draw a box 
 * 				with size X size letters. 
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Asks the user to enter a letter
 *		2. Asks the user to enter a size
 *		3. Prints the letter in a box of the size requested by the user
 *		4. Loops until the player chooses to exit.
 */

import static java.lang.System.*;
import java.util.Scanner;

public class Lab17cFS6 
{
	public static void main( String args[] )
	{
		Scanner scan = new Scanner(System.in);
		String choice="";
		
		do
		{
			out.print("Enter the character to display: ");
			String letter = scan.next();
	
			out.print("Enter the size of the square: ");
 			int size = scan.nextInt();
 			scan.nextLine();
 			
 			BoxPrinter.printWordBox(letter, size);
 			
			out.print("Do you want to enter more sample input?: ");
			choice=scan.next();
		}
		while(choice.equals("Y")||choice.equals("y"));				
	}
}
