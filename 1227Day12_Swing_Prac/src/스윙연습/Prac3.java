package ��������;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Prac3 extends JFrame{

	Prac3() {
		setTitle("��������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 2,20,20);
		setLayout(grid);
		
		JLabel kor = new JLabel("����");
		JTextField kort = new JTextField("");

		JLabel eng = new JLabel("����");
		JTextField engt = new JTextField("");

		JLabel math = new JLabel("����");
		JTextField matht = new JTextField("");
		
		JButton grade = new JButton("�������");
		JLabel result = new JLabel("");

		add(kor);
		add(kort);
		add(eng);
		add(engt);
		add(math);
		add(matht);
		add(grade);
		add(result);
		
		
		grade.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				int score = (Integer.parseInt(kort.getText())+Integer.parseInt(engt.getText())+Integer.parseInt(matht.getText()))/3;
				result.setText(score>=90 && score<=100? "A����":score>=80 && score<90 ? "B����":score>=70 && score<80? "C����":score>=60 && score<70? "D����":"F����"); 
			}
		});
		
		
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Prac3();
		
	}

}
