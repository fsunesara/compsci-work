/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab1FS6
 * Program Filename(s):		Lab1FS6.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import java.util.Scanner;
public class MadLibFS 
{
	public static String[] words = new String[10];
	public static Scanner scan = new Scanner(System.in);
	
	/**	////////////////////////////////////////////////////////////////
	//	Purpose: Asks the user to input words
	//	Preconditions: String[] words
	//	Postconditions: Fills the array with words
	*/	////////////////////////////////////////////////////////////////
	public void inputFS()
	{
		System.out.print("Please enter an adjective: ");
		words[0] = scan.nextLine();
		System.out.print("\nPlease enter a noun: ");
		words[1] = scan.nextLine();
		System.out.print("\nPlease enter an adverb: ");
		words[2] = scan.nextLine();
		System.out.print("\nPlease enter a past tense verb: ");
		words[3] = scan.nextLine();
		System.out.print("\nPlease enter an adjective: ");
		words[4] = scan.nextLine();
		System.out.print("\nPlease enter an adverb: ");
		words[5] = scan.nextLine();
		System.out.print("\nPlease enter an adjective: ");
		words[6] = scan.nextLine();
		System.out.print("\nPlease enter another adjective: ");
		words[7] = scan.nextLine();
		System.out.print("\nPlease enter an adverb: ");
		words[8] = scan.nextLine();
		System.out.print("\nPlease enter a noun: ");
		words[9] = scan.nextLine();
		scan.close();
	}
	
	/**	////////////////////////////////////////////////////////////////
	//	Purpose: Prints the story with the changed words
	//	Preconditions: String[] words
	//	Postconditions: Outputs the array values
	*/	////////////////////////////////////////////////////////////////
	public void outputFS()
	{
		System.out.println("My summer was rather "+words[0]+".");
		System.out.println("I spent the first half of June playing the popular children’s MMO, Club "+words[1]+", for lack of a better activity.");
		System.out.println("I spent the rest of June watching Steven Universe and "+words[2]+"browsing low quality memes.");
		System.out.println("In July, I decided to do something with my life, and for the first time, "+words[3]+"the SAT books my parents got me.");
		System.out.println("This was a rather "+words[4]+"ordeal.");
		System.out.println("In August, my summer "+words[5]+"became interesting.");
		System.out.println("I "+words[6]+"a PS4, which was quite fun.");
		System.out.println("I "+words[7]+"the East Coast, travelling from Baltimore to Pennsylvania to New York to Washington DC and back to Baltimore.");
		System.out.println("When I returned home, I thought I "+words[8]+"had a moment to relax, but school was in 2 days.");
		System.out.println("Thus concluded my summer, as fun and interesting as a box of "+words[9]+".");
	}
}
