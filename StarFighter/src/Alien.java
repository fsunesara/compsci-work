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

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,0,0,0);
	}

	public Alien(int x, int y)
	{
		this(x,y,0,0,0);
	}

	public Alien(int x, int y, int s)
	{
		this(x, y, 0, 0, s / 2);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed = s / 2;
		
		try
		{
			image = ImageIO.read(new File("alien.png"));
		}
		catch(Exception e)
		{
			System.out.println("File input error: " + e);
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	/**
	 * Purpose: Gets the ship's speed
	 * Precondition: None
	 * Postcondition: Get the speed
	 */
	public int getSpeed()
	{
	   return speed;
	}

	/**
	 * Purpose: Moves the ship across the screen
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
		if(direction.equals("DOWN"))
		{
			setY(getY() + speed);
		}
	}
	/**
	 * Purpose: Draws the ship on the screen
	 * Precondition: None
	 * Postcondition: Draw the ship
	 */
	public void draw(Graphics g)
	{
		g.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
}