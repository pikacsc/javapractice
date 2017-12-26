package ½ºÀ®;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx() {
		setTitle("ÇÃ·Î¿ì ·¹ÀÌ¾Æ¿ô »ùÇÃ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		add(new JButton("add"));
		add(new JButton("sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Calculate"));
		
		setSize(400, 400);
		setVisible(true);
		setBackground(Color.orange);
		
	}
	
	
	public static void main(String[] args) {
		new FlowLayoutEx();		
		
	}

}
