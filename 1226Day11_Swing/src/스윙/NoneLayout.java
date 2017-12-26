package 스윙;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NoneLayout extends JFrame {

	public NoneLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("레이아웃 임의 설정");
		
		//오픈캡쳐로 좌표를 잡음85x42
		setLayout(null);
		
		//85x20
		JLabel l = new JLabel("나는");
		l.setLocation(85,20); //좌표
		l.setSize(50,20); //사이즈
//		l.setBounds(85,20,50,20);  setLocation+setSize 동시에 쓸수 있음,l.setBounds(x,y,버튼가로크기,버튼세로크기);
		add(l);
		
		
		JButton b = new JButton("몰라");
		b.setLocation(85,42); //버튼.setLocation(x좌표,y좌표);
		b.setSize(100,20);//버튼 사이즈
		add(b);//붙이기,안하면 안나옴
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NoneLayout();
		
	}

}
