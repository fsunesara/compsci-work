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

public class Player extends GameObject
{
	private int speed;
	private String direction;
	private Image[] frames = new Image[3];
	
	public Player()
	{
		this(0, 0, 0);
	}
	
	public Player(int x, int y)
	{
		this(x, y, 0);
	}
	
	public Player(int x, int y, int s)
	{
		super(x, y);
		speed = s;
		direction = "";
		
		try
		{
			frames[0] = ImageIO.read(new File("cardef.png"));	
			frames[1] = ImageIO.read(new File("cardown.png"));
			frames[2] = ImageIO.read(new File("carup.png"));
		}
		catch(Exception e)
		{
			System.out.println("TRIGGERED: " + e);
		}
	}
	
	/**
	 * Purpose: Sets the x position of the player
	 * Precondition: None
	 * Postcondition: Sets the x position
	 */
	public void setX(int x)
	{
		super.setX(x);
	}
	
	/**
	 * Purpose: Sets the y position of the player
	 * Precondition: None
	 * Postcondition: Sets the y position
	 */
	public void setY(int y)
	{
		super.setY(y);
	}
	
	/**
	 * Purpose: Sets the direction of the player
	 * Precondition: None
	 * Postcondition: Sets the direction
	 */
	public void setDirection(String dr)
	{
		direction = dr;
	}
	
	/**
	 * Purpose: Sets the speed of the player
	 * Precondition: None
	 * Postcondition: Sets the speed
	 */
	public void setSpeed(int s)
	{
		speed = s;
	}
	
	/**
	 * Purpose: Gets the speed of the player
	 * Precondition: None
	 * Postcondition: Gets the speed
	 */
	public int getSpeed()
	{
		return speed;
	}
	
	/**
	 * Purpose: Draws the player
	 * Precondition: None
	 * Postcondition: Draw the player
	 */
	public void draw(Graphics g)
	{
		switch(direction)
		{
			case("UP"):
			{
				g.drawImage(frames[2], getX(), getY(),80,80, null);	
				break;
			}
			case("DOWN"):
			{
				g.drawImage(frames[1], getX(), getY(),80,80, null);	
				break;
			}
			default:
			{
				g.drawImage(frames[0], getX(), getY(),80,80, null);	
			}
		}
	}
}
