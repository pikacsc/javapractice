
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
	  
	  
	  System.out.println("국어 점수를 입력하세요:");
	  a = sc.nextInt();
	  System.out.println("영어 점수를 입력하세요:");
	  b = sc.nextInt();
	  System.out.println("수학 점수를 입력하세요:");
	  c = sc.nextInt();
	  System.out.println("");
	  sum = a+b+c;
	  average = (float)sum/3;
	  
	  System.out.println("총점 : "+sum);	
	  System.out.println("평균 : "+average);				
	}
	
}
