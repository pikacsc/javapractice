package ���̾�α�;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneEx extends JFrame {

	TabbedPaneEx(){
		setTitle("���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane pane = createTabbedPane();
		add(pane, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}
	
	JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane(JTabbedPane.LEFT);
		pane.addTab("tab1", new JLabel(new ImageIcon("images/1.jpg")));
		pane.addTab("tab2", new JLabel(new ImageIcon("images/2.jpg")));
		pane.addTab("tab3", new JLabel(new ImageIcon("images/3.png")));
		return pane;
	}
	
	class MyPanel extends JPanel {
		MyPanel(){
			this.setBackground(Color.YELLOW);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50);
			
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			
			g.setColor(Color.red);
			g.drawString("tab 3�� ���� JPanel �Դϴ�.", 30, 50);
		}
	}
	
	public static void main(String[] args) {
		new TabbedPaneEx();
	}

}
