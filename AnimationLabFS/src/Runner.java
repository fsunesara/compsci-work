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

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;

import java.awt.image.BufferedImage;

public class Runner extends Canvas implements KeyListener, Runnable
{
	private Player p;
	private ArrayList<Obstacle> obstacles;
	private int obstacleSpeed;
	private int timerSpeed;
	private static Timer timer;
	private Random r =  new Random();
	private boolean[] keys;
	private BufferedImage back;
	private boolean running;
	
	public Runner()
	{	
		setBackground(Color.gray);
		keys = new boolean[2];
		p = new Player(200, 220, 5);
		running = true;
		
		obstacles = new ArrayList<Obstacle>();
		
		obstacles.add(new Obstacle(250,50,2));
        
        obstacleSpeed = 1;
        timerSpeed = 3000;
        
        this.addKeyListener(this);
		new Thread(this).start();
		
		setVisible(true);
		
		startGame();
		moreObstacles();
		
	}
	
	/**
	 * Purpose: Updates the canvas
	 * Precondition: None
	 * Postcondition: Update the canvas
	 */
	public void update(Graphics g)
	{
		paint(g);
	}
	
	/**
	 * Purpose: Speeds up the obstacles when the timer ends
	 * Precondition: None
	 * Postcondition: 
	 */
	public class TimerHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			increaseSpeed();
			timer.stop();
			timer.setInitialDelay(timerSpeed);
			timer.start();
			moreObstacles();
		}
	};
	
	/**
	 * Purpose: Paint the graphics on the screen
	 * Precondition: None
	 * Postcondition: Gets the speed
	 */
	public void paint(Graphics g)
	{
		Graphics2D twoDGraph = (Graphics2D)g;

		if(back==null)
		{
			back = (BufferedImage)(createImage(getWidth(),getHeight()));
		}

		Graphics game = back.createGraphics();

		game.setColor(Color.GRAY);
		game.fillRect(0,0,800,600);
 

		if(running == true)
		{
			if(keys[0] == true)
			{
				if(p.getY() > 10)
				{
                	p.move("UP");
                	p.setDirection("UP");
            	}
			}
			
			if(keys[1] == true)
			{
				if(p.getY() < 450)
				{
					p.move("DOWN");
					p.setDirection("DOWN");
				} 
			}	
                        
		    for(Obstacle o : obstacles)
		
		    {
		        o.draw(game);
		        o.move("LEFT");
		        
		        if(o.getX() == -100)
		        {
		        	int recr = r.nextInt(2);
		        	
		        	if(recr == 0)
		        	{
		        		o.setX(800);
		        		o.move("LEFT");
		        	}
		        }
		        
		        if(p.getRect().intersects(o.getRect()))
		        {
		    		running = false;
		        }
		    }
		
	    	p.draw(game);
			twoDGraph.drawImage(back, null, 0, 0);
		}
		else
		{
			g.setColor(Color.RED);
			g.setFont(new Font(Font.SANS_SERIF, 250, 250));
			g.drawString("GAME", 25, 300 - 40);
			g.drawString("OVER", 25, 510 - 40);
		}
	}
	
	/**
	 * Purpose: Is called when a key is pressed
	 * Precondition: None
	 * Postcondition: Is called when a key is pressed
	 */
	public void keyPressed(KeyEvent k)
	{
		if(k.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[0] = true;
		}
		
		if(k.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[1] = true;
		}
		
		repaint();
	}
	
	/**
	 * Purpose: Is called when a key is released
	 * Precondition: None
	 * Postcondition: Is called when a key is released
	 */
	public void keyReleased(KeyEvent k)
	{
		if(k.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[0] = false;
			p.setDirection("ayy lmao");	//resets the car to its default position
		}
		
		if(k.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[1] = false;
			p.setDirection("ayy lmao");	//resets the car to its default position
		}
		
		repaint();
	}
	
	public void keyTyped(KeyEvent k)
	{
		//do nothing
	}
	
	/**
	 * Purpose: Creates a random obstacle
	 * Precondition: None
	 * Postcondition: Create an obstacle
	 */
	public void moreObstacles()
	{
		if(timer.isRunning())
		{
			int y = r.nextInt(480);
			obstacles.add(new Obstacle(800, y,  obstacleSpeed));
		}
	}
	
	/**
	 * Purpose: Starts the timer
	 * Precondition: None
	 * Postcondition: Start the timer
	 */
	public void startGame()
	{
		if(timer == null)
		{
            timer = new Timer(timerSpeed, new Runner.TimerHandler());
            timer.start();
        }
        else
        {
            if(! timer.isRunning())
            {
                timer.restart();
            }
        }
	}
		
	/**
	 * Purpose: Loops the program
	 * Precondition: None
	 * Postcondition: Loop the program
	 */
	public void run()
	{
		try 
		{
			while(true)
			{
				Thread.currentThread().sleep(5);
				repaint();
			}
		} 
		catch (Exception e) 
		{
			System.out.println("triggered " + e);
		}
	}
	
	public void increaseSpeed()
	{
		if(timerSpeed != 100)
		{
			timerSpeed -= 100;
			obstacleSpeed++;
		}
	}
}
