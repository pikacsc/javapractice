package ��������;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class OutClass implements ActionListener{
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		test.CurTime.setText(hour+":"+minute+":"+second);
		
	}
	
}



public class test extends JFrame implements ActionListener{
	public static JLabel CurTime;
	
	test(){
		setTitle("4�� Ŭ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		CurTime = new JLabel("����ð�");
		//��ǥ x,y,ũ�� ����ũ�� ,����ũ��
		CurTime.setBounds(100,100,100,40);
		
		JButton timeBtn = new JButton("�ܺ�Ŭ����");
		timeBtn.setBounds(50 ,200,100,30);
		//�̺�Ʈ������
		OutClass al = new OutClass();
		timeBtn.addActionListener(al);
		
		JButton timeBtn2 = new JButton("����Ŭ����");
		timeBtn2.setBounds(150,200,100,30);
		//�̺�Ʈ������
		InnerClass il = new InnerClass();
		timeBtn2.addActionListener(il);
		
		
		
		JButton timeBtn3 = new JButton("�͸�Ŭ����");
		timeBtn3.setBounds(250,200,100,30);
		
		timeBtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Calendar now = Calendar.getInstance();
				int hour = now.get(Calendar.HOUR);
				int minute = now.get(Calendar.MINUTE);
				int second = now.get(Calendar.SECOND);
				
				CurTime.setText(hour+":"+minute+":"+second);
			}
			
		});
		
		
		
		
		
		JButton timeBtn4 = new JButton("����Ŭ����");
		timeBtn4.setBounds(350,200,100,30);
		
		timeBtn4.addActionListener(this);
		
		
		
		
		add(CurTime);
		add(timeBtn);
		add(timeBtn2);
		add(timeBtn3);
		add(timeBtn4);
		setSize(500,400);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new test();

	}
	

	class InnerClass implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		CurTime.setText(hour+":"+minute+":"+second);
		
	}
	
}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		CurTime.setText(hour+":"+minute+":"+second);
	}
	
	
	

}
