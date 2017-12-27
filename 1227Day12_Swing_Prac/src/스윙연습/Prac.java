package ��������;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



class OutClass implements ActionListener{
	JLabel curTime;
	OutClass(JLabel curTime){
		this.curTime = curTime;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		curTime.setText(hour+":"+minute+":"+second);
	}
	
}


public class Prac extends  JFrame implements ActionListener {

	JLabel curTime;
	
	
	Prac() {
		setTitle("4�� Ŭ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	
		curTime = new JLabel("����ð�");
		
				//setBounds(x,y,����ũ��,����ũ��)
		curTime.setBounds(100,100,100,40);
		
		int btnSizeH=100;
		JButton timeBtn = new JButton("�ܺ�Ŭ����");
		timeBtn.setBounds(50,200,btnSizeH,30);
		//�̺�Ʈ ������
		OutClass our = new OutClass(curTime);
		timeBtn.addActionListener(our);
		
		JButton timeBtn2 = new JButton("����Ŭ����");
		timeBtn2.setBounds(160,200,btnSizeH,30);
		//�̺�Ʈ ������
		
		InnerClass il = new InnerClass();
		timeBtn2.addActionListener(il);
		
		
		

		
		
		
		
		JButton timeBtn3 = new JButton("�͸�Ŭ����");
		timeBtn3.setBounds(250,200,btnSizeH,30);
		
		timeBtn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Calendar now = Calendar.getInstance();
				int hour = now.get(Calendar.HOUR);
				int minute = now.get(Calendar.MINUTE);
				int second = now.get(Calendar.SECOND);
				curTime.setText(hour+":"+minute+":"+second);
				
			}
		});
		
		JButton timeBtn4 = new JButton("����Ŭ����");
		timeBtn4.setBounds(360,200,btnSizeH,30);
		
		
		timeBtn4.addActionListener(this);
		
		add(curTime);
		add(timeBtn);
		add(timeBtn2);
		add(timeBtn3);
		add(timeBtn4);
		
		setSize(500, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Prac();
		
	}
	
	class InnerClass implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Calendar now = Calendar.getInstance();
			int hour = now.get(Calendar.HOUR);
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			curTime.setText(hour+":"+minute+":"+second);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		curTime.setText(hour+":"+minute+":"+second);
		
	}

}
