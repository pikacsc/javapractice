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
		System.out.println("���� �ΰ��� �Է��ϼ��� a b");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("�������� �ϳ��� �Է��ϼ��� + - * /:");
		op = sc2.next(); //nextInt()�� �տ��� ���ٰ� nextLine() ���� ������ �߹Ƿ� next(); �� �־���
		if(op == "+" || op == "-" || op == "*" || op == "/") {
			System.out.println("���� ����� �����ϼ��� 1.if��, 2.switch��");
			c = sc.nextInt();
			switch(c) {
				case 1:
					cal.ifLogic(op,a,b);
					break;
				case 2:
					cal.ifLogic(op,a,b);
					break;
				default:
					System.out.println("����:���� ��������Դϴ�");
					break;
			}
		} else System.out.println("����:���� ������ �Դϴ�");
	}
	
	int result;
	public void ifLogic(String op,int a, int b) {
		if(op.equals("+")) { 
			result = a+b;
			System.out.println("���: "+a+op+b+"="+result);
		}
		else if(op.equals("-")) { 
			result = a-b;
			System.out.println("���: "+a+op+b+"="+result);
		}
		else if(op.equals("*")) { 
			result = a*b;
			System.out.println("���: "+a+op+b+"="+result);
		}
		else if(op.equals("/")) { 
			result = a/b;
			System.out.println("���: "+a+op+b+"="+result);
		} else {
			System.out.println("����, ���� �������Դϴ�");
		}
	} 
	
	public void switchLogic(String op, int a, int b) {
		
		switch(op) {
		case "+":
			result = a+b;
			System.out.println("���: "+a+op+b+"="+result);
			break;
		case "-":
			result = a-b;
			System.out.println("���: "+a+op+b+"="+result);
			break;
		case "*":
			result = a*b;
			System.out.println("���: "+a+op+b+"="+result);
			break;
		case "/":
			result = a/b;
			System.out.println("���: "+a+op+b+"="+result);
			break;
		default :
			System.out.println("����, ���� �������Դϴ�.");
			break;
		}
	}
}
