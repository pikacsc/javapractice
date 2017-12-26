package 스윙이벤트;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();//다운캐스팅
		if(b.getText().equals("Action")) {      //b.getTest() 버튼의 내용 가져오기
			b.setText("액션");
		} else {
			b.setText("Action");
		}
	}
}



public class ListenerSample extends JFrame {
	
	public ListenerSample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		//액션클래스 객체
		MyActionListener listener = new MyActionListener();
		
		
		//리스너 붙여주는 함수
		btn.addActionListener(listener);
		add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new ListenerSample();
	}
}

