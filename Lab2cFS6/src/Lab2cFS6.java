/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Sep 24, 2015
 * Last Update:				Sep 28, 2015
 * 
 * Project Filename:		Lab2cFS6
 * Program Filename(s):		Lab2cFS6.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will print the requested substring of the value.	
 * 
 * Formulas: 	None
 * 
 * Algorithim:
 *		1. Print the requested substring of the value.
 */

import static java.lang.System.*;

public class Lab2cFS6 
{
	public static String[] words = {"chicken","alligator",
			"COMPUTER SCIENCE IS THE BEST!",
			"I like fried chicken and mashed potatoes!"};

	public static void main(String[] args) 
	{
		out.println(words[0].substring(3,6));
		out.println(words[0]);
		out.println();
		
		out.println(words[1].substring(3,8));
		out.println(words[1]);
		out.println();
		
		out.println(words[2].substring(9,11));
		out.println(words[2].substring(0,12));
		out.println(words[2].substring(5,19));
		out.println(words[2]);
		out.println();
		
		out.println(words[3].substring(0,6));
		out.println(words[3].substring(7,15));
		out.println(words[3].substring(15,26));
		out.println(words[3].substring(22,26));
		out.println(words[3]);
		out.println();
	}

}
