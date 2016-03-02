/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab20bFS6
 * Program Filename(s):		Lab20bSFS6.java, AllBooks.java, Book.java,
 * 							Math.java, Science.java, English.java,
 * 							Algebra.java, Geometry.java, Chemistry.java,
 * 							Physics.java, Literature.java
 */

public class Math extends Book
{
	public Math(String title)
	{
		super(title);
	}
	
	/**
		Purpose: Returns the book opinion
		Preconditions: None
		Postconditions: Returns the book opinion
	 */
	public String opinion()
	{
		return "Math books are good";
	}
}
