package 학사관리프로그램;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


class MyDialog extends JDialog{
	JTextField idText = new JTextField(10);
	JButton okBtn = new JButton("확인");
	
	public MyDialog() {
		setLayout(new FlowLayout());
		add(idText);
		add(okBtn);
		
		okBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		setSize(200,300);
	}
}






public class Student extends JPanel{
	
	JTextField name; //이름
	JTextField dept; //학과
	JTextField id; //아이디
	JTextField address; //주소
	JTextField search; //검색
	JTextField list; //학생목록
	JButton selectBtn; //조회
	JButton insertBtn; //입력
	JButton updateBtn; //수정
	JButton deleteBtn; //삭제
	JButton idCheckBtn; //학번중복체크
	MyDialog dialog = new MyDialog();
	
	Student(){
		
		add(new JLabel("이름"));
		name = new JTextField(20);
		add(name);//이름 textfield추가
		
		add(new JLabel("학과"));
		dept = new JTextField(20);
		add(dept);//학과 textfield추가

		add(new JLabel("학번"));
		id = new JTextField(20);
		add(id);//학번 textfield추가
		
		idCheckBtn = new JButton("학번중복체크");
		add(idCheckBtn);
		idCheckBtn.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		
		add(new JLabel("주소"));
		address = new JTextField(20);
		add(address);//이름 textfield추가
		
		String colName[] = {"학번","이름","학과"};
		DefaultTableModel model = new DefaultTableModel(colName,0);
		
		JTable table = new JTable(model);
		
		table.setPreferredScrollableViewportSize(new Dimension(250, 200)); //테이블 사이즈 맞춰줌
		add(new JScrollPane(table));
		
		insertBtn = new JButton("입력");
		add(insertBtn);
		
		updateBtn = new JButton("수정");
		add(updateBtn);
		
		deleteBtn = new JButton("삭제");
		add(deleteBtn);
		
		setSize(300,420);
		setVisible(true);
		
		
	}
}
