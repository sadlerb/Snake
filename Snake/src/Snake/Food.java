package Snake;

import java.util.Random;
import java.awt.Graphics;
import java.awt.Color;

public class Food{
	Random random;
	private int x = 100;
	private int y= 54;
	final private int size = 5;
	
	
	
	public void update(){
		x = random.nextInt();
		y = random.nextInt();
		
	}
	
	public void paint(Graphics g){
		
		g.setColor(Color.GREEN);
		g.fillRect(x,y,size,size);
		
	}
	
		
	public int getX(){
		
		return x;
	}
	
	public int getY(){
		
		return y;
	}
	
	public int getSize(){
		
		return size;
	}
	
	private void updatePosition(){
		
		
	}
	
}
