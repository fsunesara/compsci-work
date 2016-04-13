/**
 * Programmer: Faisal Sunesara
 * 
 * Project Filename:		AnimationLabFS
 * Program Filename(s):		AnimationLabFS.java, Moveable.java,
 * 							GameObject.java, Obstacle.java, Player.java,
 * 							Runner.java 
 * I/O Files used:			cardef.png, carup.png, cardown.png, obstacle.png
 * I/O Files changed: 		None
 */

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject implements Moveable
{
	private int xPos;
	private int yPos;
	private Rectangle rect;

	public GameObject()
	{
		xPos = 0;
		yPos = 0;
		rect = new Rectangle();
	}
	
	public GameObject(int x, int y)
	{
		xPos = x;
		yPos = y;
		rect = new Rectangle(x, y, 80, 80);
	}
	
	/**
	 * Purpose: Sets the position of the object
	 * Precondition: None
	 * Postcondition: Sets the x and y values
	 */
	public void setPos(int x, int y)
	{
		xPos = x;
		yPos = y;
		rect.setLocation(x, y);
	}

	/**
	 * Purpose: Sets the x coordinate of the object
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
	 * Purpose: Gets the rectangle surrounding the game object
	 * Preconditions: None
	 * Postconditions: Gets the rectangle
	 */
	public Rectangle getRect()
	{
		return rect;
	}
	
	/**
	 * Purpose: Moves the object
	 * Precondition: None
	 * Postcondition: Move the object
	 */
	public void move(String direction)
	{
		if(direction.equals("LEFT"))
		{
			setX(getX()-getSpeed());
			rect.setLocation(getX() - getSpeed(), yPos);
        }
        else if(direction.equals("RIGHT"))
        {
            setX(getX()+getSpeed());
			rect.setLocation(getX() + getSpeed(), yPos);
        }
        else if(direction.equals("UP"))
        {
            setY(getY()-getSpeed());
			rect.setLocation(xPos, getY() - getSpeed());
        }
        else if(direction.equals("DOWN"))
        {
        	setY(getY()+getSpeed());
			rect.setLocation(xPos, getY() + getSpeed());
        }
	}
	
	public abstract void draw(Graphics window);
	public abstract void setSpeed(int s);
	public abstract int getSpeed();
}
