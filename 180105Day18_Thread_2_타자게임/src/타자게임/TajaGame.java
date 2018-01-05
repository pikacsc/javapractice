package 타자게임;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class GameThread extends Thread{
	Container contentPane;
	String ex[] = {"안녕","메롱","자바","후후","hungry","apple","child","sql","롯데","갤럭시","정규직","일자리","플레이스테이션"};
	
	public static JLabel label[] = new JLabel[20];
	
	int x = 0;
	int y = 0;
	boolean flag = false;
	
	
	
	public GameThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	void finish() {
		flag = true;
	}
	
	public void run() {
		int n = 0;
		long time1 = System.currentTimeMillis();   //0.001초  System.currentTimeMillis(1000) 경우 1초
		
		while(true) {
			long time2 = System.currentTimeMillis();
			if(time2-time1>3000) { //3초 지난뒤에 들어온다
				time1 = System.currentTimeMillis();
				int x = ((int)(Math.random()*contentPane.getWidth()));
				label[n] = new JLabel(ex[n]);
				label[n].setLocation(x, 10);
				label[n].setSize(80,30);
				n++;
				if(n>20) {
					n = 0;
				}
			}
			
			for(int i = 0;i<20;i++) {
				if(Objects.nonNull(label[i])) {
					if(label[i].getY()==350) {
						label[i].setSize(142,200);
						label[i].setIcon(new ImageIcon("image/Explode_fire.gif"));
						if(label[i].getY()==400) label[i].setVisible(false);
					}
					label[i].setLocation(label[i].getX(),label[i].getY()+10);
					label[i].setSize(80,30);
					contentPane.add(label[i]);
				} 
			}
			
			try {
				Thread.sleep(300); //0.3초 잠을 자라
				contentPane.repaint();
				if(flag == true) {
					return;
				}
				
			}catch(InterruptedException e) {
				return;
			}
			
			
		}
		
	}
	
}




public class TajaGame extends JFrame{
	GameThread th;
	JTextField tf = new JTextField();
	int scoreNum = 0;
	public TajaGame() {
		setTitle("한뫼타자게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel score = new JLabel();
		score.setBounds(600, 5, 100, 100);
		score.setFont(new Font("Gothic", Font.ITALIC, 30));
		score.setText("점수");
		
		tf.setBounds(400, 500, 100, 50);
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(tf.getText().equals("종료")){
					th.finish();
					return;
				}
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					for(int i =0;i<10;i++) {
						String strla = GameThread.label[i].getText();
						if(strla.equals(tf.getText())) {
							GameThread.label[i].setIcon(new ImageIcon("image/Explode_fire.gif"));
							scoreNum += 1;
							score.setText(scoreNum+"점");
							if(GameThread.label[i].isVisible()==true) {
								GameThread.label[i].setVisible(false);
								tf.setText("");
								return;
							}
						}
						
					}
				}
				
			}
		});
		add(tf);
		add(score);
		setSize(800,600);		
		setVisible(true);
		
		th = new GameThread(c);
		th.start();
	}
	
	public static void main(String[] args) {
		new TajaGame();
		
	}

}
