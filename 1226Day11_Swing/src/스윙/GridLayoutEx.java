package 스윙;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	GridLayoutEx(){
		setTitle("그리드 레이아웃");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 3,20,20));
	//	setLayout(new GridLayout(격자의 행,격자의 열,hGap,vGap));
		add(new JButton("1"));     
		add(new JButton("2"));
		add(new JButton("3")); //0번째행 마지막열
		add(new JButton("4")); //다음행에서 배치됨
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("*"));
		add(new JButton("0"));
		setSize(500, 600);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
