package ������;

import java.util.Scanner;


public class Main {
	public static void main(String []args) {
									//[�÷�][�����̸�]
		Scanner sc2 = new Scanner(System.in);
		String �������̺�[][] = new String[4][6];
		Main m = new Main();
		int i = 0;
		������ test = new ������();
		//�������̺�[0][0] = �̸� = x.name
		//�������̺�[1][0] = ���� = x.price
		//�������̺�[2][0] = �뷮 = x.weight
		//�������̺�[3][0] = �������� = x.madein
			
		
		for(int y=0;y<6;y++) {
			for(int x=0;x<4;x++) {
				switch(x) {
				case 0:
					System.out.printf("\n %d��° �������� �̸��� �Է��ϼ���: ",y);
					�������̺�[x][y] = sc2.next();
					break;
				case 1:
					System.out.printf("�������� ������ �Է��ϼ���: ");
					�������̺�[x][y] = ""+sc2.nextInt();
					break;
				case 2:
					System.out.printf("�������� �뷮(g)�� �Է��ϼ��� ,��������: ");
					�������̺�[x][y] = ""+sc2.nextInt(); 
					break;
				case 3:
					System.out.printf("������ �������� �´� ��ȣ�� �Է��ϼ��� "
							+ "1.�ѱ�"
							+ "2.�߱�"
							+ ": ");
					test.madein = sc2.nextByte(); 
					if(test.madein==1) {
						�������̺�[x][y]="�ѱ�";
						break;
					}else {
						�������̺�[x][y]="�߱�";
						break;
					}
				}
			}
		}
		
		m.printData(�������̺�);
	}
	
//	void inputData(������ x) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�������� �̸��� �Է��ϼ���: ");
//		x.name = sc.next(); 
//		
//		System.out.print("�������� ������ �Է��ϼ���: ");
//		x.price = sc.nextInt(); 
//		
//		System.out.print("�������� �뷮(g)�� �Է��ϼ��� ,��������: ");
//		x.weight = sc.nextInt(); 
//
//		System.out.print("������ �������� �´� ��ȣ�� �Է��ϼ��� "
//				+ "1.�ѱ�"
//				+ "2.�߱�"
//				+ ": ");
//		x.madein = sc.nextByte(); 
//	}
//	
	void printData(String[][] �������̺�) {
		for(int y=0;y<6;y++) {
			for(int x=0;x<4;x++)
				switch(x) {
				case 0:
					System.out.printf("\n %d��° ������ �̸�: %s \n",y,�������̺�[x][y]);
					break;
				case 1:
					System.out.printf("����: %s \n",y,�������̺�[x][y]);
					break;
				case 2:
					System.out.printf("�뷮: %s \n",y,�������̺�[x][y]);
					break;				
				case 3:
					if(�������̺�[x][y].equals("�ѱ�")) {
						System.out.println("������ �ѱ�");
						break;
					}else {
						System.out.println("������ �߱�");
						break;  
					}
				}
		}
	}

}
