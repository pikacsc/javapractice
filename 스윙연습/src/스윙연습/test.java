package 스윙연습;

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
		setTitle("4개 클래스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		CurTime = new JLabel("현재시각");
		//좌표 x,y,크기 가로크기 ,세로크기
		CurTime.setBounds(100,100,100,40);
		
		JButton timeBtn = new JButton("외부클래스");
		timeBtn.setBounds(50 ,200,100,30);
		//이벤트리스너
		OutClass al = new OutClass();
		timeBtn.addActionListener(al);
		
		JButton timeBtn2 = new JButton("내부클래스");
		timeBtn2.setBounds(150,200,100,30);
		//이벤트리스너
		InnerClass il = new InnerClass();
		timeBtn2.addActionListener(il);
		
		
		
		JButton timeBtn3 = new JButton("익명클래스");
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
		
		
		
		
		
		JButton timeBtn4 = new JButton("메인클래스");
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
