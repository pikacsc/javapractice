package 연산자와클래스;

import java.util.Scanner;

class Calc {
	void calculation(int a,int b) {
		for(int i=0;i<4;i++) {
		int c;
			switch(i) {
			case 0:
				c= a+b;
				print(0,c);
				break;
			case 1:
				c= a-b;
				print(1,c);
				break;
			case 2:
				c= a*b;
				print(2,c);
				break;
			case 3:
				c= a/b;
				print(3,c);
				break;
			default:
				break;
			}
		}
	}
	
	void print(int i,int c) {
		
		switch(i){
			case 0:
			System.out.printf("a + b = %d \n",c);
			case 1:
				System.out.printf("a - b = %d \n",c);
			case 2:
				System.out.printf("a * b = %d \n",c);
			case 3:
				System.out.printf("a / b = %d \n",c);
				
		}
	}
}

public class OperatorEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc cal = new Calc();
		System.out.print("숫자 2개를 띄어쓰기를 사용하여 한번에 입력하세요 a b :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		cal.calculation(a, b);
		
	}

}
