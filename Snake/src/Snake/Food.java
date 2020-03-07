package Snake;

import java.util.Random;
import java.awt.Graphics;
import java.awt.Color;

public class Food{
	private Random random = new Random();
	private int[] posArray = new int[]{100,200,300,400,150,250,350,450,125,225,325,425,175,275,375,475,50,75,80,85,90,95,45,55,65};
	private int x = 100;
	private int y= 100;
	final private int size = 5;
	
	
	
	public void update(){
	
		x = posArray[random.nextInt(posArray.length)];
		y = posArray[random.nextInt(posArray.length)];
		
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
	
	
	public void checkCollision(Player player){
		
		
		if (this.x == player.getX() && this.y == player.getY()){
			
			update();
			player.addPart();
			
		}
	}
	
}
