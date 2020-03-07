package Snake;
import java.util.ArrayList;
import java.util.Dictionary;
import java.awt.Graphics;
import java.awt.Color;





public class Player{
	private int x = 250;
	private int y = 250;
	private int width = 5;
	private int height = 5;
	private int xVelocity;
	private int yVelocity;
	private ArrayList<BodyPart> body = new ArrayList<BodyPart>();
	
	public Player (){
		
		body.add(new BodyPart(250,250,Color.RED));
	}
	
	public void paint(Graphics g){
		for (int i = 0; i < body.size(); i++){
			body.get(i).paint(g);
		}
	}

	public void update(){
		
		body.get(0).setXVelocity(xVelocity);
		body.get(0).setYVelocity(yVelocity);
		for (int i = 1; i < body.size(); i++){
			body.get(i).movement(i,body);
			body.get(i).update();
		}
		body.get(0).update();
	
	
	}
	
	
	
	public int getX(){
		
		return body.get(0).getX();
	}
	
	public int getY(){
		
		return body.get(0).getY();
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
	
	public void addPart(){
		
		body.add(new BodyPart(body.get(body.size()-1).getX(),body.get(body.size()-1).getY()+5,Color.BLUE));
	}
	
	
}