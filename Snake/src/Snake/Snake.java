package Snake;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;

public class Snake extends JFrame{
	final static int WINDOW_WIDTH = 500;
	final static int WINDOW_HEIGHT = 500;
	final static int PLAY_WIDTH = WINDOW_WIDTH - 25;
	final static int PLAY_HEIGHT = WINDOW_HEIGHT -45;
		
	
	public Snake(){
		
		super.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		super.setResizable(false);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.add(new GamePanel());	
		super.setVisible(true);
		
		
		
	}
	
	public static void main (String [] args){
		
		new Snake();
		
	}
}