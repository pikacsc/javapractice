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
		
		System.out.print("ù��° ���� a �Է�:"); //println : ����ѵ� ����, print : ��¸��ϰ� ������ ���� ����
		a = sc.nextInt();
		System.out.print("�ι�° ���� b �Է�:");
		b = sc.nextInt();
		System.out.println("a+b="+(a+b));
		
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(j);
		
		System.out.print("ù��° ���� a �Է�:");
		a = sc.nextInt();
		System.out.print("�ι�° ���� b �Է�:");
		b = sc.nextInt();
		System.out.println("a-b="+(a-b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(k);
		
		System.out.print("ù��° ���� a �Է�:");
		a = sc.nextInt();
		System.out.print("�ι�° ���� b �Է�:");
		b = sc.nextInt();
		System.out.println("a*b="+(a*b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(l);
		
		System.out.print("ù��° ���� a �Է�:");
		a = sc.nextInt();
		System.out.print("�ι�° ���� b �Է�:");
		b = sc.nextInt();
		System.out.println("a/b="+(a/b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(m);
		
		System.out.print("ù��° ���� a �Է�:");
		a = sc.nextInt();
		System.out.print("�ι�° ���� b �Է�:");
		b = sc.nextInt();
		System.out.println("a%b="+(a%b));
		




	String id, pw, gender, hobby, email;
	String age;
	String birth; 
	
	/*
	 * **�߰��� ��� ���� , �߿���
	 * 
	 * Casting ������ data type��
	 * byte<short<int<long<float<double
	 * char
	 * 
	 * 
	 * 
	 * String �� Ŭ����, �������� �̹Ƿ� Casting�� �ȵ�
	 * Integer.parseInt(String) �� ����ؼ� ����ȯ �ؾߵ�
	 * 
	 */
	
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("žũ������ ȸ������");
	System.out.print("ID�� �Է��ϼ���:");
	id = joinSc.nextLine();
	
	
	System.out.print("�н����带 �Է��ϼ���:");
	pw = joinSc.nextLine();
	
	System.out.print("������ �Է��ϼ���:");
	gender = joinSc.nextLine();
	
	System.out.print("��̸� �Է��ϼ���:");
    hobby = joinSc.nextLine();
	
    
	System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ��� �Ǵ� �������,���ڸ� �Է��Ұ� ex) 920X0X: ");
	birth = joinSc.nextLine();
	int ageNumb = Integer.parseInt(birth);
	
	System.out.print("���̸� �Է��ϼ���:");
	age = joinSc.nextLine();
	int birthNumb = Integer.parseInt(age);
	
	System.out.print("�̸����� �Է��ϼ���:");
	email = joinSc.nextLine();
	
	
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
	System.out.println("������� : "+birthNumb);
	System.out.println("���� : "+ageNumb+"��");

	
	int x = 8;
	int y = 3;
	     
	int result = x++ + --y - ++x + --x + y++; 
//	x++ == 8 ù��° ���ο��� 8
//	--y == 2    
//	++x == 9  
//	--x == 7  
//	y++ == 3 ù��° ���ο��� 3  
	
/*  
 * ����: x++,x-- ���������ڴ� ù��° ���ο��� ����Ҷ� x����  ��µǰ� x++ +2  �̸� ù��° ���ο����� x+2�� ���� �ι�° ���ο����� x+1+2 �� ����
 * �Ǵ� ������ x++ + --y - ++x ó�� ����° �׿� �ѹ��� �����Ҷ� x�� ���� �տ��� +1�� ��ä��(9����) ++�� ����Ǽ� 8 + 2 - 10 ==0 �̵ȴ�
 * 	--x + y++ �� x�� ���� 9�� ���¿��� -1 == 8�̵ǰ�  y++ �� 3+1(+1�� �����׿��� y�� ���ö�) ��� 3  , 8+3==11�� �������̵ȴ�
 * 
 *  �Ǵ� ���Ͱ��� result �� ���
 *    
 *    x++  
 *  + --y 
 *  - ++x  
 *  + --x 
 *  + y++;
 *  
 *  ó��  �����Ѵ�
 */
	
	
	
	
	
	System.out.println(result);
	//���� :8+2-9+7+3=11
	}

}
