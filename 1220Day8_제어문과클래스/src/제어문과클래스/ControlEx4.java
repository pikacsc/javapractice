package �����Ŭ����;

import java.util.Scanner;

public class ControlEx4 {
	public static void main(String[] args) {
		int user, com;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����(1),����(2),��(3) �߿� �ϳ��� �Է��ϼ���:");
		String tmp = sc.nextLine();
		user = Integer.parseInt(tmp); //���ڿ��� ������ ��ȯ
		
		com = (int)(Math.random()*3)+1; //1,2,3�� �ϳ��� com�� ����
		
		System.out.printf("����� %d �Դϴ�. \n", user);
		System.out.printf("��ǻ�ʹ� %d �Դϴ�. \n", com);
		
		switch(user-com) {
		case 0:
			System.out.println("���׿�");
			break;
		case 1:
		case -2:
			System.out.println("����� �̰���ϴ�");
			break;
		case -1:
		case 2:
			System.out.println("����� �����ϴ�.");
			break;
		
		}
		
		
	}
	void print(int user,int com) {
		if(user==0) 
	}
}
