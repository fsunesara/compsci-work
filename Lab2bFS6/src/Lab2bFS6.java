/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Sep 23, 2015
 * Last Update:				Sep 28, 2015
 * 
 * Project Filename:		Lab2bFS6
 * Program Filename(s):		Lab2bFS6.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will print the string and the first and last
 * 				characters of the string.	
 * 
 * Formulas: 	None
 * 
 * Algorithim:
 *		1. Sets the value of the string.
 *		2. Prints the string and the first and last characters of the string.
 */

import static java.lang.System.*;

public class Lab2bFS6 
{
	public static String a;
	
	public static void main(String[] args) 
	{
		a = "Hello";
		out.println("word :: "+a);
		out.println("first :: "+a.charAt(0));
		out.println("last :: "+a.charAt(a.length()-1));
		out.println();
		a = "World";
		out.println("word :: "+a);
		out.println("first :: "+a.charAt(0));
		out.println("last :: "+a.charAt(a.length()-1));
		out.println();
		a = "JukeBox";
		out.println("word :: "+a);
		out.println("first :: "+a.charAt(0));
		out.println("last :: "+a.charAt(a.length()-1));
		out.println();
		a = "TCEA";
		out.println("word :: "+a);
		out.println("first :: "+a.charAt(0));
		out.println("last :: "+a.charAt(a.length()-1));
		out.println();
		a = "UIL";
		out.println("word :: "+a);
		out.println("first :: "+a.charAt(0));
		out.println("last :: "+a.charAt(a.length()-1));
		out.println();
	}
}
