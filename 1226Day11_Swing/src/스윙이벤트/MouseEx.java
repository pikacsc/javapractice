package �����̺�Ʈ;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//���콺�� ��ư���ʿ� ������
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.red);
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//���콺�� ��ư ���ʿ� �ִٰ� ���ö�
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.yellow);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


public class MouseEx extends JFrame {
	
	public MouseEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("��ư�� Mouse�̺�Ʈ �����ʸ� �ۼ�");
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Mouse Event �׽�Ʈ ��ư");
		btn.setBackground(Color.yellow);
		
		//�̺�Ʈ ���̱�
		MyMouseListener Listener = new MyMouseListener();
		
		//���콺 �̺�Ʈ�� ��ư�� �����Ҷ� �̺�Ʈ ����
		btn.addMouseListener(Listener);
		
		
		add(btn);
		
		setSize(300, 200);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new MouseEx();
	}

}
