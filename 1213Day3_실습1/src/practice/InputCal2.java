
package practice;

import java.util.Scanner;

public class InputCal2 {

	public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  int sum = 0;
	  float average = 0;
	  int a = 0;
	  int b = 0;
	  int c = 0;
	  
//	  
//	  System.out.println("���� ������ �Է��ϼ���:");
//	  a = sc.nextInt();
//	  System.out.println("���� ������ �Է��ϼ���:");
//	  b = sc.nextInt();
//	  System.out.println("���� ������ �Է��ϼ���:");
//	  c = sc.nextInt();
//	  System.out.println("");
//	  sum = a+b+c;
//	  average = (float)sum/3;
	  
	  /*
	   * 
	   * Ǯ�̡�
	   * �ذ� ���� �Ұ�� �ѹ��� 3���� �� �Է½�ų�� ����
	   * 
	   * 
	   */
	  
	  
	  System.out.print("���� ���� ����: ");
	  a = sc.nextInt();  //1��° �Է� �ϰ� ���� �Ǵ� ����
	  b = sc.nextInt();  //2��° �Է�            ''
	  c = sc.nextInt();  //3��° �Է�            ''
	  
	  System.out.println("����: "+a+", ����: "+b+", ����: "+c);
	  
	  sum = a+b+c;
	  average = sum/3f; // 3���� ��ü�� float Ÿ������ �ؼ� �����Ҷ� �ڵ����� float type���� ����ȯ
	  System.out.println("���� : "+sum);	
	  System.out.println("��� : "+average);				
	}
	
}
