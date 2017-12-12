package 변수2;

import java.util.Scanner;


public class Student {

	public static void main(String[] args) {
		Student std = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("12.12일 실습들 보기");
		System.out.println("1.주내용보기");
		System.out.println("2.실습1");
		System.out.println("3.실습2");
		
		System.out.println("번호를 입력하세요");
		
		int inputNumb;
		inputNumb = scan.nextInt();
		switch(inputNumb) {
		
		case 1: std.주내용보기();
		break;
		
		case 2: std.실습1();
		break;
		
		case 3: std.실습2();
		break;
		}

		
	}
	
	public void mainMenu() {
		

	}
	
    public void 주내용보기() {
    	
		System.out.println("int a; 변수 만들기/n"
				+ "\r\n" + 
				"		a = 1;\r\n" + 
				"		System.out.println(a);\r\n" + 
				"		\r\n" + 
				"		a = 10; //a의 값을 10으로 수정, 자동으로 1은 사라짐\r\n" + 
				"		\r\n" + 
				"		System.out.println(a);\r\n" + 
				"		\r\n" + 
				"		System.out.println(\"당신의 동전은 \"+a+\"원입니다\");\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"		String b = \"당신의 동전은\";\r\n" + 
				"		\r\n" + 
				"		System.out.println(b);\r\n" + 
				"		\r\n" + 
				"		b = \"\"; //초기화\r\n" + 
				"		\r\n" + 
				"		b = \"원 입니다\";\r\n" + 
				"		\r\n" + 
				"		System.out.println(a+b);\r\n" + 
				"		//문자열 변수에 할당하여 출력\r\n" + 
				"		");

		
	}
	
	public void 실습1() {

		
		System.out.println("/* 실습\r\n" + 
				"		 *\r\n" + 
				"		 * 이름: 홍길동 \r\n" + 
				"		 * 나이: 28\r\n" + 
				"		 * 키 : 173.9\r\n" + 
				"		 * 성별 : 남자\r\n" + 
				"		 * 직업: 회사원\r\n" + 
				"		 *\r\n" + 
				"		 * 왼쪽은 print 오른쪽은 변수로 지정하기\r\n" + 
				"		 * \r\n" + 
				"		 */\r\n" + 
				"		");
		
		
		String name = "홍길동";
		int age = 28;
		float height = 173.9f;
		String gender = "남자";
		String work = "회사원";
		
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		System.out.println("키: "+ height);
		System.out.println("성별: "+ gender);
		System.out.println("직업: "+ work);
				

	}
	
	public void 실습2() {
	
		/*
		 * 실습 2
		 * 
		 * 문자열 변수 로 지정
		 * "Hello"
		 * "Java"
		 * "Nice to meet you"
		 * "Bye"
		 * 
		 * 
		 * 출력문에 변수만 사용해서 출력하기
		 * 1.Hello Java Nice to meet you bye
		 * 
		 * 2. Hello
		 *    Java
		 *    Nice to meet you
		 *    Bye
		 * 
		 * 
		 * 
		 */
		
		String a,b,c,d;
		a ="Hello ";
		b ="Java ";
		c ="Nice to meet you";
		d ="bye";
		
		System.out.println("1."+ a + b + c + d);
		System.out.println("");
		System.out.println("2."+a);
		System.out.println("  "+b);
		System.out.println("  "+c);
		System.out.println("  "+d);

	}
	

}
