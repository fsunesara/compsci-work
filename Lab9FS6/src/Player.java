/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Jan 8, 2016
 * Last Update:				[ADD]
 * 
 * Project Filename:		Lab9FS6
 * Program Filename(s):		Player.java, 
 * I/O Files used:			[ADD]
 * I/O Files changed: 		[ADD]
 *
 * Function:	[ADD]	
 * 
 * Formulas: [ADD]
 * 
 * Algorithim:
 *		1. [ADD]
 *
 */

public class Player implements Comparable<Player>
{
	private String firstName;
	private String lastName;
	private double compPercent;
	private int passNum;
	private int totalYards;
	private int touchdowns;
	private int interceptions;
	
	public Player(String newName, String last,  int pNum, int tYards)
	{
		firstName = newName;
		lastName = last;
		passNum = pNum;
		totalYards = tYards;
		
		compPercent = -1.0;
		touchdowns = -1;
		interceptions = -1;
	}
	
	public Player(String newName, String last, double percent, int pNum,
			int tYards,int tDowns, int ints)
	{
		firstName = newName;
		lastName = last;
		compPercent = percent;
		passNum = pNum;
		totalYards = tYards;
		touchdowns = tDowns;
		interceptions = ints;
	}
	
	public int compareTo(Player p) 
	{
		if(this.lastName.toUpperCase().equals(p.lastName.toUpperCase()))
		{
			return 0;
		}
		else if(this.lastName.toUpperCase().compareTo
				(p.lastName.toUpperCase()) > 0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	public String toString()
	{
		String playerStr = "";
		String name = firstName + " " + lastName;
		String temp = "";
		
		int x = 20-name.length();
		playerStr += name;
		int y = 0;
		
		while(y < x)
		{
			playerStr+=" ";
			y++;
		}
		
		playerStr += "   ";
		y = 0;
		
		if(compPercent != -1.0)
		{
			temp = compPercent+"";
			x = 5-temp.length();
			
			while(y < x)
			{
				playerStr += " ";
				y++;
			}
			
			playerStr += temp;
		}
		else
		{
			playerStr += "     ";
		}
		
		playerStr += "   ";
		y = 0;
		temp = passNum + "";
		x = 6 - temp.length();
		
		while(y < x)
		{
			playerStr += " ";
			y++;
		}
		
		playerStr += temp;
		playerStr += "   ";
		y = 0;
		temp = totalYards + "";
		x = 5 - temp.length();
		
		while(y < x)
		{
			playerStr += " ";
			y++;
		}
		
		playerStr += temp;
		playerStr += "   ";
		y = 0;
		
		if(touchdowns != -1)
		{
			temp = touchdowns + "";
			x = 10 - temp.length();
			
			while(y < x)
			{
				playerStr += " ";
				y++;
			}
			
			playerStr += temp;
		}
		else
		{
			playerStr += "          ";
		}
		
		playerStr += "   ";
		y = 0;
		
	    if(interceptions != -1)
		{
			temp = interceptions+"";
			x = 13-temp.length();
			
			while(y < x)
			{
				playerStr += " ";
				y++;
			}
			
			playerStr += temp;
		}
		else
		{
			playerStr += "          ";
		}
	    
		return playerStr;
	}
}
