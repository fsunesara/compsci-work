/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab4FS6
 * Program Filename(s):		Lab4FS6.java, ExchangeFS.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import java.text.DecimalFormat;
import java.util.Random;

public class ExchangeFS 
{
	public static int temp;
	public static int billNum;
	public static DecimalFormat fmt = new DecimalFormat("0.00");
	
	/**
		Purpose: Generates a random number between 1 and 500
		Preconditions: int euros
		Postconditions: Gives the precond a random value
	*/
	public static int inputFS()
	{
		Random rand = new Random();
		
		int euros = rand.nextInt(501) + 1;
		return euros;
	}
	
	/**
		Purpose: Converts the euros into dollars
		Preconditions: double dollars
		Postconditions: Gives the precond a value
	*/
	public static double convertFS(int euros)
	{
		double dollars = euros * 1.304;
		System.out.println(euros+" Euros is equal to $" + fmt.format(dollars) + " or");
		return dollars;
	}
	
	/**
		Purpose: Converts the dollars into a whole number
		Preconditions: double dollars, int money
		Postconditions: Gives the preconds values
	*/
	public static int wholeNumFS(double dollars)
	{
		int money = (int)(dollars * 100);
		return money;
	}
	
	/**
		Purpose: Calculates the denominations needed
		Preconditions: int temp, int value
		Postconditions: Calculates the denominations needed
	*/
	public static int calculateFS(int money, int value)		
	{
		temp = money % value;					
		billNum = (money - temp) / value;
		money = temp;
		return money;					
	}
	
	/**
		Purpose: Prints the euros, dollars, and bills needed
		Preconditions: String denom
		Postconditions: Prints the euros, dollars, and bills needed
	*/
	public static void printFS(String denom)		//doesn't work as intended
	{
		if(billNum == 1)
		{
			if(denom.equals("Pennies") == true)
			{
				denom.replace("ies", "y");
				System.out.println(billNum + " " + denom);
			}
			else if(denom.equals("Pennies") == false)
			{
				denom.replace("s", "");
				System.out.println(billNum + " " + denom);
			}
		}
		System.out.println(billNum + " " + denom);
	}
}
