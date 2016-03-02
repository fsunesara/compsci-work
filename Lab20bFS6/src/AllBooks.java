/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab20bFS6
 * Program Filename(s):		Lab20bSFS6.java, AllBooks.java, Book.java,
 * 							Math.java, Science.java, English.java,
 * 							Algebra.java, Geometry.java, Chemistry.java,
 * 							Physics.java, Literature.java
 */

import static java.lang.System.*;
import java.util.ArrayList;

public class AllBooks 
{
	private ArrayList<Book> books = new ArrayList<Book>();
	private String opinions = "";
	
	public void addBook(Book book)
	{
		books.add(book);
		opinions += book.getTitle() + " -- " + book.opinion() + "\n";
		out.println(book.getTitle() + " -- " + book.opinion());
	}
	
	public void allOpinions()
	{
		out.println(opinions);
	}
}
