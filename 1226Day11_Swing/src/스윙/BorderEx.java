package ����;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderEx extends JFrame {

	BorderEx(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�������̾ƿ�");
		BorderLayout border = new BorderLayout(20,20);
		//setLayout(new BorderLayout()); �ν��Ͻ� �̸� �����ϰ� �ٷ� �־��ټ��� ����
		setLayout(border);
		add(new JButton("add"),border.NORTH);
		add(new JButton("sub"),border.SOUTH);
		add(new JButton("mul"),border.WEST);
		add(new JButton("mdivul"),border.EAST);
		add(new JButton("calculate"),border.CENTER);
		setSize(400,400);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderEx();
	}

}
