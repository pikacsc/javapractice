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

//�귣�帮��Ʈ ������ư
//


//

//ī��� ����Ʈ ������ư
// cardListPrint(x):
// return {1: "����ī��",
// 2: "����ī��",
// 3: "��ȯī��",
// 4: "�Ｚī��",
// 5: "�Ե�ī��",
// 6: "����ī��",
// 7: "��Ƽī��",
// 8: "�ϳ�ī��",
// 9: "�츮ī��",
// 10: "����ī��",
// 11: "BC �۷ι�ī��",
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
//1.��ǰ���� �Է�
//2.�귣�� ����
//3.ī��� ����
//4.ȯ�� ����
//5.����ư Ŭ��
//6.������
class BrandPart extends JPanel{
BrandPart(){
setLayout(new GridLayout(10, 1));
add(new JLabel("�귣�� ����"));
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
JRadioButton etc = new JRadioButton("��Ÿ");
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
add(new JLabel("ī��� ����"));
JRadioButton shin = new JRadioButton("����ī��");
JRadioButton hyon = new JRadioButton("����ī��");
JRadioButton keb = new JRadioButton("��ȯī��");
JRadioButton sam = new JRadioButton("�Ｚī��");
JRadioButton lotte = new JRadioButton("�Ե�ī��");
JRadioButton kook = new JRadioButton("����ī��");
JRadioButton city = new JRadioButton("��Ƽī��");
JRadioButton hana = new JRadioButton("�ϳ�ī��");
JRadioButton woori = new JRadioButton("�츮ī��");
JRadioButton nong = new JRadioButton("����ī��");
JRadioButton bc = new JRadioButton("BC �۷ι�ī��");
JRadioButton etc = new JRadioButton("��Ÿ");

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
add(new JLabel("ȯ�� ����"));
JRadioButton usd = new JRadioButton("USD");
JRadioButton jpy = new JRadioButton("JPY");
JRadioButton eur = new JRadioButton("EURO");
JRadioButton etc = new JRadioButton("��Ÿ");
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
inputPanel.add(new JLabel("��ǰ���� �Է�"));
inputPanel.add(input);
inputPanel.add(new JLabel("$"));
add(inputPanel,BorderLayout.NORTH);

	JButton activateCal = new JButton("���");
	add(activateCal,BorderLayout.CENTER);
	String goodPrice = "csc";
	JPanel outPanel = new JPanel();
	add(new JLabel(goodPrice));
//	add(new JLabel(selectBrand));
//	add(new JLabel(selectCard));
//	add(new JLabel(brandCommission));
//	add(new JLabel(�귣���������));
//	add(new JLabel(ȯ�ŵ���));
//	add(new JLabel(ī����������));
//	add(new JLabel(ī��������));
//	add(new JLabel(beforeCardCommission));
//	add(new JLabel(finalResult));
//	add(new JLabel(�������հ�));

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