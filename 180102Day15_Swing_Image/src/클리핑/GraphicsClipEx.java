package 클리핑;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsClipEx extends JFrame{
	GraphicsClipEx() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		add(panel, BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/dddd.jpg");
		Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(50, 20, 150, 150);
			g.drawImage(img,0,0, getWidth(), getHeight(), this);
			g.setColor(Color.BLUE);
			g.setFont(new Font("Sanserif", Font.ITALIC, 40));
			g.drawString("Go Gator", 10, 150);
		}
	
	
	}
	
	
	
	public static void main(String[] args) {
		new GraphicsClipEx();
	}

}
