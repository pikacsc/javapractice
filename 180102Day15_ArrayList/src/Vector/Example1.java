package Vector;

import java.util.Scanner;
import java.util.Vector;

public class Example1 {
	Scanner sc = new Scanner(System.in);
	
	public Example1() {
		Vector<Integer> vInteger = new Vector<Integer>();
		for(int i=0;i<4;i++) {
			System.out.print("������ �Է��ϼ���");
			vInteger.add(sc.nextInt());
		}
		printElement(vInteger);
		setElement(vInteger);
		printElement(vInteger);
		System.out.println("������"+sum(vInteger));
	}
	
	void setElement(Vector<Integer> x) {
		System.out.print("���Ϳ��� ������ ������ �ε����� element�� �Է��Ͻÿ�");
		int index = sc.nextInt();
		int element = sc.nextInt();
		x.set(index, element);
	}
	
	void printElement(Vector<Integer> x) {
		for(int i=0;i<x.size();i++) {
			System.out.println(i+"��° element : "+x.get(i));
		}
		
	}
	
	int sum(Vector<Integer> x) {
		int sum=0;
		for(int i=0;i<x.size();i++) {
			sum += x.get(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//���� 3�� ����
		//���� ���� �ٷ�� ���׸� ���� ����
		//���� �߰��� �����ϱ�
		//��� ��� ���� ����ϱ�
		//���� ���� ��� ���� ���ϱ�
		//���
		new Example1();
	}

}
