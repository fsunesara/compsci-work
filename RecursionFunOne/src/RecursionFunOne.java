/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		RecursionFunOne
 * Program Filename(s):		Recursion234Runner.java, RecursionFunOne.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import static java.lang.System.*;

public class RecursionFunOne
{
	/**
			Purpose: Gets the number of odd digits in an integer
			Preconditions: int digits, int current
			Postconditions: Returns digits
	 */
	public static int countOddDigits(int num)
	{
		int digits = 0;
		int current = 0;
		
		while (num > 0) 
		{
		    current = num % 10;
		    num = num / 10;
		    if(current % 2 == 1)
		    {
		    	digits++;
		    }
		}
		return digits;
	}
}
