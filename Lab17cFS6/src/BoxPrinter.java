/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab17cFS6
 * Program Filename(s):		Lab17cFS6.java, BoxPrinter.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import static java.lang.System.*;

public class BoxPrinter 
{
	public static void printWordBox(String letter, int size)
	{
		for(int a = 0; a < size; a++)
		{
			for(int b = 0; b < size; b++)
			{
				out.print(letter);
			}
			out.println();
		}
	}
}
