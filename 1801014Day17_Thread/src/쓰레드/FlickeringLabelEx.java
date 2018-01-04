package ������;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{

	public FlickeringLabel(String text) {
		super(text); //JLabel ������ ȣ��
		setOpaque(true);
		
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if(n==0) 
				setBackground(Color.yellow);
	
			else {
				setBackground(Color.green);
			}
			if(n==0) n=1;
			else n =0;
			
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
	
}


public class FlickeringLabelEx extends JFrame{
	
	public FlickeringLabelEx() {
		setTitle("������ ���� ������Ȱ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		//�����̴� ���̺� ����
		FlickeringLabel fLabel = new FlickeringLabel("����");
		
		//�������� �ʴ� ���̺�
		JLabel label = new JLabel("�ȱ���");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����");
		
		add(fLabel);
		add(label);
		add(fLabel2);
		setSize(300,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}
