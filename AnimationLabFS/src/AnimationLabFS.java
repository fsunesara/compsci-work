/**
 * Programmer: Faisal Sunesara
 * CS: AP					Period 06
 * Date created:			Apr 11, 2016
 * Last Update:				Apr 13, 2016
 * 
 * Project Filename:		AnimationLabFS
 * Program Filename(s):		AnimationLabFS.java, Moveable.java,
 * 							GameObject.java, Obstacle.java, Player.java,
 * 							Runner.java 
 * I/O Files used:			cardef.png, carup.png, cardown.png, obstacle.png
 * I/O Files changed: 		None
 *
 * Function:	The program should be a playable game where the user can
 * 				use keyboard input to control an original animated character
 * 				with the objective of avoiding obstacles as the character runs
 * 				past them from left to right.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Create the frame containing the game
 *		2. Draw the player and obstacles and move them across the screen
 *		3. Increase the speed of the obstacles
 *		4. Repeat steps 2 and 3 until the player collides with an obstacle
 */

import java.awt.Component;
import javax.swing.JFrame;

public class AnimationLabFS extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public AnimationLabFS()
	{
		super("my accelerator is stuck what do");
		setSize(WIDTH,HEIGHT);

		Runner theGame = new Runner();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * Purpose: Runs the game
	 * Precondition: None
	 * Postcondition: Run the game
	 */
	public static void main( String args[] )
	{
		AnimationLabFS run = new AnimationLabFS();
	}
}