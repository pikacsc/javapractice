
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
	  
	  
	  System.out.println("���� ������ �Է��ϼ���:");
	  a = sc.nextInt();
	  System.out.println("���� ������ �Է��ϼ���:");
	  b = sc.nextInt();
	  System.out.println("���� ������ �Է��ϼ���:");
	  c = sc.nextInt();
	  System.out.println("");
	  sum = a+b+c;
	  average = (float)sum/3;
	  
	  System.out.println("���� : "+sum);	
	  System.out.println("��� : "+average);				
	}
	
}
