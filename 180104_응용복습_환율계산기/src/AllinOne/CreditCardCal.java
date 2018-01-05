package AllinOne;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//브랜드리스트 라디오버튼
//


//

//카드사 리스트 라디오버튼
// cardListPrint(x):
// return {1: "신한카드",
// 2: "현대카드",
// 3: "외환카드",
// 4: "삼성카드",
// 5: "롯데카드",
// 6: "국민카드",
// 7: "씨티카드",
// 8: "하나카드",
// 9: "우리카드",
// 10: "농협카드",
// 11: "BC 글로벌카드",
// 12: "ETC"}.get(x, "No data")
//
// return {1: 0.0018,
// 2: 0.0018,
// 3: 0.002,
// 4: 0.002,
// 5: 0.002,
// 6: 0.0025,
// 7: 0.0025,
// 8: 0.003,
// 9: 0.0035,
// 10: 0.0035,
// 11: 0.0035,
// 12: 0.005}.get(x, "No data")
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

class KoreanCardPart extends JPanel {
KoreanCardPart(){
setLayout(new GridLayout(13, 1));
add(new JLabel("카드사 선택"));
JRadioButton shin = new JRadioButton("신한카드");
JRadioButton hyon = new JRadioButton("현대카드");
JRadioButton keb = new JRadioButton("외환카드");
JRadioButton sam = new JRadioButton("삼성카드");
JRadioButton lotte = new JRadioButton("롯데카드");
JRadioButton kook = new JRadioButton("국민카드");
JRadioButton city = new JRadioButton("씨티카드");
JRadioButton hana = new JRadioButton("하나카드");
JRadioButton woori = new JRadioButton("우리카드");
JRadioButton nong = new JRadioButton("농협카드");
JRadioButton bc = new JRadioButton("BC 글로벌카드");
JRadioButton etc = new JRadioButton("기타");

	ButtonGroup g = new ButtonGroup();
	
	JRadioButton cards[] = {shin,hyon,keb,sam,lotte,kook,city,hana,woori,nong,bc,etc};
	for(int i=0;i<cards.length;i++) {
		g.add(cards[i]);
		add(cards[i]);
	}
}
}

class ExchangePart extends JPanel{
ExchangePart(){
setLayout(new GridLayout(5, 1));
add(new JLabel("환율 선택"));
JRadioButton usd = new JRadioButton("USD");
JRadioButton jpy = new JRadioButton("JPY");
JRadioButton eur = new JRadioButton("EURO");
JRadioButton etc = new JRadioButton("기타");
ButtonGroup g = new ButtonGroup();

	JRadioButton exchanges[] = {usd,jpy,eur,etc};
	for(int i=0;i<exchanges.length;i++) {
		g.add(exchanges[i]);
		add(exchanges[i]);
	}
}
}

class Calculation extends JPanel{
public Calculation() {
setLayout(new BorderLayout(20, 20));
JPanel inputPanel = new JPanel();
inputPanel.setLayout(new FlowLayout());
JTextField input = new JTextField(9);
inputPanel.add(new JLabel("상품가격 입력"));
inputPanel.add(input);
inputPanel.add(new JLabel("$"));
add(inputPanel,BorderLayout.NORTH);

	JButton activateCal = new JButton("계산");
	add(activateCal,BorderLayout.CENTER);
	String goodPrice = "csc";
	JPanel outPanel = new JPanel();
	add(new JLabel(goodPrice));
//	add(new JLabel(selectBrand));
//	add(new JLabel(selectCard));
//	add(new JLabel(brandCommission));
//	add(new JLabel(브랜드수수료율));
//	add(new JLabel(환매도율));
//	add(new JLabel(카드사수수료율));
//	add(new JLabel(카드사수수료));
//	add(new JLabel(beforeCardCommission));
//	add(new JLabel(finalResult));
//	add(new JLabel(수수료합계));

}
}

public class CreditCardCal extends JPanel{

public CreditCardCal() {
	setLayout(new GridLayout(1, 4));
	add(new BrandPart());
	add(new KoreanCardPart());
	add(new ExchangePart());
	add(new Calculation());
}
}