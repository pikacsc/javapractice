package �����Ŭ����;

public class ControlEx2 {

	public static void main(String[] args) {
		//�������� ������ ��
		ControlEx2 c2 = new ControlEx2();
		int com = (int)(Math.random()*3)+1; //1~2
		
		//int com = (int)(Math.random()*y)+x; //x~y ���� �����߿� ��������
		
		
		c2.�ζ�();
		c2.print();
		
	}
	
	int �ζ�() {
		int lottoNumb = (int)(Math.random()*45)+0;
		return lottoNumb;
	}
	
	void print() {
		for(int i=1;i<7;i++) {
			System.out.printf("%d��° ��÷��ȣ %d \n",i,lottoNumb);
		}
	}

}
