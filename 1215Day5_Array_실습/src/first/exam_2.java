package first;

import java.util.Scanner;

public class exam_2 {

	public static void main(String[] args) {
		//		2. ���� , ����, ���� ������ �迭�� �Է¹޾Ƽ� ����� �Ҽ���2�ڸ����� ���ؼ� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		int []score = new int[3];
		float average;
		int arraylen = score.length;
		
		System.out.print("���� ���� ���� ������ �Է��Ͻÿ�: ");
		score[0] = sc.nextInt();
		score[1] = sc.nextInt();
		score[2] = sc.nextInt();
		int sum = score[0]+score[1]+score[2];
		
		
		
		average = sum/arraylen;
		
		System.out.printf("����� [%.2f] �Դϴ� ", average);
	}

}
