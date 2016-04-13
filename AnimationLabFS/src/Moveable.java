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

public interface Moveable
{
    public void setPos(int x, int y);
    public void setX(int x);
    public void setY(int y);
    public int getX();
    public int getY();
}
