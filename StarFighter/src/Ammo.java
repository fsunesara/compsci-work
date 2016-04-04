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

import java.awt.Color;
import java.awt.Graphics;

public class Ammo extends MovingThing 
{
	private int speed;
	private boolean alive = true;

	public Ammo() 
	{
		this(5, 5, 5);
	}

	public Ammo(int x, int y) 
	{
		this(x, y, 5);
	}

	public Ammo(int x, int y, int s) 
	{
		super(x, y);
		speed = s;
	}
	/**
	 * Purpose: Sets the speed of the ammo
	 * Precondition: None
	 * Postcondition: Set the speed of the ammo
	 */
	public void setSpeed(int s) {
		speed = s;
	}

	/**
	 * Purpose: Gets the speed of the ammo
	 * Precondition: None
	 * Postcondition: Get the ammo speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Purpose: Draws the bullet
	 * Precondition: None
	 * Postcondition: Draw the bullet
	 */
	public void draw(Graphics g) 
	{
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), 10, 10);
	}

	/**
	 * Purpose: Moves the bullet across the screen
	 * Precondition: None
	 * Postcondition: Move the bullet
	 */
	public void move(String direction) 
	{
		if (direction.equals("RIGHT")) 
		{
			setX(getX() + speed);
		}
		if (direction.equals("LEFT")) 
		{
			setX(getX() - speed);
		}
		if (direction.equals("UP")) 
		{
			setY(getY() - speed);
		}
		if (direction.equals("DOWN")) 
		{
			setY(getY() + speed);
		}
	}

	/**
	 * Purpose: Checks if the bullet did collide with an alien
	 * Precondition: None
	 * Postcondition: Check if the bullet did collide
	 */
	public boolean didCollide(Alien al) 
	{
		if (getX() + 10 >= al.getX() 
			&& getX() <= al.getX() + al.getWidth()
			&& getY() - 10 >= al.getY()
			&& getY() <= al.getY() + al.getHeight()) 
		{
			kill();
			return true;
		} 
		else 
		{
			return false;
		}
	}

	/**
	 * Purpose: Checks if the bullet is at the end of the screen
	 * Precondition: None
	 * Postcondition: Check the bullet's location
	 */
	public boolean isAlive() 
	{
		if (getY() < 0) 
		{
			kill();
		}
		return alive;
	}

	/**
	 * Purpose: Removes the bullet from the screen
	 * Precondition: None
	 * Postcondition: Remove the bullet
	 */
	public void kill() 
	{
		alive = false;
	}
}