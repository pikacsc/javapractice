package first;

import java.util.Scanner;

public class exam_4 {

	public static void main(String[] args) {
//		4. ȸ�������� ���ڿ� �迭�� �Է¹ް� ����غ�����.
//		   �̸�,�ּ�,����,����
		Scanner sc = new Scanner(System.in);
		String input;
		String []array = new String[4];
		
		System.out.print("�̸��� �Է��ϼ���:");
		input = sc.nextLine();
		array[0] = input;
		
		System.out.print("�ּҸ� �Է��ϼ���:");
		input = sc.nextLine();
		array[1] = input;
		
		System.out.print("������ �Է��ϼ���:");
		input = sc.nextLine();
		array[2] = input;
		
		System.out.print("���̸� �Է��ϼ���:");
		input = sc.nextLine();
		array[3] = input;
		
		System.out.println("�̸�:"+array[0]);
		System.out.println("�ּ�:"+array[1]);
		System.out.println("����:"+array[2]);
		System.out.println("����:"+array[3]);
					
			
		
	}

}
