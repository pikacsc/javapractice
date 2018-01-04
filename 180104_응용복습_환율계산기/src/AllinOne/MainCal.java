package AllinOne;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.GroupLayout.Group;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainCal extends JFrame{
	
	class ExchangeView extends JPanel{
		public ExchangeView() {
			setLayout(new GridLayout(3,2));
			JLabel usd = new JLabel(new ImageIcon("images/USD.png"));
			JLabel jpy = new JLabel(new ImageIcon("images/JPY.png"));
			JLabel eur = new JLabel(new ImageIcon("images/EUR.png"));
			JLabel usdShow = new JLabel("200");
			JLabel jpyShow = new JLabel("300");
			JLabel eurShow = new JLabel("400");
			usdShow.setFont(new Font("Gothic", Font.ITALIC,80));
			jpyShow.setFont(new Font("Gothic", Font.ITALIC,80));
			eurShow.setFont(new Font("Gothic", Font.ITALIC,80));
			add(usd);
			add(usdShow);
			add(jpy);
			add(jpyShow);
			add(eur);
			add(eurShow);
		}
	}
	
	public MainCal() {
		setTitle("환율계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		JPanel down = new JPanel();
		add(new ExchangeView());
		add(new CreditCardCal());
		
		setVisible(true);
		setSize(700, 500);
	}
	
	
	
	public static void main(String[] args) {
		new MainCal();
	}

}
