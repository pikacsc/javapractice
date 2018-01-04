package 쓰레드;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {

	JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n = 0;
		while(true) {
			if(n==20) {
				timerLabel.setText("Stop");
				break;
			}
			else {
				timerLabel.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					return;
				}
			}
		}
	}
	
}




public class RunnableTimerEx extends JFrame{
	public RunnableTimerEx() {
		setTitle("RunnableTimerEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		add(timerLabel);
		setSize(300, 150);
		setVisible(true);
		th.start();
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}

}
