package ���̳�;

import java.util.Scanner;

final class Person{//Ŭ�����տ� �ٿ��ָ� ��� �Ұ����� Ŭ������ ��

	
}

class Person2{
	final void �������̵��Ұ������������׽�Ʈ�޼ҵ�() {
		System.out.println("�� �����ǰ� �Ұ���������~ �״�� ����Ŭ������ ���µ��� �״�� ��ߵ� ������");
	}
}


public class Example extends Person2 {

	public static void main(String[] args) {
		final String name ="ȫ�浿"; //�����տ� �ٿ��ָ� ���ͷ��� �ʱ�ȭ �Ұ���
		
		//���� �������� �Ǽ��� �Է¹޾� ���� �ѷ��� ���̿� 
		//������ �Ҽ��� ��°�ڸ� ���� ����ϴ� ���α׷��� �ۼ��غ���
		float r; //������
		final float pi = 3.14f; //���̳� Ű����� ����, ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �������� �Է��ϼ���");
		r = sc.nextFloat();
		System.out.printf("���� �ѷ���: %.2f \n",(2*r)*pi);
		System.out.printf("���Ǹ���: %.2f \n",pi*(r*r));
		
		Person2 example = new Example(); //�������ε��� �ϱ����ؼ� ��ĳ������
		
		example.�������̵��Ұ������������׽�Ʈ�޼ҵ�();
		
	}
	
	
	
	
	

}
