package 입력;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		
		//ctrl + shift + O  자동 객체 import 단축키 
		Scanner sc = new Scanner(System.in);
		
		int age = 0;

		System.out.println("나이를 입력하세요");
		
		age = sc.nextInt();
		
		System.out.println("당신의 나이는 "+ age + "세 입니다"); //입력을 요하는 객체가 있으므로 입력할때까지 다음코드로 가지 않음
		
		
		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요:");
		
		String name = sc2.nextLine();
		
		System.out.println("당신의 이름은 "+name+" 입니다"); //Line 은 문자열을 뜻함
	}
}
