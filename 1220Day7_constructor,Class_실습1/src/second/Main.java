package second;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Member ȫ�浿 = new Member();
		main.input(ȫ�浿);
		ȫ�浿.printData();
	}
	
	void input(Member x) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���:");
		x.name = sc.nextLine();
		
		System.out.print("�ּҸ� �Է��ϼ���:");
		x.address = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���:");
		x.job = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ���:");
		x.age = sc.nextInt();
		
	}
	
	
}
