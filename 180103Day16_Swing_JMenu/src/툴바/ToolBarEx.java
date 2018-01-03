package 툴바;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolBarEx extends JFrame{
	
	public ToolBarEx() {
		setTitle("툴바 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createToolBar();
				
		setSize(400, 200);
		setVisible(true);
	}
	
	void createToolBar() {
		JToolBar toolBar = new JToolBar("메뉴");
		toolBar.setBackground(Color.LIGHT_GRAY);
		JButton newBtn = new JButton("new");
		newBtn.setToolTipText("파일을 생성합니다.");
		toolBar.add(newBtn);
		
		JButton chromeBtn = new JButton(new ImageIcon("image/Chorme.png"));
		chromeBtn.setToolTipText("크롬을 실행합니다.");
		toolBar.add(chromeBtn);
		
		toolBar.addSeparator();
		
		JButton psBtn = new JButton(new ImageIcon("image/Ps.png"));
		psBtn.setToolTipText("플레이스테이션을 실행합니다.");
		toolBar.add(psBtn);
		
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		JComboBox combo = new JComboBox();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		add(toolBar,BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		new ToolBarEx();
	}

}
