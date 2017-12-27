package first;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam3 extends JFrame {
	Exam3(){
		setTitle("Hello Embedded");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1, 10);
		setLayout(grid);
		
		JButton Jb[] = new JButton[10];
		Color col[] = {Color.red,Color.orange,Color.yellow,Color.GREEN,Color.LIGHT_GRAY,Color.blue,Color.DARK_GRAY,Color.blue
				,Color.PINK,Color.cyan};
		for(int i=0;i<10;i++) {
			Jb[i] = new JButton(""+i);
			Jb[i].setBackground(col[i]);
			add(Jb[i]);
		}
	
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam3();
		
	}

}
