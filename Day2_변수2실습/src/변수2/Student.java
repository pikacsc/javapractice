package ����2;

import java.util.Scanner;


public class Student {

	public static void main(String[] args) {
		Student std = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("12.12�� �ǽ��� ����");
		System.out.println("1.�ֳ��뺸��");
		System.out.println("2.�ǽ�1");
		System.out.println("3.�ǽ�2");
		
		System.out.println("��ȣ�� �Է��ϼ���");
		
		int inputNumb;
		inputNumb = scan.nextInt();
		switch(inputNumb) {
		
		case 1: std.�ֳ��뺸��();
		break;
		
		case 2: std.�ǽ�1();
		break;
		
		case 3: std.�ǽ�2();
		break;
		}

		
	}
	
	public void mainMenu() {
		

	}
	
    public void �ֳ��뺸��() {
    	
		System.out.println("int a; ���� �����/n"
				+ "\r\n" + 
				"		a = 1;\r\n" + 
				"		System.out.println(a);\r\n" + 
				"		\r\n" + 
				"		a = 10; //a�� ���� 10���� ����, �ڵ����� 1�� �����\r\n" + 
				"		\r\n" + 
				"		System.out.println(a);\r\n" + 
				"		\r\n" + 
				"		System.out.println(\"����� ������ \"+a+\"���Դϴ�\");\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"		String b = \"����� ������\";\r\n" + 
				"		\r\n" + 
				"		System.out.println(b);\r\n" + 
				"		\r\n" + 
				"		b = \"\"; //�ʱ�ȭ\r\n" + 
				"		\r\n" + 
				"		b = \"�� �Դϴ�\";\r\n" + 
				"		\r\n" + 
				"		System.out.println(a+b);\r\n" + 
				"		//���ڿ� ������ �Ҵ��Ͽ� ���\r\n" + 
				"		");

		
	}
	
	public void �ǽ�1() {

		
		System.out.println("/* �ǽ�\r\n" + 
				"		 *\r\n" + 
				"		 * �̸�: ȫ�浿 \r\n" + 
				"		 * ����: 28\r\n" + 
				"		 * Ű : 173.9\r\n" + 
				"		 * ���� : ����\r\n" + 
				"		 * ����: ȸ���\r\n" + 
				"		 *\r\n" + 
				"		 * ������ print �������� ������ �����ϱ�\r\n" + 
				"		 * \r\n" + 
				"		 */\r\n" + 
				"		");
		
		
		String name = "ȫ�浿";
		int age = 28;
		float height = 173.9f;
		String gender = "����";
		String work = "ȸ���";
		
		System.out.println("�̸�: "+ name);
		System.out.println("����: "+ age);
		System.out.println("Ű: "+ height);
		System.out.println("����: "+ gender);
		System.out.println("����: "+ work);
				

	}
	
	public void �ǽ�2() {
	
		/*
		 * �ǽ� 2
		 * 
		 * ���ڿ� ���� �� ����
		 * "Hello"
		 * "Java"
		 * "Nice to meet you"
		 * "Bye"
		 * 
		 * 
		 * ��¹��� ������ ����ؼ� ����ϱ�
		 * 1.Hello Java Nice to meet you bye
		 * 
		 * 2. Hello
		 *    Java
		 *    Nice to meet you
		 *    Bye
		 * 
		 * 
		 * 
		 */
		
		String a,b,c,d;
		a ="Hello ";
		b ="Java ";
		c ="Nice to meet you";
		d ="bye";
		
		System.out.println("1."+ a + b + c + d);
		System.out.println("");
		System.out.println("2."+a);
		System.out.println("  "+b);
		System.out.println("  "+c);
		System.out.println("  "+d);

	}
	

}
