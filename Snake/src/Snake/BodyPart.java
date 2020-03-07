package Snake;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class BodyPart{
	
	int x;
	int y;
	Color color;
	int xVelocity;
	int yVelocity;
	
	
	public BodyPart (int x, int y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
		
		
	}
	
	public void paint(Graphics g){
		g.setColor(color);
		g.fillRect(getX(),getY(),5,5);
		
	}
	
	public void update(){
		
		x += xVelocity;
		y += yVelocity;
		
	
	
	}
	
	
	public int  getX(){
		
		return x;
	}
	
	public int  getY(){
		
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
	
	public void movement(int position, ArrayList<BodyPart> body){
		
		setX(body.get(position-1).getX());
		setY(body.get(position-1).getY());
		
		
	}
	public void setX(int x){
		
		this.x = x;
	}
	public void setY(int y){
		
		this.y = y;
	}
	
	
}