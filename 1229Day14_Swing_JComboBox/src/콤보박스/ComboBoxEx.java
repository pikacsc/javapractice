package �޺��ڽ�;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame{

	String fruits[] = {"���","�ٳ���","Ű��","����","��","������","����","����","������"};
	
	String names[] = {"����","�繮","ȿ��","����"};
	
	ComboBoxEx(){
		setTitle("�޺��ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(fruits);
		add(strCombo);
		
		JComboBox nameCombo = new JComboBox(); 
		for(int i=0;i<names.length;i++) {   //for�� ���
			nameCombo.addItem(names[i]);
		}
		nameCombo.addItem("����");
		add(nameCombo);
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ComboBoxEx();
	}

}
