/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Nov 2, 2015
 * Last Update:				Nov 4, 2015
 * 
 * Project Filename:		Lab17aFS6
 * Program Filename(s):		Lab17aFS6.java, ArrayTools.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will print an array of integers. The program will
 * 				then print the sums of given section arrays and the instances
 * 				of a certain value in the array.
 * 
 * Formulas: None
 * 
 * Algorithm:
 *		1. Print the original array
 *		2. Print certain cases of the sum of certain array sections
 *		3. Print certain cases of the instance of a value in the array
 */

import static java.lang.System.*;
import java.util.Arrays;

public class Lab17aFS6 
{
	public static void main(String args[]) 
	{
		int[] theRay = {2,4,6,8,10,12,8,16,8,20,8,4,6,2,2};
		
		out.println("Original array: "+Arrays.toString(theRay)); 
		
		out.println("Sum of 0-3: "+ArrayTools.sumSection(theRay,0, 3));
		out.println("Sum of 2-7: "+ArrayTools.sumSection(theRay,2, 7));
		out.println("Sum of 1-8: "+ArrayTools.sumSection(theRay,1, 8));
		out.println("Sum of 5-9: "+ArrayTools.sumSection(theRay,5, 9));
		
		out.println("Count of 2s: "+ArrayTools.countVal(theRay, 2));
		out.println("Count of 8s: "+ArrayTools.countVal(theRay, 8));
	}
}

