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

public abstract class MovingThing implements Moveable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	public MovingThing()
	{
		xPos = 0;
		yPos = 0;
		width = 10;
		height = 10;
	}

	public MovingThing(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
	}

	public MovingThing(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}

	/**
	 * Purpose: Sets the position of the moving thing
	 * Precondition: None
	 * Postcondition: Sets the x and y values
	 */
	public void setPos(int x, int y)
	{
		xPos = x;
		yPos = y;
	}

	/**
	 * Purpose: Sets the x coordinate of the moving thing
	 * Precondition: None
	 * Postcondition: Sets the x value
	 */
	public void setX(int x)
	{
		xPos = x;
	}

	/**
	 * Purpose: Sets the y coordinate of the moving thing
	 * Precondition: None
	 * Postcondition: Sets the y value
	 */
	public void setY(int y)
	{
		yPos = y;
	}

	/**
	 * Purpose: Gets the x coordinate of the moving thing
	 * Precondition: None
	 * Postcondition: Gets the x value
	 */
	public int getX()
	{
		return xPos;
	}

	/**
	 * Purpose: Gets the y coordinate of the moving thing
	 * Precondition: None
	 * Postcondition: Gets the y value
	 */
	public int getY()
	{
		return yPos;
	}

	/**
	 * Purpose: Sets the width of the moving thing
	 * Precondition: None
	 * Postcondition: Sets the width value
	 */
	public void setWidth(int w)
	{
		width = w;
	}

	/**
	 * Purpose: Sets the height of the moving thing
	 * Precondition: None
	 * Postcondition: Sets the height value
	 */
	public void setHeight(int h)
	{
		height = h;
	}

	/**
	 * Purpose: Gets the width of the moving thing
	 * Precondition: None
	 * Postcondition: Gets the width value
	 */
	public int getWidth()
	{
		return width;
	}

	/**
	 * Purpose: Gets the height of the moving thing
	 * Precondition: None
	 * Postcondition: Gets the height value
	 */
	public int getHeight()
	{
		return height;
	}

	public abstract void move(String direction);
	public abstract void draw(Graphics window);
}