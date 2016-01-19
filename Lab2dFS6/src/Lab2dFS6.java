/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Sep 25, 2015
 * Last Update:				Sep 28, 2015
 * 
 * Project Filename:		Lab2dFS6
 * Program Filename(s):		Lab2dFS6.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will split a string into two strings.
 * 				The program will then print the two new strings and
 * 				the original string.
 * 
 * Formulas: 	None
 * 
 * Algorithim:
 *		1. Set the value of the string.
 *		2. Split the string into two strings.
 *		3. Print the two new strings and the original string.
 */

import static java.lang.System.*;

public class Lab2dFS6 {

	public static String a;
	public static String[] b;

	public static void main(String[] args) 
	{
		a = "Sally Baker";
		b = a.split(" ");
		out.println(b[0]);
		out.println(b[1]);
		out.println(a);
		out.println();
		a = "John Doe";
		b = a.split(" ");
		out.println(b[0]);
		out.println(b[1]);
		out.println(a);
		out.println();
		a = "Sammy Lammy";
		b = a.split(" ");
		out.println(b[0]);
		out.println(b[1]);
		out.println(a);
		out.println();
		a = "Benny Programmer";
		b = a.split(" ");
		out.println(b[0]);
		out.println(b[1]);
		out.println(a);
		out.println();
		a = "Sandy Painter";
		b = a.split(" ");
		out.println(b[0]);
		out.println(b[1]);
		out.println(a);
		out.println();
	}

}
