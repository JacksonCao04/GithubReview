import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MethodPractice extends JPanel{
	
	// Practice calling methods with parameters
	// by drawing the required shapes/patterns from the document
	public void paint(Graphics g) {
		// DRAW SPHERE

		// DRAW SPHERE
				g.drawOval(0, 0, 200, 200);
				g.drawOval(25 ,0, 200-50,200);
				g.drawOval(50, 0, 100, 200);
				g.drawOval(75, 0, 50, 200);
				g.drawOval(0, 75, 200, 50);
				g.drawOval(0, 25, 200, 200-50);
				g.drawOval(0,50,200,100);

			//DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
				g.drawOval(300, 100, 200, 200);
				g.drawLine(400, 100, 300, 220);
				g.drawLine(300, 220, 500, 200);
				g.drawLine(500, 200, 400, 100);
				g.drawOval(355, 130, 100, 80);
				
				// DRAW CUBE
				   g.drawRect(400, 400, 200, 200);
				   g.drawRect(300, 500, 200, 200);
				   g.drawLine(300, 700, 400, 600);
				   g.drawLine(300, 500, 400, 400);
				   g.drawLine(500, 500, 600, 400);
				   g.drawLine(500, 700, 600, 600);
				   
				  //DRAW APCS
				   g.fillRect(800,400,40,200);
				   g.fillRect(870,400,45,200);
				   g.fillRect(800, 400, 100, 45);
				   g.fillRect(800, 470, 100, 45);
				   
				   g.fillRect(990,400,40,200);
				   g.fillRect(1075,400,45,100);
				   g.fillRect(990, 400, 100, 45);
				   g.fillRect(990, 475, 130, 45);

				   g.fillRect(1200,400,40,175);
				   g.fillRect(1200,400,100,45);
				   g.fillRect(1200,555,100,45);

				   g.fillRect(1400,400,130,40);
				   g.fillRect(1400,400,40,130);
				   g.fillRect(1400,500,130,40);
				   g.fillRect(1490,500,40,130);
				   g.fillRect(1400,600,130,40);



	}

	
	
	
	
	
	
	
	public static void main(String[] arg) {
		MethodPractice m = new MethodPractice();
	}
	
	public MethodPractice() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
