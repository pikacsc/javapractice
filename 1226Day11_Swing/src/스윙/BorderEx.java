package 스윙;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderEx extends JFrame {

	BorderEx(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("보더레이아웃");
		BorderLayout border = new BorderLayout(20,20);
		//setLayout(new BorderLayout()); 인스턴스 이름 생략하고 바로 넣어줄수도 있음
		setLayout(border);
		add(new JButton("add"),border.NORTH);
		add(new JButton("sub"),border.SOUTH);
		add(new JButton("mul"),border.WEST);
		add(new JButton("mdivul"),border.EAST);
		add(new JButton("calculate"),border.CENTER);
		setSize(400,400);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderEx();
	}

}
