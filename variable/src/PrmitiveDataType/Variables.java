package PrmitiveDataType;
//�⺻�ڷ���


public class Variables {

	public static void main(String[] args) {
		//������ � Ÿ���� �����͸� ���� ������ ���
		int      a;
//    ������ Ÿ��     ������
//		�����ݷ� �� �ݾ��ٰ�
//   ������ �ڽ��� ���� �������� �׹ڽ��� �̸��� ����°��̴�		
		
		
//		  byte  == 1 byte == 8bit  == 2�� 7�� == -128~ 127
//		  short == 2 byte == 16bit == 2�� 15�� == -32768~ 32767
//		  int  == 4 byte == 32bit  == 2�� 31�� == -2147483648~ 21474836647 �뷫 20�� ����
//		  long == 8 byte == 64bit == 2�� 63�� == -9223372036854772808 ~ 9223372036854772807 20��x1��

		
		a = 1; 
          //literal
		
		
		
	   //��¹�
		System.out.println("a�� "+a);
		
		
		
		//���� �Ѱ��� ������ ���� 
		// ���� �Ѱ��̹Ƿ� ��������ǥ, String �ϰ�� ���ڿ� �̹Ƿ� ū����ǥ�� ��
		char b = 'b';
		String c = "abc";
		
		System.out.println(b);
		System.out.println(c);
		
		//float, long �� �ڿ� f �� l �� ����ߵ�
		float pi = 3.14f;
		long ln = 1414141241415151515l;
		
		System.out.println(pi);
		System.out.println(ln);
		
		
		//���� i 10�� ��ڴ�.
		int i = 10;
		int j = i;
		
		System.out.println("i=" + i + "�̰� j�� " + j + "�̴�");
		//println �ȿ�  ""�� �����ϴ� �κ��� �ڵ����� ���ڿ� ó�� �ǰ� �׿ܿ� �������� ���ٶ���  "+ ������ +" ���� �����Ѵ� 
		
		
	}
  
}
