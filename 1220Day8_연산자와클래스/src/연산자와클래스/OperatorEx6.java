package �����ڿ�Ŭ����;

import java.util.Scanner;

public class OperatorEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		
		
		System.out.println("���ڸ� �ϳ� �Է��ϼ���.>");
		
		String input = sc.nextLine();
		ch = input.charAt(0); //�Էµ� ���ڿ����� 0��° ���� ��������
			
		System.out.printf("���� : %c", ch);
	}

}
