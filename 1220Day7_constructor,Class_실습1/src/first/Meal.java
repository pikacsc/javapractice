package first;

import java.util.Scanner;

/*
 * 
 * 4. �¾�� ���ݱ��� ���� ���� �䰪��
    �󸶳� �Ǵ��� ��� �ϴ� ���α׷��� 
   �ۼ��ϼ���. ���̴� ����ڷκ����Է�
   �ް� �Ϸ� 3�� �Ļ縦 �ϵ� �ѳ� �Ļ�
   5õ������ ����ϼ���.
 */

public class Meal {

	public static void main(String[] args) {
		int age = 0;
		Meal m = new Meal();
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� :");
		age = sc.nextInt();
		System.out.printf("�¾�� ���ݱ��� �������� �䰪�� %d�� �Դϴ�",m.mealCalculator(age));;
	}
	long mealCalculator(int age) {
		int meal = 5000;
		long �䰪=0;
		�䰪=(meal*(age*365)*3l);
		return �䰪;
	}
}
