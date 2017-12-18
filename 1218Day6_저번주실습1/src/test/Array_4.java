package test;

import java.util.Scanner;

public class Array_4 {
	public static void main(String[] args) {
		//회원정보를 문자열 배열로 입력받고 출력해보세요. 이름, 주소, 직업, 나이
		String info[] = new String[4];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :");
		info[0] = sc.nextLine();
		System.out.print("주소를 입력하세요 :");
		info[1] = sc.nextLine();
		System.out.print("직업을 입력하세요 :");
		info[2] = sc.nextLine();
		System.out.print("나이를 입력하세요 :");
		info[3] = sc.nextLine();
		
		
		System.out.println("이름"+info[0]);
		System.out.println("주소"+info[1]);
		System.out.println("직업"+info[2]);
		System.out.println("나이"+info[3]);
		
	}
}
