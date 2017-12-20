package 연산자와클래스;

import java.util.Scanner;

public class OperatorEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		
		
		System.out.println("문자를 하나 입력하세요.>");
		
		String input = sc.nextLine();
		ch = input.charAt(0); //입력된 문자열에서 0번째 문자 가져오기
			
		System.out.printf("문자 : %c", ch);
	}

}
