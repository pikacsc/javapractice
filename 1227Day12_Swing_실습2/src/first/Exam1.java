package first;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam1 extends JFrame{

	Exam1(){
		setSize(400,200);
		setTitle("Hello Embedded");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout border = new BorderLayout(5,5);
		setLayout(border);
		add(new JButton("NORTH"),border.NORTH);
		add(new JButton("WEST"),border.WEST);
		add(new JButton("CENTER"),border.CENTER);
		add(new JButton("EAST"),border.EAST);
		add(new JButton("SOUTH"),border.SOUTH);

		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Exam1();
			
	}

}
