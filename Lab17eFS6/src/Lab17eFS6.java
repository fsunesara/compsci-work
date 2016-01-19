/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Nov 6, 2015
 * Last Update:				Nov 9, 2015
 * 
 * Project Filename:		Lab17eFS6
 * Program Filename(s):		Lab17eFS6.java, ArrayOfPrimes.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will write several methods to perform basic
 * 				operations on arrays.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Print the 1st 5 primes starting from 2
 *		2. Print the 1st 5 primes starting from 10
 *		3. Print the 1st 10 primes starting from 100
 */

import static java.lang.System.*;
import java.util.Arrays;


public class Lab17eFS6
{
	public static void main(String args[])
	{
	   out.println("The 1st 5 primes starting from 2 are: " +
		   Arrays.toString(ArrayOfPrimes.getPrimeList(5)));
	   out.println("The 1st 5 primes starting from 10 are: " +
			   Arrays.toString(ArrayOfPrimes.getPrimeList(5, 10)));  
	   out.println("The 1st 10 primes starting from 100 are: " +
			   Arrays.toString(ArrayOfPrimes.getPrimeList(10, 100)));
	}

}
