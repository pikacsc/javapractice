package ��ü�迭;

import java.util.Scanner;

class Member{
	String name;
	String address;
	String job;
	int age;
	public void ShowInfo() {
		System.out.printf("�̸�: %s \n",name);
		System.out.printf("�ּ�: %s \n",address);
		System.out.printf("����: %s \n",job);
		System.out.printf("����: %d \n",age);
		System.out.println();
	}
}


public class InstanceArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member MemArr[] = new Member[6]; //6��, Member ��ü �迭 6��
		
		for(int i=0;i<MemArr.length;i++) { //i�� ���ư��鼭 �ϳ��� ������
			MemArr[i] = new Member();//��ü����
			System.out.println("�̸��� �Է��ϼ���: ");
			MemArr[i].name = sc.next();
			System.out.println("�ּҸ� �Է��ϼ���: ");
			MemArr[i].address = sc.next();
			System.out.println("������ �Է��ϼ���: ");
			MemArr[i].job = sc.next();
			System.out.println("���̸� �Է��ϼ���: ");
			MemArr[i].age = sc.nextInt();
			System.out.println();
		}
		
		for(int i=0;i<MemArr.length;i++) {
			MemArr[i].ShowInfo();
		}
	}

}
