package 스윙;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridEx extends JFrame{

	public GridEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("그리드레이아웃");
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		grid.setHgap(5);
		setLayout(grid);
		add(new JLabel("이름"));
		add(new JTextField(""));
		add(new JLabel("학번"));
		add(new JTextField(""));
		add(new JLabel("학과"));
		add(new JTextField(""));
		add(new JLabel("과목"));
		add(new JTextField(""));
		setSize(400, 300);  //size는 꼭 나중에 지정,그렇지 않으면 창을 크게 해줘야 보이고 하는 문제가 생김
		
		setVisible(true);
		
	}
		
	public static void main(String[] args) {
		new GridEx();
	}

}
