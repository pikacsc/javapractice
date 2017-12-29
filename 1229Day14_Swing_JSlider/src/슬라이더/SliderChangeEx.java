package 슬라이더;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeEx extends JFrame{
	
	JLabel colorLabel;
	JSlider []sl = new JSlider[3];
	int r,g,b;
	JPanel center = new JPanel();
	JPanel south = new JPanel();
	SliderChangeEx(){
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		colorLabel = new JLabel("         SLIDER EXAMPLE          ");
		
		for(int i=0;i<sl.length;i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new MyChangeListener());
			center.add(sl[i]);
		}
		south.add(colorLabel);
		
		
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);
		colorLabel.setOpaque(true);
	
		colorLabel.setBackground(new Color(sl[0].getValue(),sl[1].getValue(),sl[2].getValue()));
		add(center,BorderLayout.CENTER);
		add(south,BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			colorLabel.setBackground(new Color(sl[0].getValue(),sl[1].getValue(),sl[2].getValue()));
			r=sl[0].getValue();
			g=sl[1].getValue();
			b=sl[2].getValue();
			colorLabel.setText("R:"+r+" G"+g+" B:"+b);
		}
		
	}

	public static void main(String[] args) {
		new SliderChangeEx();
	}

}
