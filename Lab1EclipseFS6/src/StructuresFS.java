

/**
 * Programmer:				Faisal Sunesara
 *  
 * Project Filename:		Lab1EclipseFS6
 * Program Filename(s):		Lab1EclipseFS6.java, StructuresFS.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import java.util.Scanner;

public class StructuresFS 
{
	/**
	 * Purpose: Prints the initials "FS".
	 * Preconditions: None
	 * Postconditions: Prints the initials.
	 */
	public void sequenceFS()
	{
		System.out.println("-------Sequence Demonstration-------");
		System.out.println("FFFFFFFF       SSSSSSS");
		System.out.println("F              S      ");
		System.out.println("F              S      ");
		System.out.println("FFFF           SSSSSSS");
		System.out.println("F                    S");
		System.out.println("F                    S");
		System.out.println("F              SSSSSSS");
	}
	/**
	 * Purpose: Demonstrates if, if/else, and switch/case concepts
	 * Preconditions: int num1
	 * Postconditions: Uses num1 to demonstrate the above concepts
	 */
	public void selectionFS(Scanner scan)
	{
		int num1 = 0;
		
		System.out.println("-------Selection Demonstration-------");
		System.out.print("Please enter an integer: ");
		num1 = scan.nextInt();
		scan.nextLine();
		System.out.println("");
		if(num1 > 6)
		{
			System.out.println("Your integer is greater than 6:");
		}
		else
		{
			System.out.println("Your integer is not greater than 6");
		}
		switch(num1)
		{
			case 6:
				System.out.println("Your integer is 6.");
			break;
			default:
				System.out.println("Your integer is not 6.");
		}
	}
	/**
	 * Purpose: Demonstrates while, do/while, for, and for/each concepts
	 * Preconditions: int num2
	 * Postconditions: Uses num2 to demonstrate the above concepts.
	 */
	public void iterationFS(Scanner scan)
	{
		int num2 = 0;
		
		System.out.println("-------Iteration Demonstration-------");
		System.out.println("Example number value: 0");
		
		int temp = num2;
		while(temp <= -10);
		{
			temp--;
			System.out.println(temp);
		}
		
		int temp2 = num2;
		do
		{
			temp2++;
			System.out.println(temp2);
		}
		while(temp2 >= 20);
		
		for(int temp3 = num2;temp3>-20;temp3--)
		{
			System.out.println(temp3);
		}
		
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		
		for(int temp4:array)
		{
			System.out.println(array[temp4-1]);
		}
	}
}
