package 다이얼로그;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog extends JDialog {
	JTextField tf = new JTextField(10);
	JButton okButton = new JButton("OK");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame,title,true); // 모달 다이얼로그로 설정
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200,100);
		
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
	
	String getInput() {
		if(tf.getText().length() == 0) return null;
		else return tf.getText();
	}
}


public class DialogEx2 extends JFrame {
	MyModalDialog dialog = new MyModalDialog(this, "Test Modal Dialog");
	
	public DialogEx2() {
		super("DialogEx2 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				//모달 다이얼로그 이므로 setVisible() 메소드는
				//다이얼로그가 닫힐때까지 리턴하지 않는다
				String text = dialog.getInput();
				if(text == null) return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text);
			}
		});
		add(btn);
		setSize(250,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DialogEx2();
	}

}
