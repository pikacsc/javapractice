package 쓰레드;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
	JLabel timerLabel;
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public void run() {
		int n = 0;
		
		while(n<=21) {
			timerLabel.setText(Integer.toString(n));
			n++;
			if(n==21) {
				timerLabel.setText("Stop!");
				break;
			}else {
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					return;
				}
			}
		}
	}
}


public class ThreadTimerEx extends JFrame{

	public ThreadTimerEx() {
		setTitle("ThreadTimerEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC,80));
		
		TimerThread th = new TimerThread(timerLabel);
		add(timerLabel);
		
		setSize(300, 150);
		setVisible(true);
		
		th.start();
	}
	
	
	public static void main(String[] args) {
		new ThreadTimerEx();
	}

}
