package ����;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridEx extends JFrame{

	public GridEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�׸��巹�̾ƿ�");
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		grid.setHgap(5);
		setLayout(grid);
		add(new JLabel("�̸�"));
		add(new JTextField(""));
		add(new JLabel("�й�"));
		add(new JTextField(""));
		add(new JLabel("�а�"));
		add(new JTextField(""));
		add(new JLabel("����"));
		add(new JTextField(""));
		setSize(400, 300);  //size�� �� ���߿� ����,�׷��� ������ â�� ũ�� ����� ���̰� �ϴ� ������ ����
		
		setVisible(true);
		
	}
		
	public static void main(String[] args) {
		new GridEx();
	}

}
