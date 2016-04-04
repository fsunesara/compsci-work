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
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class OuterSpace extends Canvas implements KeyListener, Runnable {
	private Ship ship;
	private boolean alien;
	private AlienHorde horde;
	private Bullets shots;
	private int alienSpeed;
	private int round;

	private boolean[] keys;
	private BufferedImage backGround;

	public OuterSpace() 
	{
		setBackground(Color.black);
		keys = new boolean[5];
		ship = new Ship(350, 400, 100, 100, 3);
		round = 1;
		alienSpeed = 1;
		alien = true;
		horde = new AlienHorde(11);
		shots = new Bullets();
		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true);
	}
	
	/**
	 * Purpose: Override of update method in Canvas
	 * Precondition: None
	 * Postcondition: None
	 */
	public void update(Graphics window) 
	{
		paint(window);
	}
	
	/**
	 * Purpose: Override of paint method in Canvas
	 * Precondition: None
	 * Postcondition: None
	 */
	public void paint(Graphics window) 
	{
		if (alien == true) 
		{
			horde.createHorde(115, 35, 40, 40, alienSpeed);
			alien = false;
		}
		
		Graphics2D doubleBuffer = (Graphics2D) window;
		
		if (backGround == null)
		{
			backGround = (BufferedImage) (createImage(getWidth(), getHeight()));
		}
			
		Graphics g = backGround.createGraphics();
		g.setColor(Color.BLUE);
		g.drawString("StarFighter ", 25, 50);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800, 600);
		if (!horde.endGame(ship) || round == 0) 
		{
			if (keys[0] == true) 
			{
				if (ship.getX() > 0 - (ship.getWidth() / 2) + 2) 
				{
					ship.move("LEFT");
				}
			}
			if (keys[1] == true) 
			{
				if (ship.getX() < 800 - (ship.getWidth() / 2) - 18) 
				{
					ship.move("RIGHT");
				}
			}
			if (keys[2] == true) 
			{
				if (ship.getY() > 0 - 18) 
				{
					ship.move("UP");
				}
			}
			if (keys[3] == true) 
			{
				if (ship.getY() < 600 - ship.getHeight() / 2 - 50) {
					ship.move("DOWN");
				}
			}

			if (keys[4] == true) 
			{
				shots.add(new Ammo((ship.getX() + ship.getWidth() / 2) - 5,
						ship.getY() - 5, 5));
				keys[4] = false;
			}
			
			shots.draw(g);
			shots.move();
			horde.draw(g);
			ship.draw(g);
			horde.move();
			horde.removeDead(shots);
			shots.clean();
			
			if (horde.getSize() == 0) 
			{
				alien = true;
				alienSpeed++;
				round++;
			}
		} 
		else 
		{
			g.setColor(Color.RED);
			g.setFont(new Font(Font.SANS_SERIF, 250, 250));
			g.drawString("GAME", 25, 300 - 40);
			g.drawString("OVER", 25, 510 - 40);
			shots.end();
			shots.draw(g);
			horde.draw(g);
			ship.draw(g);
		}
		g.setFont(new Font(Font.SANS_SERIF, 24, 24));
		g.setColor(Color.WHITE);
		
		g.setFont(new Font(Font.SANS_SERIF, 24, 24));
		g.drawString("ROUND " + round, 15, 30);
		g.drawString("SCORE: " + horde.getScore(), 335, 30);
		doubleBuffer.drawImage(backGround, null, 0, 0);

		backGround = null;

	}

	/**
	 * Purpose: Implementation of keyPressed method in KeyListener
	 * Precondition: None
	 * Postcondition: None
	 */
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = true;
		}
		repaint();
	}

	/**
	 * Purpose: Implementation of keyReleased method in KeyListener
	 * Precondition: None
	 * Postcondition: None
	 */
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}
		repaint();
	}

	/**
	 * Purpose: Implementation of keyTyped method in KeyListener
	 * Precondition: None
	 * Postcondition: None
	 */
	public void keyTyped(KeyEvent e) 
	{
		//does nothing
	}

	/**
	 * Purpose: Implementation of run method in Runnable
	 * Precondition: None
	 * Postcondition: None
	 */
	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(5);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}