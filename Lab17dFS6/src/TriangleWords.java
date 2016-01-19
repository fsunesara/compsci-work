/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab17dFS6
 * Program Filename(s):		Lab17dFS6.java, TriangleWords.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import static java.lang.System.*;

public class TriangleWords 
{
	public static void printWordTriangle(String word)
	{
		int count = 0;
		while(count <= word.length())
		{
			for(int b = 0; b < count; b++)
			{
				out.print(word.substring(0,count));
			}
			out.println();
			count++;
		}
	}
}
