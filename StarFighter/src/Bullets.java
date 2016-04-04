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

public class Bullets 
{
	private ArrayList<Ammo> ammo;

	public Bullets() 
	{
		ammo = new ArrayList<Ammo>();
	}
	
	/**
	 * Purpose: Adds a bullet to the bullet list
	 * Precondition: None
	 * Postcondition: Add a bullets
	 */
	public void add(Ammo a) 
	{
		ammo.add(a);
	}

	/**
	 * Purpose: Draws the bullets
	 * Precondition: None
	 * Postcondition: Draw the bullets
	 */
	public void draw(Graphics g) 
	{
		if (ammo.size() > 0) 
		{
			for (Ammo a : ammo) 
			{
				a.draw(g);
			}
		}
	}

	/**
	 * Purpose: Animates the bullets
	 * Precondition: None
	 * Postcondition: Animate the bullets
	 */
	public void move() 
	{
		if (ammo.size() > 0) 
		{
			for (Ammo a : ammo) 
			{
				a.move("UP");
			}
		}
	}

	/**
	 * Purpose: Removes unnecessary bullets from the list
	 * Precondition: None
	 * Postcondition: Remove unnecessary bullets
	 */
	public void clean() 
	{
		if (ammo.size() > 0) 
		{
			for (int i = 0; i < ammo.size(); i++) 
			{
				if (!ammo.get(i).isAlive()) 
				{
					ammo.remove(i);
					i = 0;
				}
			}
		}
	}

	/**
	 * Purpose: Gets a specific bullet from the list
	 * Precondition: None
	 * Postcondition: Get a bullet from the list
	 */
	public Ammo getAmmo(int pos) 
	{
		return ammo.get(pos);
	}

	/**
	 * Purpose: Gets the entire list of bullets
	 * Precondition: None
	 * Postcondition: Get the bullet list
	 */
	public ArrayList<Ammo> getList() 
	{
		return ammo;
	}

	/**
	 * Purpose: Gets the size of the bullet list
	 * Precondition: None
	 * Postcondition: Get the bullet list length
	 */
	public int getSize() 
	{
		return ammo.size();
	}
	
	/**
	 * Purpose: Stops all the bullets
	 * Precondition: None
	 * Postcondition: Stop the bullets from moving
	 */
	public void end()
	{
		if (ammo.size() > 0) 
		{
			for (int i = 0; i < ammo.size(); i++) 
			{
				ammo.get(i).setSpeed(0);
			}
		}
	}
}