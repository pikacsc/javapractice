package �ؽ�Ʈ�ʵ�;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	TextFieldEx(){
		setTitle("�ؽ�Ʈ �ʵ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(new JLabel("�̸� :"));
		add(new JTextField(10));
		add(new JLabel("�а� :"));
		add(new JTextField("xxx ���а�"));
		add(new JLabel("�ּ� :"));
		add(new JTextField("����� ...",20));
		
		
		
		setSize(350, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
