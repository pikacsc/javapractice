package ���̹�;

import java.util.Scanner;

public class Naver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short menuInput;
		
		Naver nav = new Naver();
		System.out.println("���̹��� ���Ű��� ȯ���մϴ�.");
	
		
		Join member = new Join();
		
		System.out.print("�̸��� �Է��ϼ���:");
		member.name = sc.nextLine();
		
		System.out.print("�̸����� �Է��ϼ���:");
		member.email = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���:");
		member.gender = sc.next();
		
		System.out.print("���� �� �� ���⸦ ����Ͽ� �ѹ��� �Է��ϼ���:");
		member.bornyear = sc.nextInt();
		member.bornMonth = sc.nextShort();
		member.bornday = sc.nextShort();
		
		System.out.print("�޴��� ��ȣ�� �Է��ϼ���:");
		member.phone = sc.nextInt();
		
		System.out.println("��й�ȣ�� �Է��ϼ���:");
		member.pw = sc.next();
		
		System.out.println();
		System.out.println();
		System.out.println();
		nav.printData(member);
	}
	
	public void printData(Join x) {
		System.out.printf("�̸��� %s�Դϴ�. \n",x.name);
		System.out.printf("%d�� %d�� %d�ϻ� �Դϴ� \n",x.bornyear,x.bornMonth,x.bornday);
		System.out.printf("�ڵ��� ��ȣ�� 0%d \n",x.phone);
		if(x.gender.equals("����")) {
			System.out.print("������ �����Դϴ�.");
		}else {
			System.out.print("������ �����Դϴ�.");
		}
		System.out.printf("�н������ %s \n",x.pw);
		
	}


}
