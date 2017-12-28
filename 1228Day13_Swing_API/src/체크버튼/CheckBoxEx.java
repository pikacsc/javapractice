package üũ��ư;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame{

	CheckBoxEx(){
		setTitle("üũ �ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images3/cherry.jpg");
		ImageIcon selectCherryIcon = new ImageIcon("images3/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("���"); // default üũ �ȵ� ����
		JCheckBox pear = new JCheckBox("��",true); //üũ�� ����
		JCheckBox cherry = new JCheckBox("ü��",cherryIcon);
		cherry.setBorderPainted(true); //��ư��ü��
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
