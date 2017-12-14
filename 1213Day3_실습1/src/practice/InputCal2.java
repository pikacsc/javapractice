
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
//	  System.out.println("국어 점수를 입력하세요:");
//	  a = sc.nextInt();
//	  System.out.println("영어 점수를 입력하세요:");
//	  b = sc.nextInt();
//	  System.out.println("수학 점수를 입력하세요:");
//	  c = sc.nextInt();
//	  System.out.println("");
//	  sum = a+b+c;
//	  average = (float)sum/3;
	  
	  /*
	   * 
	   * 풀이↓
	   * 밑과 같이 할경우 한번에 3개를 다 입력시킬수 있음
	   * 
	   * 
	   */
	  
	  
	  System.out.print("국어 영어 수학: ");
	  a = sc.nextInt();  //1번째 입력 하고 띄어쓰기 또는 엔터
	  b = sc.nextInt();  //2번째 입력            ''
	  c = sc.nextInt();  //3번째 입력            ''
	  
	  System.out.println("국어: "+a+", 영어: "+b+", 수학: "+c);
	  
	  sum = a+b+c;
	  average = sum/3f; // 3숫자 자체를 float 타입으로 해서 연산할때 자동으로 float type으로 형변환
	  System.out.println("총점 : "+sum);	
	  System.out.println("평균 : "+average);				
	}
	
}
