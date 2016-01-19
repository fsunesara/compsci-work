/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Dec 3, 2015
 * Last Update:				Dec 14, 2015
 * 
 * Project Filename:		RecursiveCircles
 * Program Filename(s):		GraphicsRunner.java, RecursiveCircles.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will use recursion to draw a series of circles on the screen.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Create multiple circles in various sizes
 */

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new RecursiveCircles());
				
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}