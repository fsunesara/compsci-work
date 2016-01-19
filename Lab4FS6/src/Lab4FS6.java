/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Sep 29, 2015
 * Last Update:				Oct 1, 2015
 * 
 * Project Filename:		Lab4FS6
 * Program Filename(s):		Lab4FS6.java, ExchangeFS.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	This program will determine the value of coins (dollars and cents)
 * 				given a random number of Euros based on an exchange rate of 1.304. The
 * 				program will use a random number generator to pick a number between 1
 * 				and 500 (inclusive), which represents the number of Euros. The answer should
 * 				be rounded to the nearest penny. It will then convert the numbers to $100,
 * 				$50, $20, $10, $5, and $1 American bills, along with quarters, dimes, nickels,
 * 				and pennies. Then it will print the results with appropriate messages. 
 * 
 * Formulas: 	None
 * 
 * Algorithim:
 *		1. Gets a euro value
 *		2. Converts the value to dollars
 *		3. Converts the dollars to a whole number for calculations
 *		4. 
 *
 */

public class Lab4FS6 
{
	/**
		Purpose: Calls the methods from the worker file
		Preconditions: int euros, double dollars, int money
		Postconditions: Gives the preconds values
	 */
	public static void main(String[] args) 
	{
		ExchangeFS moneyConverter = new ExchangeFS();
		
		int euros = moneyConverter.inputFS();
		double dollars = moneyConverter.convertFS(euros);
		
		int money = moneyConverter.wholeNumFS(dollars);
		
		money = moneyConverter.calculateFS(money, 10000);
		moneyConverter.printFS("Hundred Dollar Bills");
		
		money = moneyConverter.calculateFS(money, 5000);
		moneyConverter.printFS("Fifty Dollar Bills");
		
		money = moneyConverter.calculateFS(money, 2000);
		moneyConverter.printFS("Twenty Dollar Bills");
		
		money = moneyConverter.calculateFS(money, 1000);
		moneyConverter.printFS("Ten Dollar Bills");
		
		money = moneyConverter.calculateFS(money, 500);
		moneyConverter.printFS("Five Dollar Bills");
		
		money = moneyConverter.calculateFS(money, 100);
		moneyConverter.printFS("One Dollar Bills");
		
		money = moneyConverter.calculateFS(money, 25);
		moneyConverter.printFS("Quarters");
		
		money = moneyConverter.calculateFS(money, 10);
		moneyConverter.printFS("Dimes");
		
		money = moneyConverter.calculateFS(money, 5);
		moneyConverter.printFS("Nickels");
		
		money = moneyConverter.calculateFS(money, 1);
		moneyConverter.printFS("Pennies");
	}
}
