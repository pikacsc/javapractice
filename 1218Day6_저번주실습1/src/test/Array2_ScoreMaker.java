package test;

import java.util.Scanner;

public class Array2_ScoreMaker {

	public static void main(String[] args) {
		//2. ����, ����, ���� ������ �迭�� �Է¹޾Ƽ� ����� �Ҽ��� 2�ڸ� ���� ���ؼ� ����Ͻÿ�.
		int student[] = new int[3];
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ��� : ");
		student[0] = input.nextInt();
		System.out.println("���������� �Է��ϼ��� : ");
		student[1] = input.nextInt();
		System.out.println("���������� �Է��ϼ��� : ");
		student[2] = input.nextInt();
		
		float fAvg = (float)(student[0]+student[1]+student[1])/student.length;
		
		System.out.printf("��� : %.2f", fAvg);
		
	}

}
