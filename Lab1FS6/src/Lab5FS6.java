/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			8/26/15
 * Last Update:				8/31/15
 * 
 * Project Filename:		Lab1FS6
 * Program Filename(s):		Lab1FS6.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will ask the user to input various words.
 * 				The program will then print the words and place them
 * 				into a story.	
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Ask the user to input various words
 * 		2. Print the words and form a short story
 */

public class Lab5FS6 
{
	/**	
		Purpose: Calls the methods inputFS and outputFS.
		Preconditions: MadLibFS madlib
		Postconditions: Calls the methods in class MadLib
	*/
	public static void main(String[] args) 
	{
		MadLibFS madlib = new MadLibFS();
		madlib.inputFS();
		madlib.outputFS();
	}
}
