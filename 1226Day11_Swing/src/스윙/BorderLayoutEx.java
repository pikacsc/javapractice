package ����;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	public BorderLayoutEx() {
		setTitle("BorderLayoutEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(20,30));
		//new BorderLayout(hGap,vGap) ,
		//h(horizontal:������)Gap:�¿� ��������Ʈ������ ���� �ȼ� ����
		//v(vertical:������)Gap:���� ��������Ʈ ������ ���� �ȼ�����
		add(new JButton("div"),BorderLayout.WEST);
		add(new JButton("Calculate"),BorderLayout.CENTER);
		add(new JButton("mul"),BorderLayout.EAST);
		add(new JButton("add"),BorderLayout.NORTH);
		add(new JButton("sub"),BorderLayout.SOUTH);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
