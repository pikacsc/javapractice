package �Է�;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		
		//ctrl + shift + O  �ڵ� ��ü import ����Ű 
		Scanner sc = new Scanner(System.in);
		
		int age = 0;

		System.out.println("���̸� �Է��ϼ���");
		
		age = sc.nextInt();
		
		System.out.println("����� ���̴� "+ age + "�� �Դϴ�"); //�Է��� ���ϴ� ��ü�� �����Ƿ� �Է��Ҷ����� �����ڵ�� ���� ����
		
		
		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���:");
		
		String name = sc2.nextLine();
		
		System.out.println("����� �̸��� "+name+" �Դϴ�"); //Line �� ���ڿ��� ����
	}
}
