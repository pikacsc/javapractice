package exma_2;

public class Operator_5 {

	public static void main(String[] args) {
		//�� ������
		
		//   ||  :   �Ǵ�    or   (a==2) || (a==10) ���� a�� 2�� ���ų� 10�� ����

		//   &&  : �׸���    and   (a>2) && (a<10) ���� a�� 2�ʰ�  10�̸�
		
		//   !   :  ~�ƴϴ�         !(a==2)  ���� a�� ���� 2�� �ƴϴ�.
		
		int a = 10, b = 10;
		
		System.out.println("(a==10)&&(b==5) : "+((a==10)&&(b==5)));
		//a�� 10�̰� b�� 5�̴�
		
		System.out.println("(a==10)||(b==5) : "+((a==10)||(b==5)));
		//a�� 10�̰ų� b�� 5�̴�
		
		System.out.println("!(a==10) : "+( !(a==10) ));
		// ���� �� ���� 10�� �ƴϴ�
		
		
		
		
	}

}
