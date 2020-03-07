package Snake;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.Timer; 
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;





public class GamePanel extends JPanel implements ActionListener, KeyListener{
	
	Player player = new Player();
	Food food = new Food();
	
	public GamePanel (){
		Timer timer= new Timer (60,this);//Creates a timer to refresh the screen
		timer.start();// Starts timer 
		
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	
	private void update(){
		
		player.update();
		food.checkCollision(player);
		
		
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0,0,Snake.WINDOW_WIDTH,Snake.WINDOW_HEIGHT);
		g.setColor(Color.WHITE);
		g.drawLine(5,5,5,Snake.PLAY_HEIGHT);
		g.drawLine(5,5,Snake.PLAY_WIDTH,5);
		g.drawLine(Snake.PLAY_WIDTH,5,Snake.PLAY_WIDTH,Snake.PLAY_HEIGHT);
		g.drawLine(5,Snake.PLAY_HEIGHT,Snake.PLAY_WIDTH,Snake.PLAY_HEIGHT);
		
		player.paint(g);
		food.paint(g);
		
		
	}
	
	
	public void actionPerformed (ActionEvent e){
		
		update();
		repaint();
		
		
		
	}
	
	
	public void keyReleased(KeyEvent e){
		
		
		
	}
	public void keyPressed(KeyEvent e){
		if (e.getKeyCode() == KeyEvent.VK_UP){
			if (player.getYVelocity() != 5){
				
				player.setYVelocity(-5);
				player.setXVelocity(0);
			}
			
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN){
			
			if (player.getYVelocity() != -5){
				
				player.setYVelocity(5);
				player.setXVelocity(0);
			}
		}
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			
			if (player.getXVelocity() != -5){
				
				player.setYVelocity(0);
				player.setXVelocity(5);
			}
		}
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			
			if (player.getXVelocity() != 5){
				
				player.setYVelocity(0);
				player.setXVelocity(-5);
			}
		}
		
		
		
		
	}
	public void keyTyped(KeyEvent e){
		
		
		
	}
}