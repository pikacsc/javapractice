package ������;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Main2 m = new Main2();
	    ������ ���׵�[];
		���׵� = m.inputData();
		
	}
	
	������ inputData() {
		Scanner sc = new Scanner(System.in);
		int ���װ���;
		System.out.print("�Է��� ���� ���� ������ �Է��ϼ��� :");
		���װ��� = sc.nextInt();
		������ ���׵�[] = new ������[���װ���];
		
		for(int i=0;i<���׵�.length;i++) {
			System.out.printf("%d ��° �����̸��� �Է��ϼ���: \n",i+1);
			���׵�[i].name = sc.next();
			System.out.println("������ �Է��ϼ���: ");
			���׵�[i].price = sc.nextInt();
			System.out.println("�뷮�� �Է��ϼ���: ");
			���׵�[i].weight = sc.nextInt();
			System.out.println("�ϻ��� 1.�ѱ� 2.�߱�: ");
			���׵�[i].madein = sc.nextByte();
			System.out.println();
		}
		return ���׵�[���װ���];
	}
	
	void printData(������  ���׵�[]) {
		for(int i=0;i<���׵�.length;i++) {
			String name = ���׵�[i].getName();
			int price = ���׵�[i].getPrice(); //4000
			int weight = ���׵�[i].getWeight();
			System.out.println(i+"��° ����:"+name);
			System.out.println("����:"+price);
			System.out.println("�뷮:"+weight);
			if(���׵�[i].getMadein()==1) {
				System.out.println("�ѱ���");
			}else {
				System.out.println("�߱���");
			}
			System.out.println();
			
		}
	}

}
