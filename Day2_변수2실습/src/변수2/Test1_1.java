package ����2;
/*
 * 1. JVM�� �����Ͻÿ�.
Java ������ ���������� ���ְ� class ���Ϸ� ������ ���ִ� ���α׷�, �ü���� �´� ������ JVM�� �����Ͽ�
�ü���� �´� JVM�� ������ � �ü���� ������� Java������ ���� ��ų�� ����




2. main�Լ��� public Ű���忡 ���� �����Ͻÿ�.
����������




3. main�Լ���  static �� ���� ������ �Ͻÿ�.
�޸𸮿� �׻� ���ֽ�Ų�ٴ� ����



4. int a = 100; �� ���ͷ��� ���� �ΰ�?
100




5. �ڹٿ��� 12��� ���ڸ� 8������ ǥ���ϴ� ����� �����Ͻÿ�.
012




6. 1����Ʈ (-128~127)���̿��� ���̴� ������ �ڷ�����?
byte




7. �Ʒ��� ���� �ڵ� �غ��� �� ����� �׷��� �Ǵ��� �����Ͻÿ�.

  String a = 10 + 7 + "";

  String b = 8 + "" + 2; 

  String c = "" + 5 + 2; 

  

  System.out.println(a); 

  System.out.println(b); 

  System.out.println(c); 

 17
 82
 52


 */



public class Test1_1 {

	public static void main(String[] args) {


		  String y = 10 + 7 + "";

		  String k = 8 + "" + 2; 

		  String l = "" + 5 + 2; 

		  

		  System.out.println(y); 

		  System.out.println(k); 

		  System.out.println(l); 

		  byte a = 10;
		  byte b = 30;
		  int c = a*b;
		  

		  float e = 0.101f;
		  float f = 0.899f;
		  

		  System.out.println(c);
		  
		  
		  
//		  NO |      �� ǰ ��         |  �ܰ�   | ���� | ���� | ������  | ��� |
//		  1  | ���)�����佺200  |  200 | 1  | 0  |   200  |       |
		  
		  
		  byte NO = 1;
		  String ��ǰ�� ="���)�����佺200";
		  int �ܰ� = 200;
		  int ���� = 0;
		  int ���� = 1;
		  int ������ = 200;
		  String ��� = "";

		  System.out.println("|  NO  |      �� ǰ ��         |  �ܰ�   | ���� | ���� | ������  | ��� |");
		  System.out.println("|  "+NO+"   |  "+��ǰ��+" |  "+�ܰ�+" |  "+����+" |  "+����+" |  "+������+" |  "+���+"  |");
		  

		  
		  

	}

}
