/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Dec 4, 2015
 * Last Update:				Dec 14, 2015
 * 
 * Project Filename:		RecursionFunThree
 * Program Filename(s):		Recursion234Runner.java, RecursionFunThree.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will return a count of the 7s in the number unless
 * 				there are two 7s side by side.  In that case, 14 would be
 * 				added to the sum instead of 2.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Call the luckySevens method in the RecursionFunThree class and
 *			print the returned value
 *		2. Repeat for multiple cases
 */

import static java.lang.System.*;

public class Recursion234Runner 
{
	public static void main(String[] args)
	{
		out.println(RecursionFunThree.luckySevens(1087171));
		out.println(RecursionFunThree.luckySevens(1077171));
		out.println(RecursionFunThree.luckySevens(77077));
		out.println(RecursionFunThree.luckySevens(97171771707797L));
		out.println(RecursionFunThree.luckySevens(1089651234));
	}
}
