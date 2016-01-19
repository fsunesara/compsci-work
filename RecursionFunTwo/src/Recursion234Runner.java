/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Dec 4, 2015
 * Last Update:				Dec 4, 2015
 * 
 * Project Filename:		RecursionFunTwo
 * Program Filename(s):		Recursion234Runner.java, RecursionFunTwo.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will take a string and remove all occurrences of
 * 				the word chicken and count how many chickens were removed.   
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Use recursion to remove every instance of "chicken" from a String
 *		2. Repeat with various test cases
 */

import static java.lang.System.*;

public class Recursion234Runner
{
	public static void main(String args[])
	{
		out.println(RecursionFunTwo.countChickens("itatfun"));
		out.println(RecursionFunTwo.countChickens("itatchickenfun"));
		out.println(RecursionFunTwo.countChickens("chchickchickenenicken"));
		out.println(RecursionFunTwo.countChickens("chickchickfun"));
		out.println(RecursionFunTwo.countChickens("chickenbouncetheballchicken"));
	}
}
