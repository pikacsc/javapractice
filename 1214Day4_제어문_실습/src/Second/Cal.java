package Second;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		int a,b;
		String op;
		int c;
		Cal cal = new Cal();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하세요 a b");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("연산자중 하나를 입력하세요 + - * /:");
		op = sc2.next(); //nextInt()를 앞에서 쓰다가 nextLine() 쓰면 오류가 뜨므로 next(); 로 넣어줌
		if(op == "+" || op == "-" || op == "*" || op == "/") {
			System.out.println("구현 방법을 선택하세요 1.if문, 2.switch문");
			c = sc.nextInt();
			switch(c) {
				case 1:
					cal.ifLogic(op,a,b);
					break;
				case 2:
					cal.ifLogic(op,a,b);
					break;
				default:
					System.out.println("오류:없는 구현방법입니다");
					break;
			}
		} else System.out.println("오류:없는 연산자 입니다");
	}
	
	int result;
	public void ifLogic(String op,int a, int b) {
		if(op.equals("+")) { 
			result = a+b;
			System.out.println("출력: "+a+op+b+"="+result);
		}
		else if(op.equals("-")) { 
			result = a-b;
			System.out.println("출력: "+a+op+b+"="+result);
		}
		else if(op.equals("*")) { 
			result = a*b;
			System.out.println("출력: "+a+op+b+"="+result);
		}
		else if(op.equals("/")) { 
			result = a/b;
			System.out.println("출력: "+a+op+b+"="+result);
		} else {
			System.out.println("오류, 없는 연산자입니다");
		}
	} 
	
	public void switchLogic(String op, int a, int b) {
		
		switch(op) {
		case "+":
			result = a+b;
			System.out.println("출력: "+a+op+b+"="+result);
			break;
		case "-":
			result = a-b;
			System.out.println("출력: "+a+op+b+"="+result);
			break;
		case "*":
			result = a*b;
			System.out.println("출력: "+a+op+b+"="+result);
			break;
		case "/":
			result = a/b;
			System.out.println("출력: "+a+op+b+"="+result);
			break;
		default :
			System.out.println("오류, 없는 연산자입니다.");
			break;
		}
	}
}
