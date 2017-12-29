package paintComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class GraphicsDrawLineEx extends JFrame{
	
	GraphicsDrawLineEx(){
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		add(panel,BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		
		MyPanel() {
			this.setBackground(Color.GRAY);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
			
			g.setColor(Color.green);
			g.drawOval(20, 20, 80, 80);
			g.fillOval(10, 70, 50, 50);

			
			g.setColor(Color.YELLOW);
			g.drawRect(20, 20, 80, 80);
			g.fillRect(10, 10, 50, 50);
			
			
			g.setColor(Color.MAGENTA);
			g.drawRoundRect(20, 20, 120, 80, 40, 60);
			g.fillRoundRect(10, 130, 50, 50, 20, 20);
			
			g.setColor(Color.PINK);
			g.drawArc(40, 40, 80, 80, 90, 270);//g.drawArc(x좌표, y좌표, 가로, 세로, 중심에서 동쪽지점 기준 제외각,그리는각);
			g.fillArc(10, 190, 50, 50, 0, 270);
		}
	
	}
	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}

}
