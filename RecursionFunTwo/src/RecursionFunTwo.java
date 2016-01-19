/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		RecursionFunTwo
 * Program Filename(s):		Recursion234Runner.java, RecursionFunTwo.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

public class RecursionFunTwo 
{
	public static int countChickens(String str)
	{
		int count = 0;
		int temp = 0;
		
		while(str.indexOf("chicken") != -1)
		{
			temp = str.indexOf("chicken");
			str = str.substring(0, temp) +
					str.substring(temp + 7, str.length());
			count++;
		}
		return count;
	}
}
