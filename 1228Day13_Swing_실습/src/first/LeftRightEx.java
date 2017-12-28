package first;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LeftRightEx extends JFrame implements ActionListener{
	ImageIcon leftimg = new ImageIcon("img/left.png");
	ImageIcon rightimg = new ImageIcon("img/right.png");
	ImageIcon fruits[] = {
			new ImageIcon("img/apple.jpg"),
			new ImageIcon("img/pear.jpg"),
			new ImageIcon("img/cherry.jpg")
	
	};
	JLabel imgLabel = new JLabel();
	LeftRightEx() {
		setTitle("12.28실습 화살표");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		
		JButton left = new JButton("←");
		
		JButton right = new JButton("→");
		
		ButtonGroup g = new ButtonGroup();
		g.add(left);
		g.add(right);
		panel.add(left);
		panel.add(right);
		imgLabel.setIcon(fruits[1]);
		
		left.addActionListener(this);
		right.addActionListener(this);
		
		
		add(panel,BorderLayout.NORTH);
		add(imgLabel,BorderLayout.CENTER);
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 200);
		setVisible(true);
		

		
	}
	
	
	
	

	
	public static void main(String[] args) {	
		new LeftRightEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		
		if(b.getText().equals("←")) {
			imgLabel.setIcon(fruits[arrowChanger("←")]);
		}
		else if(b.getText().equals("→")) {
			imgLabel.setIcon(fruits[arrowChanger("→")]);
		}
		
		
	}
	
	int arrowChanger(String x) {
		int num = 1;
		if(x.equals("←")) {
			num -= 1;
		}
		else{
			num += 1;
		}
		return num;
	}
	
	

}

