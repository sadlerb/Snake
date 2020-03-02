package Snake;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;

public class Snake extends JFrame{
	final static int WINDOW_WIDTH = 600;
	final static int WINDOW_HEIGHT = 600;
	final static int PLAY_WIDTH = WINDOW_WIDTH - 25;
	final static int PLAY_HEIGHT = WINDOW_HEIGHT -45;
		
	
	public Snake(){
		GridLayout l = new GridLayout(60,60)
		
		super.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		super.setResizable(false);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		super.setLayout(new GridLayout(60,60));
		System.out.println();
		super.add(new GamePanel());
		super.setLayout(new GridLayout(60,60));
		super.setVisible(true);
		
		
		
	}
	
	public static void main (String [] args){
		
		new Snake();
		
	}
}