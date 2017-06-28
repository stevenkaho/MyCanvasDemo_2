import javax.swing.*;
import java.awt.*;

public class MyCanvasDemo_2 extends JComponent {
	public void MyCnavasDemo_2(){
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		// draw line
		g.drawLine(100, 100, 150, 150);
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(640,480);
	}
	
	public Dimension getMaximumSize(){
		return getMaximumSize();
	}
	
	public Dimension getMinimumSize(){
		return getMinimumSize();
	}
	
	public static void main(String[] args){
		// set frame outlook
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame frame = new JFrame("MyCanvasDemo_2");
		
		frame.getContentPane().add(new MyCanvasDemo_2());
		
		frame.getContentPane().setBackground(Color.green);
		
		frame.setLocation(100, 100);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		frame.setVisible(true);
		
		
	}
}
