package ����;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NoneLayout extends JFrame {

	public NoneLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���̾ƿ� ���� ����");
		
		//����ĸ�ķ� ��ǥ�� ����85x42
		setLayout(null);
		
		//85x20
		JLabel l = new JLabel("����");
		l.setLocation(85,20); //��ǥ
		l.setSize(50,20); //������
//		l.setBounds(85,20,50,20);  setLocation+setSize ���ÿ� ���� ����,l.setBounds(x,y,��ư����ũ��,��ư����ũ��);
		add(l);
		
		
		JButton b = new JButton("����");
		b.setLocation(85,42); //��ư.setLocation(x��ǥ,y��ǥ);
		b.setSize(100,20);//��ư ������
		add(b);//���̱�,���ϸ� �ȳ���
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NoneLayout();
		
	}

}
