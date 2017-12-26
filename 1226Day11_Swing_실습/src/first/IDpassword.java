package first;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IDpassword extends JFrame {
	
	IDpassword(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("·Î±×ÀÎ");
		GridLayout grid = new GridLayout(2,2);
		setLayout(grid);
		JLabel ID = new JLabel("ID");
		add(ID);
		JTextField idt = new JTextField("");
		add(idt);
		
		JLabel PW = new JLabel("Password");
		add(PW);
		JTextField pwt = new JTextField("");
		add(pwt);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IDpassword();
	}

}
