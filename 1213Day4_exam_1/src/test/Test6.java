package test;

import java.util.Scanner;

public class Test6 {
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
		String result;
		int numb= 0;
		System.out.print("���ڸ� �Է��ϼ���:");
		numb = sc.nextInt();
		
		
		result = (numb%2==0)? "¦�Դϴ� true":"Ȧ�Դϴ� false";
		
		System.out.println(result);
	}

}
