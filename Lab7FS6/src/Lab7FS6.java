/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Oct 27, 2015
 * Last Update:				Oct 28, 2015
 * 
 * Project Filename:		Lab7FS6
 * Program Filename(s):		Lab7FS6.java 
 * I/O Files used:			Lab7.txt, Lab7FS.txt
 * I/O Files changed: 		Lab7FS.txt
 *
 * Function:	The program will obtain a list of numbers by reading from a
 * 				file called Lab7.txt. The program will then make modifications
 * 				to the original list and write the changed list along with the
 * 				original list, the programmer's name, class, and period into a
 * 				file called Lab7FS.txt.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Read the values in Lab7.txt and place them into a list
 *		2. Print and write the original list to a file along with the
 *			programmer's name, class, and period to Lab7FS.txt
 *		3. Adds an 8 as the 2nd entry
 *		4. Finds the index of 22 and prints it
 *		5. Sets the 5th entry to be 61
 *		6. Finds the number of entries in the list
 *		7. Removes all instances of 4 in the list
 *		8. Prints and writes the modified list to Lab7FS.txt
 */

import static java.lang.System.*;	//import statements
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Lab7FS6 
{
	//class constructors
	public static ArrayList<Integer> numbersFS = new ArrayList<Integer>();
	public static Scanner fileIn;
	public static BufferedWriter bw;
	
	/**
		Purpose: Runs the code to complete the program
		Preconditions: None
		Postconditions: Runs the code
	*/
	public static void main(String[] args) 
	{
		try
		{
			//defines file reader and writer
			fileIn = new Scanner(new FileInputStream("Lab7.txt"));
			bw =  new BufferedWriter(new FileWriter("Lab7FS.txt"));
			
			while(fileIn.hasNext())
			{
				numbersFS.add(fileIn.nextInt());
				fileIn.nextLine();
			}
			
			//prints name, class, and period
			bw.write("Faisal Sunesara");
			bw.newLine();
			
			bw.write("CS1ap P6");
			bw.newLine();
			
			//prints and writes original list
			out.println("Original List: " + numbersFS);		
			bw.write("Original List: " + numbersFS);	
			bw.newLine();	
			
			//adds an 8 as the 2nd entry
			numbersFS.add(1, 8);	
			
			//finds index of 22
			out.println("The index of 22 in numbersFS is: "
				+ numbersFS.indexOf(22));	
			
			//sets 5th spot to 61
			numbersFS.set(4, 61);	
			
			//finds number of entries
			out.println("There ara " + numbersFS.size()
				+ " entries in the list");	
			
			//removes all 4s
			while(numbersFS.indexOf(4) != -1)
			{
				numbersFS.remove(numbersFS.indexOf(4));
			}
			
			//prints and writes new list
			out.println("Modified List: " + numbersFS);
			bw.write("Modified List: " + numbersFS);
			
			//checks if the list is empty
			out.println("Is the list empty: " + numbersFS.isEmpty());
			
			//removes everything from the list
			numbersFS.clear();
			
			//closes the file writer
			bw.close();
		}
		catch(Exception e)
		{
			out.println("Error! " + e);
		}
	}
}