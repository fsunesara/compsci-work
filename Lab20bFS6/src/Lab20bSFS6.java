/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Mar 1, 2016
 * Last Update:				Mar 1, 2016
 * 
 * Project Filename:		Lab20bFS6
 * Program Filename(s):		Lab20bSFS6.java, AllBooks.java, Book.java,
 * 							Math.java, Science.java, English.java,
 * 							Algebra.java, Geometry.java, Chemistry.java,
 * 							Physics.java, Literature.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will print out the appropriate messages for the
 * 				type of book chosen. Book is the abstract class that has 3
 * 				subclasses: Science, English, and Math. The subclasses for
 * 				Science are Chemistry and Physics, whole the subclass for
 * 				English is Literature, and the subclases for Math are Algebra
 * 				and Geometry.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Ask the user to choose a book type
 *		2. Print the opinion(s) based on the user's choice
 *		3. Repeat until the user chooses to exit
 */

import static java.lang.System.*;
import java.util.Scanner;

public class Lab20bSFS6 
{

	/**
		Purpose: Creates the menu the user will use
		Preconditions: None
		Postconditions: Creates the menu the user will use
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		AllBooks allBooks = new AllBooks();
		
		int choice = 0;
		boolean menu = true;
		
		while(menu == true)
		{
			out.println("Choose the number corresponding to the type of book:"+
						"\n");
			out.println("1. General Science\t6. General Math\n"+
						"2. Physics\t\t7. Algebra\n"+
						"3. Chemistry\t\t8. Geometry\n"+
						"4. General English\t9. All Requests\n"+
						"5. Literature\t\t10. Exit\n");
			out.print("Enter your choice: ");
			choice = scan.nextInt();
			scan.nextLine();
			out.println();
			
			switch(choice)
			{
				case(1):
				{
					allBooks.addBook(new Science("Science"));
					break;
				}
				case(2):
				{
					allBooks.addBook(new Physics("Physics"));
					break;
				}
				case(3):
				{
					allBooks.addBook(new Chemistry("Chemistry"));
					break;
				}
				case(4):
				{
					allBooks.addBook(new English("English"));
					break;
				}
				case(5):
				{
					allBooks.addBook(new Literature("Literature"));
					break;
				}
				case(6):
				{
					allBooks.addBook(new Math("Math"));
					break;
				}
				case(7):
				{
					allBooks.addBook(new Algebra("Algebra"));
					break;
				}
				case(8):
				{
					allBooks.addBook(new Geometry("Geometry"));
					break;
				}
				case(9):
				{
					allBooks.allOpinions();
					break;
				}
				case(10):
				{
					menu = false;
					out.println("Exiting...");
					break;
				}
				default:
				{
					out.println("Your choice was invalid. Please try again.");
				}
			}
		}
	}
}
