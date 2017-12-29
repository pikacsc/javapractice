package paintComponent;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawStringEx extends JFrame{
		
	GraphicsDrawStringEx(){
		setTitle("drawString ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		add(panel,BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹٴ� ��մ�.~~",30,30);
			g.drawString("�󸶳�? �ϴø�ŭ ����ŭ!!!!", 60,60);
		}
	}
	
	
	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}

}
