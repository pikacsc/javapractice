package ���̺�;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Example extends JFrame{

	public Example() {
		setTitle("���̺���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		String header[] = {"�л��̸�","����","����","����"};
		String contents[][] = {
				{"�ڿ���","90","87","98"},
				{"ȫ�浿","100","37","48"},
				{"�ּ���","30","27","38"},
				{"�̼���","50","67","98"}	
		};
		
		JTable table = new JTable(contents,header);
		JScrollPane scrollpane = new JScrollPane(table);
		
		
		table.setValueAt("200", 1, 1); //���� �ٲٰ� �������� table.setValueAt("��ü�� ��", ��, ��); 
		System.out.println(table.getValueAt(1, 1));  //table.getValueAt(��, ��)
 		
		System.out.println(table.getRowCount());  //���Ǽ�
		System.out.println(table.getColumnCount()); //���Ǽ�
		
		System.out.println(table.getColumnName(0)); //�÷��̸� �������� (header)
		System.out.println(table.getColumnName(1));
		
		
		
		
		add(scrollpane);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Example();
	}

}
