package �������̺�Ʈ;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame{
	
	RadioButtonEx() {
		setTitle("���� ��ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("image/cherry.jpg");
		ImageIcon SelectCherryIcon = new ImageIcon("image/selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��");
		JRadioButton cherry = new JRadioButton("ü��", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(SelectCherryIcon);
		
		
		JRadioButton btns[] = {apple,pear,cherry};
		
		for(int i =0 ; i<btns.length;i++) {
			g.add(btns[i]);
			add(btns[i]);
		}
				
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
