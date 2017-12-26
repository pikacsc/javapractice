package 스윙;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{

	public NullContainerEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Null Container Sample");
		
		setLayout(null);
		
		JLabel la = new JLabel("Hello,Press Buttons!");
		la.setBounds(130,50,200,20);
		add(la);
		
		for(int i=1;i<=9;i++) {
			JButton b = new JButton(Integer.toString(i));//toString 은 정수를 문자열로
			b.setBounds(i*15,i*15,50,20);
			add(b);
		}
		
		
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NullContainerEx();
		
		
	}

}
