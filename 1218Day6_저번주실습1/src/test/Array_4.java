package test;

import java.util.Scanner;

public class Array_4 {
	public static void main(String[] args) {
		//ȸ�������� ���ڿ� �迭�� �Է¹ް� ����غ�����. �̸�, �ּ�, ����, ����
		String info[] = new String[4];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� :");
		info[0] = sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ��� :");
		info[1] = sc.nextLine();
		System.out.print("������ �Է��ϼ��� :");
		info[2] = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� :");
		info[3] = sc.nextLine();
		
		
		System.out.println("�̸�"+info[0]);
		System.out.println("�ּ�"+info[1]);
		System.out.println("����"+info[2]);
		System.out.println("����"+info[3]);
		
	}
}
