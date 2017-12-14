package Ifelse;

import java.util.Scanner;

public class If_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		//If it rains,
		//만약 비가 온다면
		
		
		System.out.print("숫자를 입력하세요:");
		i = sc.nextInt();
		
		//i가 5보다 작거나 같으면 true
		if(i<=5) {
			//처리할 명령어들 써주기
			System.out.println("5보다 작거나 같다");
		} 
		else if(i==6) {
			System.out.println("6이닷!");
		}
		else if(i==7) {
			System.out.println("7이닷!");
		}
		else if(i>=8 && i < 10) {
			System.out.println("8이상 10미만");
		}
		
		else { //if 문만 단독 존재할경우에는 if 조건에 false 에 해당하는 경우는 코드가 실행되지 않고
			     //else 가 지정되면 모든 false또한  else에 있는 코드가 실행됨
			     //예외의 경우들을 일괄처리 가능해짐
			System.out.println("5보다 크다");
		}
			
//		
//		if(i>6) {
//			System.out.println("6보다 크다");
//		}
//		
				
	}
}
