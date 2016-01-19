/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Sep 22, 2015
 * Last Update:				Sep 28, 2015
 * 
 * Project Filename:		Lab2FS6
 * Program Filename(s):		Lab2FS6.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will print two strings separately, and then print
 * 				the same two strings concatenated.
 * 				
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Set the values of the strings.
 *		2. Print the first and second strings separately.
 *		3. Print the two strings concatenated.
 */

import static java.lang.System.*;

public class Lab2FS6 
{
	public static String a;
	public static String b;

	public static void main(String[] args) 
	{
		a = "hello";
		b = "world";
		out.println("first :: "+a);
		out.println("last :: "+b);
		out.println("sum :: "+a.concat(" "+b));
		out.println();
		a = "jim";
		b = "bob";
		out.println("first :: "+a);
		out.println("last :: "+b);
		out.println("sum :: "+a.concat(" "+b));
		out.println();
		a = "sally";
		b = "sue";
		out.println("first :: "+a);
		out.println("last :: "+b);
		out.println("sum :: "+a.concat(" "+b));
		out.println();
		a = "computer";
		b = "science";
		out.println("first :: "+a);
		out.println("last :: "+b);
		out.println("sum :: "+a.concat(" "+b));
		out.println();
		a = "uil";
		b = "contests";
		out.println("first :: "+a);
		out.println("last :: "+b);
		out.println("sum :: "+a.concat(" "+b));
	}
}
