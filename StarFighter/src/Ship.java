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
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(0,0,0,0,0);
	}

	public Ship(int x, int y)
	{
	   this(x,y,0,0,0);
	}

	public Ship(int x, int y, int s)
	{
		this(x,y,0,0,s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		
		try
		{
			image = ImageIO.read(new File("spaceship.png"));
		}
		catch(Exception e)
		{
			System.out.println("File input error: " + e);
		}
	}
	
	/**
	 * Purpose: Sets the speed of the ship
	 * Precondition: None
	 * Postcondition: Sets the speed value
	 */
	public void setSpeed(int s)
	{
		speed=s;
	}

	/**
	 * Purpose: Gets the speed of the ship
	 * Precondition: None
	 * Postcondition: Gets the speed value
	 */
	public int getSpeed()
	{
	   return speed;
	}

	/**
	 * Purpose: Moves the ship
	 * Precondition: None
	 * Postcondition: Move the ship
	 */
	public void move(String direction)
	{	
		if(direction.equals("RIGHT"))
		{
			setX(getX() + speed);
		}
		if(direction.equals("LEFT"))
		{
			setX(getX() - speed);
		}
		if(direction.equals("UP"))
		{
			setY(getY() - speed);
		}
		if(direction.equals("DOWN"))
		{
			setY(getY() + speed);
		}
	}

	/**
	 * Purpose: Draws the ship
	 * Precondition: None
	 * Postcondition: Draw the ship
	 */
	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	
	/**
	 * Purpose: Checks if the ship collided with an alien
	 * Precondition: None
	 * Postcondition: Check if the ship collided with an alien
	 */
	public boolean didCollide(Alien al) 
	{
		if (getX() + getWidth()-30 >= al.getX() 
			&& getX() <= al.getX() + al.getWidth()-30
			&& getY() + getHeight()-30 >= al.getY()
			&& getY() <= al.getY() + al.getHeight()-30) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}