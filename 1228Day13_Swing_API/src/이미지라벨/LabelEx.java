package 이미지라벨;

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
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다.");
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");//이미지 불러오기
		JLabel imageLabel = new JLabel(beauty);
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		JLabel Label2 = new JLabel("보고싶으면 전화하세요", normalIcon,SwingConstants.CENTER); //SwingConstants.CENTER 중앙정렬

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
