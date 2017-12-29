package 슬라이더;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class SliderEx extends JFrame{

	SliderEx(){
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100); //JSlider slider = new JSlider(JSlider.가로,슬라이드처음,슬라이드끝,초기값)
		
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		add(slider);
		setSize(300, 100);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new SliderEx();
	}

}
