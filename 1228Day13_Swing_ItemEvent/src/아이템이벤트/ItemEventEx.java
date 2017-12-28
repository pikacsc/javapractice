package 아이템이벤트;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class ItemEventEx extends JFrame{
	Container contentPane;
	JRadioButton[] radio = new JRadioButton[3];
	String []text = {"사과","배","체리"};
	ImageIcon []img = {
			new ImageIcon("image/apple.jpg"),
			new ImageIcon("image/pear.jpg"),
			new ImageIcon("image/cherry2.jpg")
	};
	JLabel imgLabel = new JLabel();	
	ItemEventEx(){
		setTitle("체크박스 이미지변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		
		for(int i = 0;i<radio.length;i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			panel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);
		contentPane.add(panel,BorderLayout.NORTH);
		contentPane.add(imgLabel,BorderLayout.CENTER);
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250,200);
		setVisible(true);
		
		
		
	}
		
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			else if(radio[0].isSelected()) {
				imgLabel.setIcon(img[0]);
			}
			else if(radio[1].isSelected()) {
				imgLabel.setIcon(img[1]);
			}
			else if(radio[2].isSelected()) {
				imgLabel.setIcon(img[2]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		new ItemEventEx();
	}

}
