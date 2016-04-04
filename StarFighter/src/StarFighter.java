/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Mar 28, 2016
 * Last Update:				Mar 31, 2016
 * 
 * Project Filename:		StarFighter
 * Program Filename(s):		StarFighter.java, Moveable.java, MovingThing.java,
 * 	 						Ship.java, Alien.java, Ammo.java, AlienHorde.java,
 * 							Bullets.java, OuterSpace.java
 * I/O Files used:			alien.png, spaceship.png
 * I/O Files changed: 		None
 *
 * Function:	The program will create a game in which the player must shoot
 * 				aliens. The game become more difficult as the player
 * 				progresses through the game, and if an alien touches the
 * 				player's ship, the player loses.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Load the window with the aliens, the ship, and the round counter.
 *		2. Run the game as normal and increase the speed of the aliens as
 *			the game progresses.
 *		3. End the game when an alien touches the player's ship.
 */

import javax.swing.JFrame;
import java.awt.Component;

public class StarFighter extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public StarFighter()
	{
		super("STARFIGHTER");
		setSize(WIDTH,HEIGHT);

		OuterSpace theGame = new OuterSpace();
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
	{;
		StarFighter run = new StarFighter();
	}
}