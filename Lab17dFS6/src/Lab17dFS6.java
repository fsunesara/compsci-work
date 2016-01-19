/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Nov 5, 2015
 * Last Update:				Nov 10, 2015
 * 
 * Project Filename:		Lab17dFS6
 * Program Filename(s):		Lab17dFS6.java, TriangleWords.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will take a word and print it out in the 
 * 				shape of a triangle.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Asks the user to enter a word
 *		2. Prints the word in a triangle shape.
 *		3. Loops until the user chooses to exit.
 */

import static java.lang.System.*;
import java.util.Scanner;

public class Lab17dFS6 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String choice="";
		
		do
		{
			out.print("Enter the character to display: ");
			String word = scan.next();
	
 			TriangleWords.printWordTriangle(word);
 			
			out.print("Do you want to enter more sample input?: ");
			choice=scan.next();
		}
		while(choice.equals("Y")||choice.equals("y"));			
	}
}
