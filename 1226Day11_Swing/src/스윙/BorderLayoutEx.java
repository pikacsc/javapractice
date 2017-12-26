package 스윙;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	public BorderLayoutEx() {
		setTitle("BorderLayoutEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(20,30));
		//new BorderLayout(hGap,vGap) ,
		//h(horizontal:수평의)Gap:좌우 두컴포넌트사이의 간격 픽셀 단위
		//v(vertical:수직의)Gap:상하 두컴포넌트 사이의 간격 픽셀단위
		add(new JButton("div"),BorderLayout.WEST);
		add(new JButton("Calculate"),BorderLayout.CENTER);
		add(new JButton("mul"),BorderLayout.EAST);
		add(new JButton("add"),BorderLayout.NORTH);
		add(new JButton("sub"),BorderLayout.SOUTH);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
