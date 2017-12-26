package 스윙이벤트;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestClass extends JFrame {

	TestClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("익명클래스연습");
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		//익명클래스 방식 (많이 쓰임)
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("액션");
				}else {
					b.setText("Action");
				}
				
			}
		});
		
		
		add(btn);
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestClass();
		
	}

}
