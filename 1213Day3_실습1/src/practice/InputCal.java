/*
 * 1.���ڸ� �ΰ� �Է� �ް� 
�μ��� ���� ���� ����ϼ���.  
2.���ڸ� �ΰ� �Է� �ް� 
�μ��� �� ���� ����ϼ���.
3.���ڸ� �ΰ� �Է� �ް� 
�μ��� ���� ���� ����ϼ���.
4.���ڸ� �ΰ� �Է� �ް� 
�μ��� ���� ���� ����ϼ���.
5.���ڸ� �ΰ� �Է� �ް� 
�μ��� ������ ���� ����ϼ���.


6.žũ������ ȸ������ ���α׷� �����
ID : 
PW : 
���� : 
��� : 
���� :
���� : 
�̸��� :
�� �Է¹ް� ����ϼ���.


7. ������ ������ ����� �����ϼ���.
int x = 8;
int y = 3;
int result = x++ + --y - ++x + --x + y++;

System.out.println(result);
[��ó] 3���� ���� ù��° (NCS�ڹ����α׷���&�������α׷���) |�ۼ��� �������
 * 
 * 
 * 
 * 
 */
package practice;

import java.util.Scanner;


public class InputCal {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner joinSc = new Scanner(System.in);
		
		int a, b = 0;
		 String i ="1.���ڸ� �ΰ� �Է� �ް� �μ��� ���� ���� ����ϼ���.";  
		 String j ="2.���ڸ� �ΰ� �Է� �ް� �μ��� �� ���� ����ϼ���.";
		 String k ="3.���ڸ� �ΰ� �Է� �ް� �μ��� ���� ���� ����ϼ���.";
		 String l ="4.���ڸ� �ΰ� �Է� �ް� �μ��� ���� ���� ����ϼ���.";
		 String m ="5.���ڸ� �ΰ� �Է� �ް� �μ��� ������ ���� ����ϼ���.";
		
		System.out.println("1.���ڸ� �ΰ� �Է� �ް� \r\n" + 
				"�μ��� ���� ���� ����ϼ���. ");
		
		System.out.println("ù��° ���� a �Է�:");
		a = sc.nextInt();
		System.out.println("�ι�° ���� b �Է�:");
		b = sc.nextInt();
		System.out.println("a+b="+(a+b));
		
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(j);
		
		System.out.println("ù��° ���� a �Է�:");
		a = sc.nextInt();
		System.out.println("�ι�° ���� b �Է�:");
		b = sc.nextInt();
		System.out.println("a-b="+(a-b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(k);
		
		System.out.println("ù��° ���� a �Է�:");
		a = sc.nextInt();
		System.out.println("�ι�° ���� b �Է�:");
		b = sc.nextInt();
		System.out.println("a*b="+(a*b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(l);
		
		System.out.println("ù��° ���� a �Է�:");
		a = sc.nextInt();
		System.out.println("�ι�° ���� b �Է�:");
		b = sc.nextInt();
		System.out.println("a/b="+(a/b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(m);
		
		System.out.println("ù��° ���� a �Է�:");
		a = sc.nextInt();
		System.out.println("�ι�° ���� b �Է�:");
		b = sc.nextInt();
		System.out.println("a%b="+(a%b));
		




	String id, pw, gender, hobby, email;
	int age;
	int birth; 
	
	System.out.println("žũ������ ȸ������");
	System.out.println("ID�� �Է��ϼ���:");
	id = joinSc.nextLine();
	
	
	System.out.println("�н����带 �Է��ϼ���:");
	pw = joinSc.nextLine();
	
	System.out.println("������ �Է��ϼ���:");
	gender = joinSc.nextLine();
	
	System.out.println("��̸� �Է��ϼ���:");
    hobby = joinSc.nextLine();
	
    System.out.println("�̸����� �Է��ϼ���:");
	email = joinSc.nextLine();
	
	System.out.println("�ֹι�ȣ ���ڸ��� �Է��ϼ��� �Ǵ� �������,���ڸ� �Է��Ұ� ex) 920X0X: ");
	birth = joinSc.nextInt();
	
	System.out.println("���̸� �Է��ϼ���:");
	age = joinSc.nextInt();
	
	
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("������ �����մϴ�!!");
	System.out.println("");
	System.out.println("ID : "+id);
	System.out.println("�н����� : "+pw);
	System.out.println("���� : "+gender);
	System.out.println("��� : "+hobby);
	System.out.println("email : "+email);
	System.out.println("������� : "+birth);
	System.out.println("���� : "+age+"��");

	
	int x = 8;
	int y = 3;
	
	int result = x++ + --y - ++ x + --x + y++; 
//	x++ == 8 ù��° ���ο��� 8
//	--y == 2    
//	++x == 9  
//	--x == 7  
//	y++ == 3 ù��° ���ο��� 3  
	
	System.out.println(result);
	//���� :8+2-9+7+3=11
	}

}
