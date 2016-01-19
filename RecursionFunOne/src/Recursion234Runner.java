/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Dec 3, 2015
 * Last Update:				Dec 4, 2015
 * 
 * Project Filename:		RecursionFunOne
 * Program Filename(s):		Recursion234Runner.java, RecursionFunOne.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will take a number and recursively determine how
 * 				many of its digits are odd.  Return the count of the odd
 * 				digits in number.  
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Use recursion to determine the number of odd digits in a number
 *		2. Repeat with various test cases
 */

import static java.lang.System.*;

public class Recursion234Runner
{
	public static void main(String args[])
	{
		System.out.println(RecursionFunOne.countOddDigits(4532));
		System.out.println(RecursionFunOne.countOddDigits(1114532));
		System.out.println(RecursionFunOne.countOddDigits(2245327));
		System.out.println(RecursionFunOne.countOddDigits(2468));
		System.out.println(RecursionFunOne.countOddDigits(13579));
	}
}
