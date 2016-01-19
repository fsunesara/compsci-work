/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Jan 5, 2016
 * Last Update:				Jan 7, 2016
 * 
 * Project Filename:		Lab11cFS6
 * Program Filename(s):		Lab11cFS6.java, GoldPotFS.java, RainbowFS.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will create a picture depicting a rainbow with
 * 				both ends going into gold pots. The user will choose
 * 				between 5-10 colors in the rainbow. The cloud will move 
 * 				halfway across the screen.
 * 
 * Formulas: None
 * 
 * Algorithm:
 *		1. Ask the user how many colors they want on their rainbow.
 *		2. Draw the rainbow.
 *		3. Draw the ground.
 *		4. Draw the left gold pot and gold.
 *		5. Draw the right gold pot and gold.
 *		6. Draw the animated cloud.
 *
 */

import java.awt.*;
import java.awt.event.*;

public class Lab11cFS6 extends Frame
{
	public static int num;
	public static RainbowFS rainbow = new RainbowFS();
    public Lab11cFS6()
    {
    	addWindowListener(new WindowAdapter()
    	{
    		public void windowClosing(WindowEvent e)
    		{
    			dispose();
    			System.exit(0);
    		}
    	});
    }
    
    /**
		Purpose: Creates the window and sets the background color
		Preconditions: None
		Postconditions: Creates the window and sets the background color
    */
    public static void main(String args[])
    {
    	
    	num = rainbow.numColorsFS();
    	
    	System.out.println("Starting Faisal Sunesara's Pot of Gold...");
    	Lab11cFS6 mainFrame = new Lab11cFS6();
    	mainFrame.setSize(1000,700);
    	mainFrame.setTitle("Faisal Sunesara's Pot of Gold");
    	mainFrame.setBackground(Color.cyan);
    	mainFrame.setVisible(true);
    }
    
    /**
		Purpose: Draws the rainbow, pots, gold, and grass in the window
		Preconditions: int x
		Postconditions: Draws the rainbow, pots, gold, and grass in the window
    */
    public void paint(Graphics g)
    {
    	int x = 0;
    	
    	GoldPotFS pot = new GoldPotFS();
    	
    	rainbow.archsFS(g, num);
    	
    	pot.groundSkyFS(g);
    	
    	pot.potFS(g, x);
    	pot.goldFS(g, x);
    	x = pot.numberFS(g);
    	pot.potFS(g, x);
	   	pot.goldFS(g, x);
    	
    	pot.cloudsFS(g);
    }
}
