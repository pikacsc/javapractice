package ���̺�;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Example2 extends JFrame{

	Example2(){
		setTitle("���̺���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450,400);
		
		String header[] = {"�л��̸�","����","����","����"};
		String contents[][] = {
				{"�ڿ���","90","87","98"},
				{"ȫ�浿","100","37","48"},
				{"�ּ���","30","27","38"},
				{"�̼���","50","67","98"}	
		};
		
		DefaultTableModel model = new DefaultTableModel(contents,header);
		JTable table = new JTable(model);
		JScrollPane scrollpane = new JScrollPane(table);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JTextField nameField = new JTextField(5);
		JTextField subject1 = new JTextField(5);
		JTextField subject2 = new JTextField(5);
		JTextField subject3 = new JTextField(5);
		
		panel.add(nameField);
		panel.add(subject1);
		panel.add(subject2);
		panel.add(subject3);
		
		JButton addBtn = new JButton("�߰�");
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String inputStr[] = new String[4];
				
				inputStr[0] = nameField.getText();
				inputStr[1] = subject1.getText();
				inputStr[2] = subject2.getText();
				inputStr[3] = subject3.getText();
				
				model.addRow(inputStr);
				
				nameField.setText("");
				subject1.setText("");
				subject2.setText("");
				subject2.setText("");
			}
		});
		
		JButton cancelBtn = new JButton("����");
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(table.getSelectedRow()== -1) {
					return;
				} else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		
		panel.add(addBtn);
		panel.add(cancelBtn);
		add(scrollpane,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Example2();
	}

}
