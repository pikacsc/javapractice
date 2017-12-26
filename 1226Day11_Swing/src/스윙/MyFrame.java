package 스윙;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame(){
		setTitle("첫 GUI프로그램"); //윈도우의 제목
		setSize(800, 600); //윈도우 사이즈
		setVisible(true); //윈도우 보여주기
	}
	
	
	
	
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		
	}

}
