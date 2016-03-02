/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab20bFS6
 * Program Filename(s):		Lab20bSFS6.java, AllBooks.java, Book.java,
 * 							Math.java, Science.java, English.java,
 * 							Algebra.java, Geometry.java, Chemistry.java,
 * 							Physics.java, Literature.java
 */

public abstract class Book 
{
	private String bookTitle;
	
	public Book(String title)
	{
		bookTitle = title;
	}
	
	/**
		Purpose: Returns the book title
		Preconditions: None
		Postconditions: Returns the book title
	 */
	public String getTitle()
	{
		return bookTitle;
	}
	
	public abstract String opinion();
}
