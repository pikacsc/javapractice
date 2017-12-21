package 예외처리;

import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		//예외(Exception)
		//실행중 발생하는 에러는 컴파일러가 알 수 없음
		//자바에서는 실행 중 발생하는 에러를 예외로 처리
		//try ~catch ~finally
		//응용프로그램에서 예외를 처리하지않으면 
		//예외가 발생한 프로그램은 강제 종료
		try {
		Scanner sc = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		System.out.print("나뉨수를 입력하세요: ");
		divisor = sc.nextInt();
		System.out.print("나눗수를 입력하세요: ");
		dividend = sc.nextInt();
		
		System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+divisor/dividend+"입니다.");
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없습니다");
		}finally {
			System.out.println("finally 실행됐습니다");
		}
		//예외처리문
		//try-catch-fianlly문
		/*
		 * try{
		 * 예외 발생할 가능성이 있는 실행문(try블록)
		 * }catch(처리할 예외 타입 선언){
		 *     예외 처리문(catch 블록)
		 * }
		 * finally{
		 * 		예외 발생여부와 상관없이 무조건 실행되는 문장
		 * 		(생략가능)
		 * }
	
		 */
	}

}
