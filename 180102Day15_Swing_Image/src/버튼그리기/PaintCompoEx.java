package 버튼그리기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PaintCompoEx extends JFrame{
	
	public PaintCompoEx() {
		setTitle("Paint component 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		MyButton b = new MyButton("new Button");
		b.setOpaque(true);
		b.setBackground(Color.cyan);
		add(b);
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyButton extends JButton{
		public MyButton(String s) {
			super(s);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		new PaintCompoEx();
	}

}
