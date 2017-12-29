package paintComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx extends JFrame{

	paintJPanelEx() {
		setTitle("JPanel paintComponent ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		MyPanel panel = new MyPanel();
		add(panel, BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawRect(10, 10, 50, 50);
			g.setColor(Color.green);
			
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.BLUE);
			
			g.drawRect(90, 90, 50, 50);
		}
	}
	
	public static void main(String[] args) {
		new paintJPanelEx();
	}

}
