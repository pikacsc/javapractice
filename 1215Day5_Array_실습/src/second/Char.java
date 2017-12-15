package second;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
//		3. 문자 배열을 이용해서 'h','e','l','l','o' 를 초기화 하세요.
//		 그 후 int형 배열 5개에 숫자를 입력 받습니다.
//		 입력은 숫자로 이어서 받습니다.
//		 하단처럼 결과가 나올수 있게 알고리즘을 작성합니다.
//		  ex)
//		숫자다섯개를 입력하세요 : 0 1 2 3 4
//		결과 : hello
//		숫자다섯개를 입력하세요 : 2 3 0 1 4
//		결과 : llheo 
//		숫자다섯개를 입력하세요 : 4 3 2 1 1
//		결과 : ollee
//		[출처] 자바 5일차 중급 문제 (NCS자바프로그래밍&게임프로그래밍) |작성자 헤이즐넛
		Scanner sc = new Scanner(System.in);
		int [] array = new int[5];
		int num0,num1,num2,num3,num4;
		String [] charArray = {"h","e","l","l","o"};
		System.out.print("숫자다섯개를 입력하세요 : ");
		num0 = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		System.out.println("결과 :"+charArray[num0]+charArray[num1]+charArray[num2]+charArray[num3]+charArray[num4]);
		System.out.print("숫자다섯개를 입력하세요 : ");
		num0 = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		System.out.println("결과 :"+charArray[num0]+charArray[num1]+charArray[num2]+charArray[num3]+charArray[num4]);
		System.out.print("숫자다섯개를 입력하세요 : ");
		num0 = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		System.out.println("결과 :"+charArray[num0]+charArray[num1]+charArray[num2]+charArray[num3]+charArray[num4]);
		
	}

}
