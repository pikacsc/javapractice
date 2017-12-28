package �̹�����ư;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class ButtonImageEx extends JFrame {

	ButtonImageEx() {
		setTitle("��ư�� ������ �ޱ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout());
		
		ImageIcon normalIcon = new ImageIcon("images2/normalIcon.gif");
		ImageIcon rollOverIcon = new ImageIcon("images2/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images2/pressedIcon.gif");
		
		JButton btn = new JButton("Call~~~",normalIcon);
		btn.setRolloverIcon(rollOverIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setHorizontalAlignment(SwingConstants.LEFT); // ��ư.setHorizontalAlignment(SwingConstants.LEFT)  ,���� ����
		add(btn);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonImageEx();
	}

}
