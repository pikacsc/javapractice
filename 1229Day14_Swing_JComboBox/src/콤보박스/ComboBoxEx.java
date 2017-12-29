package 콤보박스;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame{

	String fruits[] = {"사과","바나나","키위","망고","배","복숭아","베리","딸기","블랙베리"};
	
	String names[] = {"기태","재문","효소","남연"};
	
	ComboBoxEx(){
		setTitle("콤보박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(fruits);
		add(strCombo);
		
		JComboBox nameCombo = new JComboBox(); 
		for(int i=0;i<names.length;i++) {   //for문 방식
			nameCombo.addItem(names[i]);
		}
		nameCombo.addItem("성찬");
		add(nameCombo);
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ComboBoxEx();
	}

}
