package Ifelse;

public class IfTest {

	public static void main(String[] args) {
//		boolean b = true;
//		if(b) {
//			System.out.println("���Դϴ�.");
//		} else {
//			System.out.println("�����Դϴ�.");
//		} 
//		
		int i = 10;
		
		//2�� ����� �������� 0�̸� ¦���Դϴ�.
		if(i%2==0) {
			System.out.println("¦���Դϴ�.");
		} 
		
		if(i%3==0) { //3�� ������
			System.out.println("3�� ���");
		}
		
		if(i%5==0) { //5�� ������
			System.out.println("5�� ���");
		} else if (i%5==1) System.out.println("5�� ��� +1");
		else System.out.println("5�� ��� + 2Ȥ�� 3Ȥ�� 4");
		
		
		
	}

}
