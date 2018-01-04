package 쓰레드;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{

	public FlickeringLabel(String text) {
		super(text); //JLabel 생성자 호출
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
		setTitle("깜빡이 예제 쓰레드활용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		//깜빡이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("깜박");
		
		//깜빡이지 않는 레이블
		JLabel label = new JLabel("안깜박");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박");
		
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
