package 제어문과클래스;

import java.util.Scanner;

public class ControlEx {
	public static void main(String[] args) {
		long input;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호 앞자리를 입력하세요.");
		
		String tmp = sc.nextLine(); //313145
		input = Integer.parseInt(tmp);  //문자열을 정수로 변환
		
		System.out.printf("Input : %s \n",input);
		
		
	}
}
