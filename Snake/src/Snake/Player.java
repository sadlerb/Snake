package Snake;

import java.awt.Graphics;
import java.awt.Color;




public class Player{
	private int x = Snake.PLAY_WIDTH/2;
	private int y = Snake.PLAY_HEIGHT/2;
	private int width = 5;
	private int height = 5;
	private int xVelocity;
	private int yVelocity;
	
	
	
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x,y,width,height);
		
	}

	public void update(){
		
		x += xVelocity;
		y += yVelocity;
	
	
	}
	
	
	
	
	
	
	public int getX(){
		
		return x;
	}
	
	public int getY(){
		
		return y;
	}
	
	
	public int getXVelocity(){
		
		return xVelocity;
	}
	
	public int getYVelocity(){
		
		return yVelocity;
	}
	
	public void setXVelocity(int velocity){
		
		xVelocity = velocity;
	}
	
	public void setYVelocity(int velocity){
		
		yVelocity = velocity;
	}
	
	public int getHeight(){
		
		return height;
	}
	
	public int getWidth(){
		
		return width;
	}
	
	public void checkCollision(Food food){
		
		if (this.x  > food.getX() && this.x < food.getX() + food.getSize()){
			
				if (this.y > food.getY() && this.y < food.getY()+ food.getSize() ){
					food.update();
			}
			
			
		}
	}
}