package ����API;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingAPIEx extends JFrame{

	Container contentPane;
	JLabel la;
	JButton b1, b2, b3, b4;
	
	SwingAPIEx() {
		setTitle("Swing ���� �޼ҵ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		b1 = new JButton("��ġ�� ũ�� ����");
		b1.addActionListener(new MyButtonListener());
		contentPane.add(b1);
		
		b2 = new JButton("�������");
		b2.setOpaque(true);
		b2.setForeground(Color.magenta);
		b2.setBackground(Color.yellow);
		b2.setFont(new Font("���ü", Font.ITALIC, 20));
		b2.addActionListener(new MyButtonListener());
		contentPane.add(b2);
		
		b3 = new JButton("�۵����� �ʴ� ��ư");
		b3.setEnabled(false);
		b3.addActionListener(new MyButtonListener());
		contentPane.add(b3);
		
		b4 = new JButton("�����/���̱�");
		b4.addActionListener(new MyButtonListener());
		contentPane.add(b4);
		
		setSize(250,200);
		setVisible(true);
		
		
		
	
	}
	
	
	class MyButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if(source == b1) {
				System.out.println("��ư�� ��ġ�� ũ��");
				System.out.printf("��ġ : x= %d , y= %d \n",b1.getX(),b1.getY());
				System.out.printf("ũ�� : %d x %d \n\n",b1.getWidth(),b1.getHeight());
				
				JPanel c = (JPanel)b2.getParent();
				System.out.println("����Ʈ���� ��ġ�� ũ��");
				System.out.printf("��ġ : x= %d , y= %d \n",c.getX(),c.getY());
				System.out.printf("ũ�� : %d x %d \n\n",c.getWidth(),c.getHeight());
				
			}
			else if(source == b2) {
				System.out.printf("��Ʈ = %s \n",b2.getFont());
				System.out.printf("���� = %s \n",b2.getBackground());
				System.out.printf("���ڻ� = %s",b2.getForeground());
				
			}
			else {
				if(b1.isVisible()) {
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
				}else {
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new SwingAPIEx();
		
	}

}
