package ��������;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Prac2 extends JFrame{

	Prac2(){
		Calendar now = Calendar.getInstance(); //Calendar ��ü������
		setTitle("����ð� ���ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
									//HOUR_OF_DAY 0~24��ǥ���
		System.out.println(hour);
		
		JLabel jl = new JLabel();
		jl.setBounds(100, 100, 100, 30);
		if(hour>=0 && hour<12) {
			jl.setText("�����̴�.");
		} else if(hour>=12 && hour<19) {
			jl.setText("�����Դϴ�.");
		} else if(hour>18) {
			jl.setText("�����Դϴ�.");
		} else {
			jl.setText("�𸣰ڴ�.");
		}
		
		add(jl);
		setSize(400, 400);
		setResizable(false);//âũ�� ����
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Prac2();
		
	}

}
