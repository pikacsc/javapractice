package 스윙연습;

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
		setTitle("4개 클래스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	
		curTime = new JLabel("현재시각");
		
				//setBounds(x,y,가로크기,세로크기)
		curTime.setBounds(100,100,100,40);
		
		int btnSizeH=100;
		JButton timeBtn = new JButton("외부클래스");
		timeBtn.setBounds(50,200,btnSizeH,30);
		//이벤트 리스너
		OutClass our = new OutClass(curTime);
		timeBtn.addActionListener(our);
		
		JButton timeBtn2 = new JButton("내부클래스");
		timeBtn2.setBounds(160,200,btnSizeH,30);
		//이벤트 리스너
		
		InnerClass il = new InnerClass();
		timeBtn2.addActionListener(il);
		
		
		

		
		
		
		
		JButton timeBtn3 = new JButton("익명클래스");
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
		
		JButton timeBtn4 = new JButton("내부클래스");
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
