/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab5FS6
 * Program Filename(s):		Lab5FS6, Parrot.java 
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import static java.lang.System.*;
public class Parrot
{
	private String lastHeard;
	
	/**
		Purpose: Returns what the parrot last heard
		Preconditions: None
		Postconditions: Returns lastHeard
	*/
	public String speak()
	{
		return lastHeard;
	}
	
	/**
		Purpose: Assigns what the user said to a private object
		Preconditions: String speech
		Postconditions: Assigns the value of speech to lastHeard
	*/
	public void listen(String speech)
	{
		lastHeard = speech;
	}
}
