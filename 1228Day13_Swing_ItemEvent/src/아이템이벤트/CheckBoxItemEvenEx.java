package �������̺�Ʈ;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEvenEx extends JFrame{
	JCheckBox [] fruits = new JCheckBox[3];
	String [] names = {"���","��","ü��"};
	JLabel sumLabel;
	int sum = 0;
	CheckBoxItemEvenEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
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
					sumLabel.setText("���� "+sum+"�� �Դϴ�.");
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
