package ���콺���ڿ��̵�;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx extends JFrame{
	JLabel la;//�������,�ʵ�
	
	
	MouseListenerEx() {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���콺�̺�Ʈ ����");
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MyMouseAdapter());
		
		la = new JLabel("hello");
		la.setSize(50,20);
		la.setLocation(30, 30);
		contentPane.add(la);
		
		setSize(200, 200);
		setVisible(true);
		
	}
	
	class MyMouseAdapter extends MouseAdapter{// �������̽� ��İ� �޸� ���ϴ� �޼ҵ常 ��� ��� ����
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
	}
	
	
	
	
	
	
//	class MyMouseListener implements MouseListener{
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//			//���콺 ��������
//			int x = e.getX();
//			int y = e.getY();
//			la.setLocation(x, y);
//			
//			
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
//	
	
	public static void main(String[] args) {
		new MouseListenerEx();
		
	}

}
