/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab11cFS6
 * Program Filename(s):		Lab11cFS6.java, GoldPotFS.java, RainbowFS.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import java.awt.*;
import java.util.Scanner;

public class RainbowFS
{
	/**
			Purpose: Gets the number of colors the user wants on their rainbow
			Preconditions: int num
			Postconditions: Returns num
	 */
	public int numColorsFS()
	{
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("How many colors (from 5-10) would you like"
			+ " in your rainbow?");
		num = scan.nextInt();
		scan.nextLine();
		
		while(num < 5 || num > 10)
		{
			System.out.println("Sorry the value you entered was not" +
				" in the 5-10 range, please enter another value");
			num = scan.nextInt();
		}
		
		return num;
	}
	
	/**
			Purpose: Draws the arches of the rainbow
			Preconditions: None
			Postconditions: Fills multiple arcs of various colors
	 */
	public void archsFS(Graphics g, int num)
	{
		Color[] colors = {Color.red, Color.orange, Color.yellow, Color.blue,
				Color.green, Color.magenta, Color.pink, Color.lightGray,
				Color.darkGray, Color.black};
		
		int x = 125;
		int y = 340;
		int arcLength = 700;
		int arcHeight = 700;
		
		for(int a = 0; a < num; a++)
		{
			g.setColor(colors[a]);
			g.fillArc(x, y, arcLength, arcHeight, 0, 180);
			x+=10;
			y+=10;
			arcLength-=20;
			arcHeight-=20;
		}
		
		g.setColor(Color.cyan);
		g.fillArc(x, y, arcLength, arcHeight, 0, 180);
	}
}
