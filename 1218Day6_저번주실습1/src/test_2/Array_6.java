package test_2;

import java.util.Scanner;

public class Array_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Max[] = new int[3];
		System.out.println("���ڸ� �Է��ϼ��� : ");
		Max[0] = sc.nextInt();
		Max[1] = sc.nextInt();
		Max[2] = sc.nextInt();
		
		
		//Max[0],Max[1],Max[2] ���߿� ū���� �߷����� ����
		if(Max[0] > Max[1]) 
		{
		    //Max[0]�� ū���
			if(Max[0]>Max[2])
			{
				System.out.println("Max[0]�� ���� Ů�ϴ�."+Max[0]);
			}		
			else {
				System.out.println("Max[2]�� ���� Ů�ϴ�."+Max[2]);
			}
		}
		else //Max[1]
		{
			if(Max[1] > Max[2])
			{
				System.out.println("Max[1]�� ���� Ů�ϴ�."+Max[1]);
			}
			else
			{
				System.out.println("Max[2]�� ���� Ů�ϴ�."+Max[2]);
			}
		}
		
	}

}
