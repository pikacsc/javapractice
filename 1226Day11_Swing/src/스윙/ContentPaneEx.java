package ����;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		setTitle("����Ʈ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X��ư ������ �����ϰ� ����,�޸� ������ �������ؼ�
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("Ȯ��"));
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("����"));
		setSize(400, 400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ContentPaneEx();
		
	}

}
