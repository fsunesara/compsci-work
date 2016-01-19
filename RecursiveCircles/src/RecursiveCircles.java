/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		RecursiveCircles
 * Program Filename(s):		GraphicsRunner.java, RecursiveCircles.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class RecursiveCircles extends JPanel
{
	public RecursiveCircles()
	{
		setSize(640,480);
		setBackground(Color.WHITE);
		setVisible(true);
	}

	/**
		Purpose: Creates the window, text, and circles
		Preconditions: None
		Postconditions: Creates the window, text, and circles
	 */
	public void paintComponent(Graphics window)
	{
		super.paintComponent(window);
		window.setColor(Color.ORANGE);
		window.setFont(new Font("TAHOMA", Font.BOLD, 12));
		
		window.drawString("Lab21a",20,40);
		window.drawString("Drawing Circles Using Recursion ", 20, 80);
		drawCircles(window, 10, 10);
	}

	/**
		Purpose: Uses recursion to draw circles
		Preconditions: None
		Postconditions: Draws the circles in a pattern
	 */
	public void drawCircles(Graphics window, int x, int y)
	{
		//base case
		window.setColor(Color.BLUE);

		int count = 0;
		
		while(count < 9)
		{
			window.drawOval(90 + x, 90 + y, 20 + x, 20 + x);
			x+=10;
			y+=10;
			count++;
		}
	}
}
