package 스윙이벤트;

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
		//마우스가 버튼안쪽에 들어가질때
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.red);
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//마우스가 버튼 안쪽에 있다가 나올때
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
		setTitle("버튼에 Mouse이벤트 리스너를 작성");
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.yellow);
		
		//이벤트 붙이기
		MyMouseListener Listener = new MyMouseListener();
		
		//마우스 이벤트를 버튼이 동작할때 이벤트 동작
		btn.addMouseListener(Listener);
		
		
		add(btn);
		
		setSize(300, 200);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new MouseEx();
	}

}
