package second;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
//		1.������ ������ �迭�� �Է¹޾Ƽ� ū���� ����Ͻÿ�.
//		2.������ ������ �迭�� �Է¹޾Ƽ� �������� ����Ͻÿ�.
//		[��ó] �ڹ� 5���� �߱� ���� (NCS�ڹ����α׷���&�������α׷���) |�ۼ��� �������
//

		Scanner sc = new Scanner(System.in);
		int numb[] = new int[3];
		int maxResult;
		int miniResult;
		
		System.out.print("������ ���ڸ� ���⸦ ����Ͽ� �ѹ��� �Է��Ͻÿ� ex)90 80 100 :");
		numb[0] = sc.nextInt();
		numb[1] = sc.nextInt();
		numb[2] = sc.nextInt();
		
		maxResult = numb[0] < numb[1] ?  numb[1] < numb[2] ? numb[2] : numb[1] : numb[0] < numb[2]? numb[2] : numb[0] ;  
		miniResult = numb[0] > numb[1] ?  numb[1] > numb[2] ? numb[2] : numb[1] : numb[0] > numb[2]? numb[2] : numb[0] ;  
		
		System.out.println("ū���� "+maxResult);
		System.out.println("�������� "+miniResult);
		
	}

}
