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

public interface Moveable
{
    public void setPos(int x, int y);
    
    public void setX(int x);
    public void setY(int y);
    public int getX();
    public int getY();

    public void setWidth(int w);
	public void setHeight(int h);
	public int getWidth();
	public int getHeight();
	
    public void setSpeed(int s);
	public int getSpeed();
}