package test;

import java.util.Scanner;

public class Test6 {
	public static void main(String[]args) {
		/*
		 * 숫자하나늘 입력을 받아서 
		 * 삼항 연산자를 사용해서 
		 * 홀인지 짝인지 판별
		 * 짝이면 true 짝입니다
		 * false 홀입니다
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String result;
		int numb= 0;
		System.out.print("숫자를 입력하세요:");
		numb = sc.nextInt();
		
		
		result = (numb%2==0)? "짝입니다 true":"홀입니다 false";
		
		System.out.println(result);
	}

}
