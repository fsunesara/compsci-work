/**
* Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Jan 8, 2016
 * Last Update:				Jan 11, 2016
 * 
 * Project Filename:		Lab9FS6
 * Program Filename(s):		Lab9FS6.java, Player.java 
 * I/O Files used:			FballStats.txt, FootBallStats.txt, Lab9.txt
 * I/O Files changed: 		Lab9.txt
 *
 * Function:	The program will merge two sets of stats from quarterbacks.
 * 				Each set of data is stored in its own data file. The program
 * 				will input the data from both files, remove any duplicates,
 * 				store it in an ArrayList, sort it by last name, and output it
 * 				to a file in a row column.
 * 
 * Formulas: [ADD]
 * 
 * Algorithim:
 *		1. [ADD]
 *
 */

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

public class Lab9FS6
{	
	/**
		Purpose: Runs the program
		Preconditions: None
		Postconditions: Runs the program
	*/
	public static void main(String[] args)
	{
		ArrayList<Player> players = new ArrayList<Player>();
		try
		{
			String[] playerStats;
			String stats;
			
			
			
			String[] fullName;
			double completions;
			int passes;
			int yards;
			int touchdowns;
			int interceptions;
			
			Scanner fball = new Scanner(new File("FballStats.txt"));
			
			while(fball.hasNextLine())
			{
				stats = fball.nextLine();
				playerStats = stats.split(",");
				
				fullName = playerStats[0].split(" ");
				completions = Double.parseDouble(playerStats[1]);
				passes = Integer.parseInt(playerStats[2]);
				yards = Integer.parseInt(playerStats[3]);
				touchdowns = Integer.parseInt(playerStats[4]);
				interceptions = Integer.parseInt(playerStats[5]);
				
				if(fullName.length == 3)
				{
					players.add(new Player(fullName[0], fullName[2], completions, passes, yards,
						touchdowns, interceptions));
				}
				
				else
				{
					players.add(new Player(fullName[0], fullName[1], completions, passes, yards,
							touchdowns, interceptions));
				}
				
				
			}
			
			Scanner football = new Scanner(new File("FootBallStats.txt"));
			
			while(football.hasNextLine())
			{
				fullName = football.nextLine().split(" ");
			
				passes = football.nextInt();
				football.nextLine();
				
				yards = football.nextInt();
				football.nextLine();
				
				if(fullName.length == 3)
				{
					players.add(new Player(fullName[0], fullName[3], passes, yards));
				}
				else
				{
					players.add(new Player(fullName[0], fullName[1], passes, yards));
				}
			}
		}
		catch(Exception e)
		{
			out.println("Input Error: " + e);
		}
		
		Collections.sort(players);
			
		sort:
		{
			for(int a = 0; a < players.size(); a++)
			{
				 if(a + 1 == players.size())
				 {
					 break sort;
				 }
				 
				 if(players.get(a).compareTo(players.get(a + 1)) == 0)
				 {
					 players.remove(a + 1);
					 a--;
				 }
			}
		}
		
		write(players);
	}
	
	/**
			Purpose: Writes the data to the file
			Preconditions: None
			Postconditions: Wrote the header and data to the file
	 */
	public static void write(ArrayList<Player> players)
	{
		try
		{
			BufferedWriter bw = new BufferedWriter
					(new FileWriter("Lab9.txt"));
			bw.write("Name:                  Com %   Passes   Yards   "+
					"Touchdowns   Interceptions");
			bw.newLine();
			bw.write("=================      =====   ======   =====   "+
					"==========   =============");
			bw.newLine();
			for(int a = 1; a < players.size(); a++)
			{
				bw.write(players.get(a).toString());
				bw.newLine();
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println("Output Error " + e);
		}
	}
}
