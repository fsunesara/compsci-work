/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		StarFighter
 * Program Filename(s):		StarFighter.java, Moveable.java, MovingThing.java,
 * 	 						Ship.java, Alien.java, Ammo.java, AlienHorde.java,
 * 							Bullets.java, OuterSpace.java
 * I/O Files used:			alien.png, spaceship.png
 * I/O Files changed: 		None
 */

import java.awt.Graphics;
import java.util.ArrayList;

public class AlienHorde 
{
	private ArrayList<Alien> aliens;
	private boolean right = true;
	private boolean left = false;
	private boolean down = true;
	private int score = 0;
	private int size = 0;

	public AlienHorde(int size) 
	{
		aliens = new ArrayList<Alien>(size);
		this.size = size;
	}

	/**
	 * Purpose: Adds an alien to the horde
	 * Precondition: None
	 * Postcondition: Add an alien
	 */
	public void add(Alien al) 
	{
		aliens.add(al);
	}

	/**
	 * Purpose: Draws the aliens on the screen
	 * Precondition: None
	 * Postcondition: Draw the aliens
	 */
	public void draw(Graphics window) 
	{
		if (getSize() > 0) {
			for (Alien a : aliens) {
				a.draw(window);
			}
		}
	}

	/**
	 * Purpose: Creates a horde of aliens
	 * Precondition: None
	 * Postcondition: Create a horde
	 */
	public void createHorde(int x, int y, int w, int h, int s) 
	{
		int xPos = x;
		for (int i = 0; i < size; i++) {
			aliens.add(new Alien(x, y, w, h, s));
			if (x >= 600) 
			{
				x = xPos;
				y = y + 10 + h;
			}
			else 
			{
				x = x + w + 10;
			}
		}
	}

	/**
	 * Purpose: Moves the aliens across the screen
	 * Precondition: None
	 * Postcondition: Move the aliens
	 */
	public void move() 
	{
		if (getSize() > 0) 
		{
			if (aliens.get(0).getX() <= 0) 
			{
				right = true;
				left = false;
				down = true;
			}
			else if (aliens.get(getSize() - 1).getX()
					+ aliens.get(getSize() - 1).getWidth() >= 800 - 18) 
			{
				right = false;
				left = true;
				down = true;
			}
			if (right == true) 
			{
				for (Alien a : aliens) 
				{
					a.move("RIGHT");
				}
			}
			else 
			{
				for (Alien a : aliens) 
				{
					a.move("LEFT");
				}
			}
			if (down == true) 
			{
				for (Alien a : aliens) 
				{
					a.move("DOWN");
					a.move("DOWN");
					a.move("DOWN");
					a.move("DOWN");
				}
				down = false;
			}
		}

	}

	/**
	 * Purpose: Removes the dead aliens from the screen and the list
	 * Precondition: None
	 * Postcondition: Remove the dead aliens
	 */
	public void removeDead(Bullets shots) 
	{
		if (getSize() > 0) 
		{
			for (int i = 0; i < getSize(); i++) 
			{
				if (shots.getSize() > 0) 
				{
					for (int j = 0; j < shots.getSize(); j++) 
					{
						if (shots.getAmmo(j).didCollide(aliens.get(i)))
						{
							score += 10;
							aliens.remove(i);
							i = 0;
							break;
						}
					}
				}
			}
		}
	}

	/**
	 * Purpose: Ends the game if an alien and the Ship collided
	 * Precondition: None
	 * Postcondition: Check if an alien and the Ship are touching
	 */
	public boolean endGame(Ship s) 
	{
		if (getSize() > 0) 
		{
			for (int i = 0; i < getSize(); i++) 
			{
				if (s.didCollide(aliens.get(i))) 
				{
					return true;
				}
				else if((aliens.get(getSize() - 1).getY()>=600))
				{
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Purpose: Gets the list of aliens
	 * Precondition: None
	 * Postcondition: Get the alien list
	 */
	public ArrayList<Alien> getList() 
	{
		return aliens;
	}

	/**
	 * Purpose: Gets the alien list's size
	 * Precondition: None
	 * Postcondition: Get the length of the list 
	 */
	public int getSize() 
	{
		return aliens.size();
	}

	/**
	 * Purpose: Gets the player's score
	 * Precondition: None
	 * Postcondition: Get the score
	 */
	public int getScore() 
	{
		return score;
	}

	/**
	 * Purpose: Sets the player's score
	 * Precondition: None
	 * Postcondition: Set the score
	 */
	public void setScore(int s) 
	{
		score = s;
	}
}