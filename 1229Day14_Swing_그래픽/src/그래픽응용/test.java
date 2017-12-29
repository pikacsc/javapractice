package 그래픽응용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test extends JFrame{
	JLabel NameBungi[] = new JLabel[4];
	JTextField Bungi[] = new JTextField[4];
	MyPanel panel;
	
	
	//백분율로 구하는 변수
	int bun[] = new int [4];
	test() {
		setTitle("그래픽응용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new MyPanel();
		
		JPanel p = new JPanel();
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		p.setLayout(grid);
		
		bun[0] = 150;
		bun[1] = 250;
		bun[2] = 280;
		bun[3] = 320;
		
		NameBungi[0] = new JLabel("1/4분기");
		NameBungi[1] = new JLabel("2/4분기");
		NameBungi[2] = new JLabel("3/4분기");
		NameBungi[3] = new JLabel("4/4분기");
		
		Bungi[0] = new JTextField(10);
		Bungi[1] = new JTextField(10);
		Bungi[2] = new JTextField(10);
		Bungi[3] = new JTextField(10);
		
		JButton input = new JButton("입력");
		
		
		input.addActionListener(new MyActionListener());
		
		for(int i=0;i<4;i++) {
			p.add(NameBungi[i]);
			p.add(Bungi[i]);
		}
		add(p,BorderLayout.NORTH);
		add(panel,BorderLayout.CENTER);
		add(input,BorderLayout.SOUTH);
		
		
		
		setSize(300, 500);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			bun[0] = Integer.parseInt(Bungi[0].getText());
			bun[1] = Integer.parseInt(Bungi[1].getText());
			bun[2] = Integer.parseInt(Bungi[2].getText());
			bun[3] = Integer.parseInt(Bungi[3].getText());
			repaint();
		}
		
	}
	
	
	
	class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.red);
			g.drawString("매출현황", 10, 130);
			
			g.setColor(Color.BLACK);
			g.drawString("1/4분기", 10, 150);
			g.drawString("2/4분기", 10, 170);
			g.drawString("3/4분기", 10, 190);
			g.drawString("4/4분기", 10, 210);
			
			
			g.setColor(Color.green);
			
			float sum = 0;
			for(int i=0;i<4;i++) {
				sum+=bun[i];
			}
			float back[] = new float[4];
			
			//백분율
			//1/4 /전체 *100
			//2/4 /전체 *100
			for(int i=0;i<4;i++) {
				back[i]=(float)bun[i]/sum *100*5;
			}
			
			g.fillRect(80,140, (int)back[0], 15);
			g.fillRect(80,160, (int)back[1], 15);
			g.fillRect(80,180, (int)back[2], 15);
			g.fillRect(80,200, (int)back[3], 15);
			
			
			
			
		}
	}
	
	
	public static void main(String[] args) {
		new test();
	}

}
