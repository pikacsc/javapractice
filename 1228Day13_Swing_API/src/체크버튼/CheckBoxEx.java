package 체크버튼;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame{

	CheckBoxEx(){
		setTitle("체크 박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images3/cherry.jpg");
		ImageIcon selectCherryIcon = new ImageIcon("images3/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과"); // default 체크 안된 상태
		JCheckBox pear = new JCheckBox("배",true); //체크된 상태
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		cherry.setBorderPainted(true); //버튼입체감
		cherry.setSelectedIcon(selectCherryIcon);
		
		add(apple);
		add(pear);
		add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
		
	}

}
