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
	
	void �ζ�() {
		int lottoNumb = (int)(Math.random()*45)+0;
		print(lottoNumb)
	}
	
	void print() {
		System.out.printf("ù��° ��÷��ȣ %d \n",lottoNumb);

		System.out.printf("�ι�° ��÷��ȣ %d \n",lottoNumb);

		System.out.printf("����° ��÷��ȣ %d \n",lottoNumb);

		System.out.printf("�׹�° ��÷��ȣ %d \n",lottoNumb);

		System.out.printf("�ټ���° ��÷��ȣ %d \n",lottoNumb);

		System.out.printf("������° ��÷��ȣ %d \n",lottoNumb);
	}

}
