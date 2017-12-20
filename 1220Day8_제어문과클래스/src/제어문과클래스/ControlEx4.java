package 제어문과클래스;

import java.util.Scanner;

public class ControlEx4 {
	public static void main(String[] args) {
		int user, com;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위(1),바위(2),보(3) 중에 하나를 입력하세요:");
		String tmp = sc.nextLine();
		user = Integer.parseInt(tmp); //문자열을 정수로 변환
		
		com = (int)(Math.random()*3)+1; //1,2,3중 하나가 com에 저장
		
		System.out.printf("당신은 %d 입니다. \n", user);
		System.out.printf("컴퓨터는 %d 입니다. \n", com);
		
		switch(user-com) {
		case 0:
			System.out.println("비겼네요");
			break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다");
			break;
		case -1:
		case 2:
			System.out.println("당신은 졌습니다.");
			break;
		
		}
		
		
	}
	void print(int user,int com) {
		if(user==0) 
	}
}
