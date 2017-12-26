package �����̺�Ʈ;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {
	
	InnerClassListener() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		//�׼�Ŭ���� ��ü
		MyActionListener listener = new MyActionListener();
		
		
		//������ �ٿ��ִ� �Լ�
		btn.addActionListener(listener);
		add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	//���η� �ű�, ����Ŭ����
	class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();//�ٿ�ĳ����
		if(b.getText().equals("Action")) {      //b.getTest() ��ư�� ���� ��������
			b.setText("�׼�");
		} else {
			b.setText("Action");
		}
	}
}
	
	
	
	public static void main(String[] args) {
		new InnerClassListener();
		
	}

}
