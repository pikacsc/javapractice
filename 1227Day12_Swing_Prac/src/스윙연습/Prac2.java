package 스윙연습;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Prac2 extends JFrame{

	Prac2(){
		Calendar now = Calendar.getInstance(); //Calendar 객체생성법
		setTitle("현재시간 구하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
									//HOUR_OF_DAY 0~24시표기법
		System.out.println(hour);
		
		JLabel jl = new JLabel();
		jl.setBounds(100, 100, 100, 30);
		if(hour>=0 && hour<12) {
			jl.setText("오전이다.");
		} else if(hour>=12 && hour<19) {
			jl.setText("오후입니다.");
		} else if(hour>18) {
			jl.setText("저녁입니다.");
		} else {
			jl.setText("모르겠다.");
		}
		
		add(jl);
		setSize(400, 400);
		setResizable(false);//창크기 고정
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Prac2();
		
	}

}
