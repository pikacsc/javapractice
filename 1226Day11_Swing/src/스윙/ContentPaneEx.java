package 스윙;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		setTitle("컨텐트펜");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X버튼 누를시 안전하게 종료,메모리 누수를 막기위해서
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("확인"));
		contentPane.add(new JButton("취소"));
		contentPane.add(new JButton("무시"));
		setSize(400, 400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ContentPaneEx();
		
	}

}
