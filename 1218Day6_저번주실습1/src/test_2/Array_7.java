package test_2;

import java.util.Scanner;

public class Array_7 {

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
		char str[] = {'h','e','l','l','o'}; //���ڹ迭 �ʱ�ȭ
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ټ����� �Է��ϼ��� 0~4 ������ :");
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		              //���ڿ�ȭ ��Ű�� , ���ڿ�+����
		System.out.println(""+str[arr[0]]+str[arr[1]]+str[arr[2]]+str[arr[3]]+str[arr[4]]);
	}

}
