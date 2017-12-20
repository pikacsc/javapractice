package second;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Member 홍길동 = new Member();
		main.input(홍길동);
		홍길동.printData();
	}
	
	void input(Member x) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요:");
		x.name = sc.nextLine();
		
		System.out.print("주소를 입력하세요:");
		x.address = sc.nextLine();
		
		System.out.print("직업을 입력하세요:");
		x.job = sc.nextLine();
		
		System.out.print("나이를 입력하세요:");
		x.age = sc.nextInt();
		
	}
	
	
}
