/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab11cFS6
 * Program Filename(s):		Lab11cFS6.java, GoldPotFS.java, RainbowFS.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import java.awt.*;
import java.util.Random;

public class GoldPotFS
{
	public static Random rand = new Random();
	
    /**
		Purpose: Draws the ground
		Preconditions: None
		Postconditions: Fills a green rectangle
    */
	public void groundSkyFS(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(0,600,1280,100);
	}
	
    /**
		Purpose: Draws the animated cloud
		Preconditions: None
		Postconditions: Repeatedly fills multiple ovals in different locations
    */
	public void cloudsFS(Graphics g)
	{
		for(int a = 0; a<=450; a++)
		{
			g.setColor(Color.white);
			
			g.fillOval(0 + a, 120, 30, 30);
			g.fillOval(20 + a, 120, 30, 30);
			g.fillOval(40 + a, 120, 30, 30);
			g.fillOval(60 + a, 120, 30, 30);
			g.fillOval(30 + a, 100, 30, 30);
			g.fillOval(15 + a, 100, 30, 30);
			g.fillOval(45 + a, 100, 30, 30);
			
			try
	    	{
	        	Thread.sleep(5);
	    	} 
	    	catch (Exception e)
	    	{
	            System.out.println("Error finding sleep method. " + e);
	    	}
			
			if(a != 450)
			{
				g.setColor(Color.cyan);
				g.fillRect(0, 0, 900, 250);
			}
		}	
	}
	
    /**
		Purpose: Draws the pots
		Preconditions: None
		Postconditions: Fills two ovals for each pot
    */
	public void potFS(Graphics g, int potX)
	{
		g.setColor(Color.black);
		g.fillOval(150 + potX, 550, 100, 100);
		g.fillOval(150 + potX, 540, 100, 20);
	}
	
    /**
		Purpose: Gets the x value for the second pot
		Preconditions: None
		Postconditions: Returns a modifier for the pot's x origin
    */
	public int numberFS(Graphics g)
	{
		return 550;
	}
	
    /**
		Purpose: Draws the gold coins
		Preconditions: None
		Postconditions: Fills multiple gold ovals
    */
	public void goldFS(Graphics g, int potX)
	{
		int coinNum = (int) Math.floor((Math.random() * 10) + 40);
		int coinX;
		int coinY;
		
		for(; coinNum >= 0; coinNum--)
		{
			coinX = (int) (Math.random() * 50) + 180;
			coinY = (int) (Math.random() * 10) + 530;
			
			g.setColor(new Color(212, 175, 55));
			g.fillOval(coinX + potX, coinY, 7, 7);
		}
	}
}