package First;

import java.util.Scanner;

public class FruitPrice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String fruit;
		int fruitCount;
		int ��� = 1000;
		int �� = 2000;
		int ���� = 500;
		int �� = 300;
		System.out.println("���, ��, ����, �� �˴ϴ�");
		System.out.print("���ϴ� ������ �Է��ϼ���:");
		fruit = sc.nextLine();	
		switch(fruit) {
		case ("���"):
			System.out.println("1000��!");
			System.out.println("����� �����ϼ̽��ϴ�.");
			System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
			fruitCount = sc.nextInt();
			System.out.println("������ "+fruitCount*���+"�� �Դϴ�.");
			
		break;
		case ("��"):
			System.out.println("2000��!");
			System.out.println("�踦 �����ϼ̽��ϴ�.");
			System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
			fruitCount = sc.nextInt();
			System.out.println("������ "+fruitCount*��+"�� �Դϴ�.");
			
		break;
		case ("����"):
			System.out.println("500��!");
			System.out.println("���⸦ �����ϼ̽��ϴ�");
			System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
			fruitCount = sc.nextInt();
			System.out.println("������ "+fruitCount*����+"�� �Դϴ�.");		
		break;
		case ("��"):
			System.out.println("300��!");
			System.out.println("���� �����ϼ̽��ϴ�.");
			System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
			fruitCount = sc.nextInt();
			System.out.println("������ "+fruitCount*��+"�� �Դϴ�.");
		break;
		default:
			System.out.println("�׷����� ����!");
			break;
		}
		
		
	}

}
