package second;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
//		3. ���� �迭�� �̿��ؼ� 'h','e','l','l','o' �� �ʱ�ȭ �ϼ���.
//		 �� �� int�� �迭 5���� ���ڸ� �Է� �޽��ϴ�.
//		 �Է��� ���ڷ� �̾ �޽��ϴ�.
//		 �ϴ�ó�� ����� ���ü� �ְ� �˰����� �ۼ��մϴ�.
//		  ex)
//		���ڴټ����� �Է��ϼ��� : 0 1 2 3 4
//		��� : hello
//		���ڴټ����� �Է��ϼ��� : 2 3 0 1 4
//		��� : llheo 
//		���ڴټ����� �Է��ϼ��� : 4 3 2 1 1
//		��� : ollee
//		[��ó] �ڹ� 5���� �߱� ���� (NCS�ڹ����α׷���&�������α׷���) |�ۼ��� �������
		Scanner sc = new Scanner(System.in);
		int [] array = new int[5];
		int num0,num1,num2,num3,num4;
		String [] charArray = {"h","e","l","l","o"};
		System.out.print("���ڴټ����� �Է��ϼ��� : ");
		num0 = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		System.out.println("��� :"+charArray[num0]+charArray[num1]+charArray[num2]+charArray[num3]+charArray[num4]);
		System.out.print("���ڴټ����� �Է��ϼ��� : ");
		num0 = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		System.out.println("��� :"+charArray[num0]+charArray[num1]+charArray[num2]+charArray[num3]+charArray[num4]);
		System.out.print("���ڴټ����� �Է��ϼ��� : ");
		num0 = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		System.out.println("��� :"+charArray[num0]+charArray[num1]+charArray[num2]+charArray[num3]+charArray[num4]);
		
	}

}
