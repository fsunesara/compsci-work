/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Sep 25, 2015
 * Last Update:				Sep 28, 2015
 * 
 * Project Filename:		Lab2eFS6
 * Program Filename(s):		Lab2eFS6.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will search for specific characters in 
 * 				the set string.
 * 
 * Formulas: 	None
 * 
 * Algorithim:
 *		1. Set the value of the string.
 *		2. Check for the requested characters.
 *		3. Print true or false.
 */
import static java.lang.System.*;
public class Lab2eFS6 
{
	public static String a;

	public static void main(String[] args) 
	{
		a = "chicken";
		out.println("looking for c "+a.contains("c"));
		out.println("looking for ch "+a.contains("ch"));
		out.println("looking for x "+a.contains("x"));
		out.println(a);
		out.println();
		a = "alligator";
		out.println("looking for g "+a.contains("g"));
		out.println("looking for all "+a.contains("all"));
		out.println("looking for gater "+a.contains("gater"));
		out.println(a);
		out.println();
		a = "COMPUTER SCIENCE IS THE BEST!";
		out.println("looking for U "+a.contains("c"));
		out.println("looking for COMP SCI "+a.contains("ch"));
		out.println("looking for SCIENCE "+a.contains("x"));
		out.println(a);
		out.println();
	}
}
