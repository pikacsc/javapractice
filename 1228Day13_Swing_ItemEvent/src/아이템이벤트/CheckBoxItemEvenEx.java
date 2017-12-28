package 아이템이벤트;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEvenEx extends JFrame{
	JCheckBox [] fruits = new JCheckBox[3];
	String [] names = {"사과","배","체리"};
	JLabel sumLabel;
	int sum = 0;
	CheckBoxItemEvenEx() {
		setTitle("체크박스와 ItemEvent 에제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		for(int i=0;i<fruits.length;i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			add(fruits[i]);
			fruits[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					int selected = 1;
					switch(e.getStateChange()) {
					case ItemEvent.SELECTED:
						selected = 1;
						break;
					case ItemEvent.DESELECTED:
						selected = -1;
						break;
					}
					if(e.getItem() == fruits[0]) {
						sum += selected*100;
					}
					else if(e.getItem() == fruits[1]) {
						sum += selected*500;
					}
					else {
						sum += selected*20000;
					}
					sumLabel.setText("현재 "+sum+"원 입니다.");
				}
			});
		}
		setSize(250, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new CheckBoxItemEvenEx();
	}

}
