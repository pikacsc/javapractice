package test;

import java.util.Scanner;

public class Test6 {
	String result;
	
	public static void main(String[]args) {
		/*
		 * �����ϳ��� �Է��� �޾Ƽ� 
		 * ���� �����ڸ� ����ؼ� 
		 * Ȧ���� ¦���� �Ǻ�
		 * ¦�̸� true ¦�Դϴ�
		 * false Ȧ�Դϴ�
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Test6 t6 = new Test6();
		int numb= 0;
		System.out.print("���ڸ� �Է��ϼ���:");
		numb = sc.nextInt();
		t6.numbCheck(numb);
		
//		result = (numb%2==0)? "¦�Դϴ� true":"Ȧ�Դϴ� false";
//		
//      �����		
	}

	
	private String numbCheck(int numb) {
	
		result = (numb%2==0)? (numb>10)?"10���� Ů�ϴ�":"10���� �۽��ϴ�":(numb>10)?"10���� Ů�ϴ�":"10���� �۽��ϴ�";
		
		
		System.out.println(result);
		
		return result;
	}
	
}
