package �̹�����;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{

	Container contentPane;
	
	LabelEx(){
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����մϴ�.");
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");//�̹��� �ҷ�����
		JLabel imageLabel = new JLabel(beauty);
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		JLabel Label2 = new JLabel("��������� ��ȭ�ϼ���", normalIcon,SwingConstants.CENTER); //SwingConstants.CENTER �߾�����

		add(textLabel);
		add(imageLabel);
		add(Label2);
		setSize(400,600);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {

		new LabelEx();
		
	}

}
