package switch_exam;

import java.util.Scanner;

public class Switch_test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
//		switch (/* ����, ���ڿ�*/) {
//		case 0:
//			//ó���� ��� ����
//			break; //switch ������ Ż���Ѵ�
//		
//		case 1:
//			//ó���� ��� ����
//			break;
//			
//		default:
//			//������ ó���� ���� ������ ó���� ��� ����
//			break;
//		}
//		System.out.print("���ڸ� �Է��ϼ���:");
//		i = sc.nextInt();
//		switch(i*5) {
//		case 0:
//			System.out.println("i����"+i+"�Դϴ�.");
//			break;
//		case 1:
//			System.out.println("i����"+i+"�Դϴ�.");
//			break;
//		case 2:
//			System.out.println("i�� 2�Դϴ�.");
//			break;
//		case 3:
//			System.out.println("i�� 3�Դϴ�.");
//			break;
//		case 4:
//			System.out.println("i�� 4�Դϴ�.");
//			break;
//		case 5:
//			System.out.println("i�� 5�Դϴ�.");
//			break;
//		default:
//			System.out.println("i�� 0~5 ������ ���� �ƴմϴ�. �߸��Է��߽��ϴ�.");
//			break;
//		}
//		
		
		//java 1.7 ����
//		String day = "";
//		System.out.print("������ �Է��ϼ���:");
//		day = sc.nextLine();
//		
//		switch(day) {
//		case "�Ͽ���":
//			System.out.println("�Ͽ���");
//			break;
//		
//		case "������":
//			System.out.println("������");// break; �� ������ ������ �״��� case�� �ڵ嵵 ����ǹ���
//		case "ȭ����":
//			System.out.println("ȭ����");
//			break;
//		case "������":
//		case "�����":   //case �����ֱ�
//		case "�ݿ���":       
//			System.out.println("����� ���� �ϳ��Դϴ�");
//			break;
//		case "�����":
//			System.out.println("�����");
//			break;
//		}
		
		String day = "";
		System.out.println("������ �Է��ϼ��� ex)������ :");
		day = sc.nextLine();
		
		if(day.equals("�Ͽ���")) { //day =="�Ͽ���",���ʰ� ���� ���ڿ� �񱳴� ,�޸� ������ �޶� �������� ������(stack,heap), 
			//day.equals("�Ͽ���") �� �������� 
			System.out.println("sunday");
		}else if(day.equals("������")) {
			System.out.println("monday");
		}
		
		
	}

}
