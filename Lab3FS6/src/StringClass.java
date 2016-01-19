/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab3FS6
 * Program Filename(s):		StringClass.java, 
 * I/O Files used:			[ADD]
 * I/O Files changed: 		[ADD]
 */

import java.util.Scanner;
import static java.lang.System.*;

public class StringClass 
{
	/**
		Purpose: Get phrase from the user
		Preconditions: Scanner scan, String phrase
		Postconditions: Gets the value for phrase
	*/
	public static String inputFS()
	{
		Scanner scan = new Scanner(System.in);
		
		out.print("Enter a phrase: ");
		String phrase = scan.nextLine();
		return phrase;
	}
	
	/**
		Purpose: Gets the middle letter(s) from phrase
		Preconditions: String middleStr, char middleChar
		Postconditions: Gets the value for middleStr or middleChar
	*/
	public static void middleLetter(String phrase)
	{
		String middleStr;
		char middleChar;
		
		if(phrase.length() % 2 == 0)
		{
			out.println("The middle characters are: "+
					phrase.valueOf(phrase.charAt
					((phrase.length() - 1) / 2)).concat
					(phrase.valueOf(phrase.charAt
					(phrase.length() / 2))));
		}
		else
		{
			out.println("The middle character is: " +
					phrase.charAt((phrase.length() - 1) / 2));
		}
	}
	
	/**
		Purpose: Prints phrase backwards
		Preconditions: StringBuilder rev
		Postconditions: Prints phrase backwards
	*/
	public static void backwardsFS(String phrase)
	{
		StringBuilder rev = new StringBuilder(phrase);
		out.println("The phrase in reverse is: "+rev.reverse());
	}
	
	/**
			Purpose: Prints the last word of phrase
			Preconditions: String[] lastWord
			Postconditions: Prints the last word of phrase
	*/
	public static void lastWordFS(String phrase)
	{
		String[] lastWord = phrase.split(" ");
		out.println("The last word is: "+lastWord[lastWord.length - 1]);
	}
	
	/**
			Purpose: Prints every word of phrase on a new line
			Preconditions: String[] everyWord
			Postconditions: Prints every word of phrase on a new line
	*/
	public static void everyWordFS(String phrase)
	{
		String[] everyWord = phrase.split(" ");
		for(int a = 0;a < everyWord.length;a++)
		{
			out.println("The word at spot "+a+" is: "+everyWord[a]);
		}
	}
	
	/**
			Purpose: Finds the number of vowels in phrase
			Preconditions: int vowels, char vowel
			Postconditions: Gets the value for vowels and prints it
	 */
	public static void vowelsFS(String phrase)
	{
		int vowels = 0;
		for(int b = 0;b < phrase.length();b++)
		{
			char vowel = phrase.charAt(b);
			if(vowel == 'a' || vowel == 'A' 
				|| vowel == 'e' || vowel == 'E'
				|| vowel == 'i' || vowel == 'I'
				|| vowel == 'o' || vowel == 'O'
				|| vowel == 'u' || vowel == 'U')
			{
				vowels++;
			}
		}
		out.println("The number of vowels is: " + vowels);
	}
	
	/**
			Purpose: Prints the frequency of the third character of phrase
			Preconditions: int freq, char third
			Postconditions: Calculates the value for freq and prints it
	 */
	public static void thirdLetFS(String phrase)
	{
		int freq = 0;
		if(phrase.length() >= 2)
		{
			char third = phrase.charAt(2);
			for(int c = 0;c < phrase.length();c++)
			{
				if(phrase.charAt(c) == third)
				{
					freq++;
				}
			}
			out.println("The third letter appears " + freq + " times");
		}
		else
		{
			out.println("There is no third character.");
		}
	}
}