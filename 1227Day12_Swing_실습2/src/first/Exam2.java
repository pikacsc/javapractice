package first;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam2 extends JFrame{
	
	Exam2(){
		setTitle("Hello Embedded");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1, 10);
		
		setLayout(grid);
		for(int i=1;i<11;i++) {
			add(new JButton(i+""));
			}
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam2();
	}

}
