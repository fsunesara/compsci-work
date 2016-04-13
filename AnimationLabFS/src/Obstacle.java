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
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Obstacle extends GameObject
{
	private int speed;
	private Image image;
	
	public Obstacle()
	{
		this(0, 0, 0);
	}
	
	public Obstacle(int x, int y)
	{
		this(x, y, 0);
	}
	
	public Obstacle(int x, int y, int s)
	{
		super(x, y);
		speed = s;
		
		try
		{
			image = ImageIO.read(new File("obstacle.png"));	
		}
		catch(Exception e)
		{
			System.out.println("TRIGGERED: " + e);
		}
	}
	
	/**
	 * Purpose: Sets the obstacle's speed
	 * Precondition: None
	 * Postcondition: Set the speed
	 */
	public void setSpeed(int s) 
	{
		speed = s;		
	}

	/**
	 * Purpose: Gets the obstacle's speed
	 * Precondition: None
	 * Postcondition: Get the speed
	 */
	public int getSpeed() 
	{
		return speed;
	}
	
	/**
	 * Purpose: Draws the obstacle
	 * Precondition: None
	 * Postcondition: Draw the obstacle
	 */
	public void draw(Graphics g)
	{
		 g.drawImage(image,getX(),getY(),80,80,null);
	}
}
