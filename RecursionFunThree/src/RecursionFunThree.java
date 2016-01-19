/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		RecursionFunThree
 * Program Filename(s):		Recursion234Runner.java, RecursionFunThree.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */
public class RecursionFunThree
{
	/* luckySevens will return a count of the 7s in the number
	*    unless the 7s are side by side in which case they are worth 14
	*
	* 1087171  would return 2 as there are 2 7s
	* 1077171  would return 15 as 2 7s side by side count as 14 + 1 = 15
	* 77077  would return 28 ( 14 + 14 )
	* 97171771707797 would return 32 ( 1 + 1 + 14 + 1 + 14 + 1 )
	* 1089651234 would return 0
	*
	* the solution to this problem must use recursion
	*/
	public static int luckySevens(long number)
	{
		int sum = 0;
		int length = 0;
		long temp = number;
		
		while(number > 0)
		{
			length++;
			number /= 10;
		}
		number = temp;
		long[] digits = new long[length];
		for(int a = 0; number != 0; a++)
		{
			digits[a] = number % 10;
			number /= 10;
		}
		for(int b = 0; b < digits.length - 1; b++)
		{
			if(digits[b] == 7)
			{
				if(digits[b+1] == 7)
				{
					sum += 14;
					b++;
				}
				else
				{
					sum++;
				}
			}
		
		}
		return sum;
	}
}
