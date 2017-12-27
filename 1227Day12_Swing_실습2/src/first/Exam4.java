package first;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam4 extends JFrame {
	
	Exam4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello Embedded");
		GridLayout grid = new GridLayout(4, 4);
		setLayout(grid);
		JLabel jarr[] = new JLabel[16];
		Color c[] = {Color.red,Color.yellow,Color.ORANGE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.LIGHT_GRAY,Color.DARK_GRAY,Color.BLACK,Color.WHITE,Color.pink,
				Color.red,Color.yellow,Color.ORANGE,Color.GREEN,Color.CYAN};
		
		for(int i=0;i<16;i++) {
			jarr[i] = new JLabel(""+i);
			jarr[i].setOpaque(true);
			jarr[i].setBackground(c[i]);
			add(jarr[i]);
		}
		setSize(400, 200);
		setVisible(true);
	}
		

	
	public static void main(String[] args) {
		new Exam4();
	}

}
