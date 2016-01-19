/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab17aFS6
 * Program Filename(s):		Lab17aFS6.java, ArrayTools.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

public class ArrayTools 
{
	//instance variables and constructors could be present, but are not necessary
	
	//sumSection will return the sum of the numbers 
	//from start to stop, not including stop
	public static int sumSection(int[] numArray, int start, int stop) 
	{
		int sum=0;
		
		for(int a = start; a < stop; a++) 
		{
			sum = sum + numArray[a];
		}
		return sum;
	}
	
	//countVal will return a count of how many times val is present in numArray
	public static int countVal(int[] numArray, int val) 
	{
		int count=0;
		
		for(int b = 0; b < numArray.length; b++) 
		{
			if(numArray[b] == val)
			{
				count++;
			}
		}
		return count;
	}
}
