package 마우스이용선그리기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEx extends JFrame{	

	MouseEx() {
		setTitle("Drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		add(panel,BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel{
		
		Vector<Point> vs = new Vector<Point>(); //메모리 할당 준비
		Vector<Point> ve = new Vector<Point>();
		
		
		Point startP = null;
		Point endP = null;
					
		MyPanel(){
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					endP = e.getPoint();
					vs.add(startP);
					ve.add(endP);
					repaint();
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint(); 
				}
			
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			for(int i=0; i<vs.size();i++) {
				Point s = vs.elementAt(i);
				Point e = ve.elementAt(i);
				
				g.drawLine((int)s.getX(),(int)s.getY(),(int)e.getX(),(int)e.getY());
				//darwLine(int x, int y, int x2, int y2); int 형만 가능
				
			}
		}
	}
	
	public static void main(String[] args) {
		new MouseEx();
	}

}
