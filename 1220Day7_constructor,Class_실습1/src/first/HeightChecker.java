package first;

/*
 * 
 * 3. Ű�� ��Ƽ���� ������ �Է��ϼ���.
   ��� Ű�� m  cm �̽ñ���.
   �Է� ���� ) 173
   1m 73cm
[��ó] 8���� ���� (NCS�ڹ����α׷���&�������α׷���) |�ۼ��� �������
 */
import java.util.Scanner;

public class HeightChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HeightChecker hc = new HeightChecker();
		System.out.print("Ű�� ��Ƽ���� ������ �Է��ϼ���:");
		int x = sc.nextInt();
		hc.printHeight(x);
	}
	
	void printHeight(int x) {
		String y = x +"";
		char a = y.charAt(0);
		char b = y.charAt(1);
		char c = y.charAt(2);
		 System.out.printf("��� Ű��  %c m %c%c cm �̽ñ���.",a,b,c);
	}

}
