package Ifelse;

import java.util.Scanner;

public class If_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		//If it rains,
		//���� �� �´ٸ�
		
		
		System.out.print("���ڸ� �Է��ϼ���:");
		i = sc.nextInt();
		
		//i�� 5���� �۰ų� ������ true
		if(i<=5) {
			//ó���� ��ɾ�� ���ֱ�
			System.out.println("5���� �۰ų� ����");
		} 
		else if(i==6) {
			System.out.println("6�̴�!");
		}
		else if(i==7) {
			System.out.println("7�̴�!");
		}
		else if(i>=8 && i < 10) {
			System.out.println("8�̻� 10�̸�");
		}
		
		else { //if ���� �ܵ� �����Ұ�쿡�� if ���ǿ� false �� �ش��ϴ� ���� �ڵ尡 ������� �ʰ�
			     //else �� �����Ǹ� ��� false����  else�� �ִ� �ڵ尡 �����
			     //������ ������ �ϰ�ó�� ��������
			System.out.println("5���� ũ��");
		}
			
//		
//		if(i>6) {
//			System.out.println("6���� ũ��");
//		}
//		
				
	}
}
