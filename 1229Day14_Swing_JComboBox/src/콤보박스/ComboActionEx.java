package 콤보박스;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboActionEx extends JFrame {

	String []fruits ={"apple","pear","cherry","banana","kiwi","mango"};
	ImageIcon []img = { new ImageIcon("img/apple.jpg"),new ImageIcon("img/pear.jpg"),new ImageIcon("img/cherry.jpg"),
			new ImageIcon("img/banana.jpg"),new ImageIcon("img/kiwi.jpg"),new ImageIcon("img/mango.jpg")};
	JLabel imgLabel = new JLabel(img[0]);
	ComboActionEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("리스트 만들기 예제");
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		
		JComboBox strCombo = new JComboBox(fruits);
		strCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox j = (JComboBox) e.getSource();
				int index = j.getSelectedIndex();
				imgLabel.setIcon(img[index]);
			}
		});
		panel.add(strCombo);
		
		add(panel,BorderLayout.SOUTH);
		add(imgLabel,BorderLayout.CENTER);
		
		
		setSize(300,300);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboActionEx();
	}

}
