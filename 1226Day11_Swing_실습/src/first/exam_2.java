package first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class exam_2 extends JFrame{
	
	exam_2(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("회원가입");
		setLayout(null);
		JLabel l = new JLabel("정확한 정보를 입력해주세요");
		l.setBounds(0, 0, 500, 15);
		add(l);
		
		
		JLabel l2 = new JLabel("아    이    디");
		l2.setBounds(60, 15, 100, 30);
		add(l2);
		JTextField l3 = new JTextField("");
		l3.setBounds(160, 15, 150, 30);
		add(l3);
		
		JLabel l4 = new JLabel("비  밀  번  호");
		l4.setBounds(60, 45, 100, 30);
		add(l4);
		JTextField l5 = new JTextField("");
		l5.setBounds(160, 45, 150, 30);
		add(l5);
		
		JLabel l6 = new JLabel("비밀번호 확인");
		l6.setBounds(60, 75, 100, 30);
		add(l6);
		JTextField l7 = new JTextField("");
		l7.setBounds(160, 75, 150, 30);
		add(l7);
		
		JLabel l8 = new JLabel("이름");
		l8.setBounds(60, 105, 100, 30);
		add(l8);
		JTextField l9 = new JTextField("");
		l9.setBounds(160, 105, 150, 30);
		add(l9);
		
		JLabel l10 = new JLabel("E-MAIL");
		l10.setBounds(60, 135, 100, 30);
		add(l10);
		JTextField l11 = new JTextField("");
		l11.setBounds(160, 135, 150, 30);
		add(l11);
		
		JLabel l12 = new JLabel("핸 드 폰");
		l12.setBounds(60, 165, 100, 30);
		add(l12);
		JTextField l13 = new JTextField("");
		l13.setBounds(160, 165, 50, 30);
		add(l13);
		JLabel l13f1 = new JLabel("-");
		l13f1.setBounds(190, 165, 20, 30);
		add(l13f1);
		JTextField l13f2 = new JTextField("");
		l13f2.setBounds(230, 165, 50, 30);
		add(l13f2);
		JLabel l13f3 = new JLabel("-");
		l13f3.setBounds(260, 165, 20, 30);
		add(l13f3);
		JTextField l13f4 = new JTextField("");
		l13f4.setBounds(300, 165, 50, 30);
		add(l13f4);
		
		JLabel l14 = new JLabel("주소");
		l14.setBounds(60, 195, 100, 30);
		add(l14);
		JTextField l15 = new JTextField("");
		l15.setBounds(160, 195, 150, 30);
		add(l15);
		JTextField l16 = new JTextField("");
		l16.setBounds(160, 225, 150, 30);
		add(l16);
		
		JButton btn = new JButton("가입하기");
		btn.setBounds(74, 264, 100, 30);
		add(btn);
		JButton btn2 = new JButton("가입취소");
		btn2.setBounds(180, 264, 100, 30);
		add(btn2);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals(""))
				
			}
		} );
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new exam_2();
		
	}

}
