package ����Ʈ������Ʈ;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame{
	String[] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	
	ImageIcon []img = {new ImageIcon("images/icon1.png"),new ImageIcon("images/icon2.png"),new ImageIcon("images/icon3.png"),
			new ImageIcon("images/icon4.png")
	};
	
	
	ListEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("����Ʈ����� ����");
		setLayout(new FlowLayout());
		
		JList strList = new JList(fruits);
		add(strList);  //�׳� ����Ʈ
		
		JList imgList = new JList();
		imgList.setListData(img);
		add(imgList);  //�׳� ����Ʈ
		
		JList scrollList = new JList(fruits);
		add(new JScrollPane(scrollList)); //��ũ������ �߰�
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new ListEx();
	}

}
