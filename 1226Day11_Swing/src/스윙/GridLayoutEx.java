package ����;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	GridLayoutEx(){
		setTitle("�׸��� ���̾ƿ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 3,20,20));
	//	setLayout(new GridLayout(������ ��,������ ��,hGap,vGap));
		add(new JButton("1"));     
		add(new JButton("2"));
		add(new JButton("3")); //0��°�� ��������
		add(new JButton("4")); //�����࿡�� ��ġ��
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("*"));
		add(new JButton("0"));
		setSize(500, 600);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
