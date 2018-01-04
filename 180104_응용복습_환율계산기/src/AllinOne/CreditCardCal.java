package AllinOne;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//브랜드리스트 라디오버튼
//
//brandList(x):
//    return {1: 0.011,
//            2: 0.01,
//            3: 0.014,
//            4: 0,
//            5: 0,
//            6: 0,
//            7: 0.008,
//            8: 0.01,
//            9: 0.015}.get(x, "No data")

//
    		
    		
   //카드사 리스트 라디오버튼
//    		cardListPrint(x):
//    		    return {1: "신한카드",
//    		            2: "현대카드",
//    		            3: "외환카드",
//    		            4: "삼성카드",
//    		            5: "롯데카드",
//    		            6: "국민카드",
//    		            7: "씨티카드",
//    		            8: "하나카드",
//    		            9: "우리카드",
//    		            10: "농협카드",
//    		            11: "BC 글로벌카드",
//    		            12: "ETC"}.get(x, "No data")
//    		    		
//    		    		return {1: 0.0018,
//    		                2: 0.0018,
//   		                3: 0.002,
//    		                4: 0.002,
//    		                5: 0.002,
//    		                6: 0.0025,
//    		                7: 0.0025,
//    		                8: 0.003,
//    		                9: 0.0035,
//    		                10: 0.0035,
//    		                11: 0.0035,
//    		                12: 0.005}.get(x, "No data")	
//    		    		
//1.상품가격 입력
//2.브랜드 선택
//3.카드사 선택
//4.환율 선택
//5.계산버튼 클릭
//6.계산출력
class BrandPart extends JPanel{
	BrandPart(){
		setLayout(new GridLayout(10, 1));
		add(new JLabel("브랜드 선택"));
		ImageIcon brandImage[] = { new ImageIcon("images/visa.png"),
				new ImageIcon("images/master.png"),
				new ImageIcon("images/amex.png"),
				new ImageIcon("images/jcb.png"),
				new ImageIcon("images/discover.png"),
				new ImageIcon("images/bc global.png"),
				new ImageIcon("images/unionpay.png"),
				new ImageIcon("images/urs.png")
		};
		JRadioButton visa = new JRadioButton("VISA",brandImage[0]);
		JRadioButton master = new JRadioButton("Master",brandImage[1]);
		JRadioButton amex = new JRadioButton("Amex",brandImage[2]);
		JRadioButton jcb = new JRadioButton("JCB",brandImage[3]);
		JRadioButton discover = new JRadioButton("Discover",brandImage[4]);
		JRadioButton bcglobal = new JRadioButton("BC Global",brandImage[5]);
		JRadioButton union = new JRadioButton("UnionPay",brandImage[6]);
		JRadioButton urs = new JRadioButton("URS",brandImage[7]);
		JRadioButton etc = new JRadioButton("기타");
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton brands[] = {visa,master,amex,jcb,discover,bcglobal,union,urs,etc};
		for(int i=0;i<brands.length;i++) {
			g.add(brands[i]);
			brands[i].setBorderPainted(true);
			add(brands[i]);
		}
	}
	
}
public class CreditCardCal extends JPanel{

	public CreditCardCal() {
		setLayout(new GridLayout(1, 4));
		add(new BrandPart(),BorderLayout.WEST);
		add(new JPanel());
		add(new JPanel());
		add(new JPanel());
	}
	
}
	
