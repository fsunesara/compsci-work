/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse 4.4.1
 * CS: AP					Period 06
 * Date created:			9/8/15
 * Last Update:				9/8/15
 * 
 * Project Filename:		Lab1EclipseFS6
 * Program Filename(s):		Lab1EclipseFS6.java, StructuresFS.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function: The Lab1EclipseFS6 project demonstrates the use of sequence, selection, and iteration
 * 		structures using separate methods. The sequence method displays the initials FS in
 * 		ASCII letters that is 7 letters high. The if, if/else and switch/case selection structures
 * 		are demonstrated within the selection method. THe while, do/while. for and for/each are
 * 		demonstrated in the iteration method.
 * 
 * Formulas: None
 * 
 * Algorithm:
 *		1. Asks the user to input a value from 1 to 4
 *		2. Runs the designated method based on the value.
 *		3. Loops until the user chooses to exit.
 */

import java.util.Scanner;

public class Lab1EclipseFS6 
{
	/**
	 * Purpose: Calls the worker methods to complete the task.
	 * Preconditions: int menu
	 * Postconditions: Uses the scanned menu value
	 */
	public static void main(String[] args) 
	{
		int menu;
		Scanner scan = new Scanner(System.in);
		StructuresFS structures = new StructuresFS();
		
		do
		{
			menu = 0;
			System.out.println("What would you like demonstrated?");
			System.out.println("\t1. mSequence of code- the initials FS that is 7 lines tall");
			System.out.println("\t2. mSelection- if, if/else, switch/case choices");
			System.out.println("\t3. mIteration- while, do/while, for and for/each loops");
			System.out.println("\t4. mExit");
			System.out.print("Enter your choice: ");
			menu = scan.nextInt();
			scan.nextLine();
			System.out.println("");
			
			switch(menu)
			{
				case(1):
					structures.sequenceFS();
				break;
				case(2):
					structures.selectionFS(scan);
				break;
				case(3):
 b
				break;
				case(4):
					menu = 4;
				break;
				default:
					System.out.println("Invalid choice. ");
			}
		}	
		while(menu != 4);
	}
}
