package ����ó��;

import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		//����(Exception)
		//������ �߻��ϴ� ������ �����Ϸ��� �� �� ����
		//�ڹٿ����� ���� �� �߻��ϴ� ������ ���ܷ� ó��
		//try ~catch ~finally
		//�������α׷����� ���ܸ� ó������������ 
		//���ܰ� �߻��� ���α׷��� ���� ����
		try {
		Scanner sc = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		System.out.print("�������� �Է��ϼ���: ");
		divisor = sc.nextInt();
		System.out.print("�������� �Է��ϼ���: ");
		dividend = sc.nextInt();
		
		System.out.println(dividend+"��"+divisor+"�� ������ ����"+divisor/dividend+"�Դϴ�.");
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �����ϴ�");
		}finally {
			System.out.println("finally ����ƽ��ϴ�");
		}
		//����ó����
		//try-catch-fianlly��
		/*
		 * try{
		 * ���� �߻��� ���ɼ��� �ִ� ���๮(try���)
		 * }catch(ó���� ���� Ÿ�� ����){
		 *     ���� ó����(catch ���)
		 * }
		 * finally{
		 * 		���� �߻����ο� ������� ������ ����Ǵ� ����
		 * 		(��������)
		 * }
	
		 */
	}

}
